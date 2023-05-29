package dbconnect.main.java.model;

public class Linea {
	private int id;
    private String codigo;
    private String nombreProducto;
    private int idPedido;
    private int cantidad;
    private double precio;
    private Pedido pedido;

    public Linea(String codigo, String nombreProducto, int idPedido, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.idPedido = idPedido;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public Linea(String codigo, String nombreProducto, Pedido pedido, int cantidad, double precio) {
         this.codigo = codigo;
         this.nombreProducto = nombreProducto;
         this.idPedido = pedido.getId();
         this.cantidad = cantidad;
         this.precio = precio;
     }
    public Linea(int id, String codigo, String nombreProducto, int idPedido, int cantidad, double precio) {
    	this(codigo, nombreProducto, idPedido, cantidad, precio );
        this.id = id;
    }

 
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Linea [codigo=" + codigo + ", nombreProducto=" + nombreProducto + ", idPedido=" + idPedido
                + ", cantidad=" + cantidad + ", precio=" + precio + "]";
    }

}
