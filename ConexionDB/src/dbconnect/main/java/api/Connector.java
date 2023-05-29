package dbconnect.main.java.api;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import dbconnect.main.java.model.Cliente;
import dbconnect.main.java.model.Linea;
import dbconnect.main.java.model.Pedido;

public class Connector {
	
	
	private static String USER;
	private final static String DB_USER_KEY="db.user";

	private static String PASS;
	private final static String DB_PASS_KEY="db.pass";
	
	private static String JDBC_URL;
	private final static String DB_URL_KEY="db.url";
	
	private final static String PROPERTIES_URI = "./resources/db.properties";
	
	
	
	/*
	 * Este es el constructor de la clase. Llama al metodo loadProperties() 
	 * para cargar las propiedades de conexión a la base de datos.
	 */
	public Connector() {
		super();
		loadProperties();
	}
	

	/**
	 * Este metodo carga las propiedades de conexion a la base de datos desde un archivo de propiedades.
	 */
	public void loadProperties() {
		try {
			Properties properties = new Properties();
			properties.load(new FileReader(PROPERTIES_URI));
			USER = properties.getProperty(DB_USER_KEY);
			PASS = properties.getProperty(DB_PASS_KEY);
			JDBC_URL = properties.getProperty(DB_URL_KEY);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * Este metodo establece una conexión con la base de datos y devuelve un objeto Statement 
	 * que se puede utilizar para ejecutar consultas SQL.
	 * @throws ClassNotFoundException 
	 */
	public Statement connect() throws SQLException, ClassNotFoundException {
		
		

		Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASS); 
	    return connection.createStatement();
		

	}
	
	
	/**
	 * Este metodo agrega un nuevo registro en la tabla Cliente utilizando una consulta INSERT.
	 *  Toma un objeto Cliente como parametro y utiliza sus valores para insertar un nuevo registro 
	 *  en la base de datos.
	 *  @param cliente
	 * @throws ClassNotFoundException 
	 * 
	 */
	public void agregarCliente(Cliente cliente) throws SQLException, ClassNotFoundException {
		Statement statement = connect();
			    
		PreparedStatement ps = statement.getConnection().prepareStatement("INSERT INTO Cliente (nombre, apellido, email, fechaNacimiento, genero) "
				+ " VALUES (?, ?, ?, ?, ?)");
	    ps.setString(1, cliente.getNombre());
	    ps.setString(2, cliente.getApellidos());
	    ps.setString(3, cliente.getEmail());
	    ps.setString(4, cliente.getFechaNacimiento());
	    ps.setString(5, cliente.getGenero().toString());

	   
	    
	    int filasAfectadas  = ps.executeUpdate();

	    if (filasAfectadas  > 0) {
	        ResultSet rs = ps.getGeneratedKeys();
	        if (rs.next()) {
	            int idGenerado = rs.getInt(1);
	            System.out.println("El ID generado para el nuevo registro es: " + idGenerado);
	            cliente.setId(idGenerado);
	        }
	    }

	    ps.close();
	    statement.getConnection().close();
	}
	
	/**
	 *Este metodo actualiza un registro existente en la tabla Cliente utilizando una consulta UPDATE.
	 *@param cliente
	 * @throws ClassNotFoundException 
	 * 
	 */
	public void actualizarClienteExistente(Cliente cliente) throws SQLException, ClassNotFoundException {
		Statement statement = connect();
	    
	    PreparedStatement ps = statement.getConnection().prepareStatement("UPDATE Cliente SET nombre=?, apellido=?, fechaNacimiento=?, "
	    		+ "genero=? WHERE email=?");
	    ps.setString(1, cliente.getNombre());
	    ps.setString(2, cliente.getApellidos());
	    ps.setString(3, cliente.getEmail());
	    ps.setString(4, cliente.getFechaNacimiento());
	    ps.setString(5, cliente.getGenero().toString());

	    ps.executeUpdate();

	    ps.close();
	    statement.getConnection().close();
	    
	    
	}
	
	/**
	 *  Elimina un registro de la tabla Cliente utilizando una consulta DELETE. 
	 *  @param nombre
	 *  @param apellidos
	 * @throws ClassNotFoundException 
	 * 
	 */
	public void eliminarCliente(String nombre, String apellidos) throws SQLException, ClassNotFoundException {
		Statement statement = connect();
	    
		PreparedStatement ps = statement.getConnection().prepareStatement("DELETE FROM Cliente WHERE nombre=? AND apellidos=?");
	    ps.setString(1, nombre);
	    ps.setString(2, apellidos);

	    ps.executeUpdate();

	    ps.close();
	    statement.getConnection().close();
	}
	
	/**
	 * Agrega un nuevo registro en la tabla Pedido utilizando una consulta INSERT
	 * @param pedido
	 * @throws ClassNotFoundException 
	 */
	public void annadirPedido(Pedido pedido) throws SQLException, ClassNotFoundException {
		Statement statement = connect();
	    
		PreparedStatement ps = statement.getConnection().prepareStatement("INSERT INTO Pedido (codigo, status, idCliente) VALUES (?, ?, ?)");
	    ps.setString(1, pedido.getCodigo());
	    ps.setString(2, pedido.getStatus());
	    ps.setInt(3, pedido.getIdCliente());
	    ps.executeUpdate();
	    ps.close();
	    statement.getConnection().close();
	}
	
	/**
	 *  Este metodo agrega una nueva linea a un pedido existente en estado PROCESANDO
	 *   utilizando una consulta INSERT.
	 *   @param idPedido
	 *   @param linea
	 *   @throws ClassNotFoundException 
	 */
	public void incluirLineasPedido(int idPedido, Linea linea) throws SQLException, ClassNotFoundException {
		Statement statement = connect();
	    
		PreparedStatement ps = statement.getConnection().prepareStatement("select p.id from Pedido p where p.id = ? and p.status = 'PROCESANDO';");
	    int incluido = 0;
		//int idPedidoObtenido=0;
		
	    /*establece el valor del primer parámetro en la consulta preparada ps con el valor de idPedido. 
	     * Esto se utiliza para realizar una búsqueda en la tabla Pedido basada en el ID del pedido.
	     */
	    ps.setInt(1, idPedido);
	    
	    /*ejecuta la consulta preparada y obtiene el conjunto de resultados en un objeto ResultSet llamado rs. 
	     * El ResultSet contiene los resultados de la consulta, en este caso, la fila o filas correspondientes 
	     * al ID del pedido proporcionado.
	     */

	    ResultSet rs = ps.executeQuery();
	    
	    /* comprueba si hay al menos una fila en el conjunto de resultados rs.
	     * El método next() mueve el cursor al siguiente elemento y devuelve true si hay mas filas, o false
	     * si no hay más filas. En este caso, se utiliza para verificar si se encontró 
	     * un pedido existente en estado Procesando con el ID proporcionado.
	     */
	    
	    if (rs.next()) {
	        int idPedidoObtenido = rs.getInt(1);
	        ps = statement.getConnection().prepareStatement("INSERT INTO Linea (codigo, nombreProducto, idPedido, cantidad, precio) VALUES (?, ?, ?, ?, ?)");
	        ps.setString(1, linea.getCodigo());
	        ps.setString(2, linea.getNombreProducto());
	        ps.setInt(3, idPedidoObtenido); 
	        ps.setInt(4, linea.getCantidad());
	        ps.setDouble(5, linea.getPrecio());
	        ps.executeUpdate();
	    }
	    
	    ps.close();
	    statement.getConnection().close();
	   
	}
	
	/**
	 * Este metodo devuelve una cadena que contiene información sobre todos los clientes 
	 * en la base de datos. Utiliza una consulta SELECT
	 * @return
	 * String.
	 * @throws ClassNotFoundException 
	 */
	public String mostrarInformacionClientes() throws SQLException, ClassNotFoundException {
		Statement statement = connect();
	    
		PreparedStatement ps = statement.getConnection().prepareStatement("SELECT id, nombre, apellido, email, TIMESTAMPDIFF(YEAR, fechaNacimiento, CURDATE()) AS edad, genero FROM Cliente");
	    ResultSet rs = ps.executeQuery();
	    
	    StringBuilder sb = new StringBuilder();
	    sb.append("Id\tNombre\tApellidos\temail\t\t\tEdad\tGénero\n");
	    
	    while (rs.next()) {
	    	int id= rs.getInt("id");
	        String nombre = rs.getString("nombre");
	        String apellido = rs.getString("apellido");
	        String email = rs.getString("email");
	        int edad = rs.getInt("edad");
	        String genero = rs.getString("genero");
	        
	        sb.append(id).append("\t").append(nombre).append("\t").append(apellido).append("\t\t").append(email).append("\t").append(edad).append("\t").append(genero).append("\n");
	    }
	    
	    ps.close();
	    statement.getConnection().close();
	    
	    return sb.toString();
	}
	
	/**
	 * Este metodo muestra la información sobre pedidos ordenados por importe decreciente.
	 * @return
	 * String
	 * @throws ClassNotFoundException 
	 */
	public String mostrarPedidosPorImporteDecreciente() throws SQLException, ClassNotFoundException {
		Statement statement = connect();
	    
		PreparedStatement ps = statement.getConnection().prepareStatement(
	        "SELECT p.codigo, p.status, CONCAT(c.nombre, ' ', c.apellido) AS nombreCompleto, " +
	        "COUNT(l.id) AS numProductos, SUM(l.precio) AS importe " +
	        "FROM Pedido p " +
	        "JOIN Cliente c ON p.idCliente = c.id " +
	        "JOIN Linea l ON p.id = l.idPedido " +
	        "GROUP BY p.codigo, p.status, nombreCompleto " +
	        "ORDER BY importe DESC"
	    );
	    ResultSet rs = ps.executeQuery();

	    StringBuilder sb = new StringBuilder();
	    sb.append("Codigo\tStatus\t\tNombre Completo Cliente\tNº productos\tImporte\n");

	    if (rs.next()) {
	        String codigo = rs.getString("codigo");
	        String status = rs.getString("status");
	        String nombreCompleto = rs.getString("nombreCompleto");
	        int numProductos = rs.getInt("numProductos");
	        double importe = rs.getDouble("importe");

	        sb.append(codigo).append("\t").append(status).append("\t\t").append(nombreCompleto).append("\t\t")
	            .append(numProductos).append("\t\t").append(importe).append("\n");
	    }

	    ps.close();
	    statement.getConnection().close();

	    return sb.toString();
	}


}
