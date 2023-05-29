package dbconnect.main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int id;
	private String codigo;
	private String status;
	private int idCliente;
	private Cliente cliente;
	private List<Linea> lineasPedido;
	
    public Pedido(String codigo, String status, int idCliente) {
        this.codigo = codigo;
        this.status = status;
        this.idCliente=idCliente;
        this.lineasPedido = new ArrayList<Linea>();
    }
    public Pedido(String codigo, String status, Cliente cliente) {
        this.codigo = codigo;
        this.status = status;
        this.cliente = cliente;
        this.idCliente = cliente.getId();
    }
    public Pedido(int id, String codigo, String status, int idCliente) {
    	this(codigo, status, idCliente);
        this.id = id;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	/*El método setCliente se utiliza para asignar un objeto Cliente a un objeto Pedido.
	 *  Al asignar un objeto Cliente, también se puede actualizar el valor de idCliente para
	 *   asegurarse de que sea consistente con el objeto Cliente asociado. Esto puede ser útil si deseas
	 *  cambiar el objeto Cliente asociado con un objeto Pedido después de haberlo creado.*/
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        this.idCliente = cliente.getId();
    }

    @Override
    public String toString() {
        return "Pedido [codigo=" + codigo + ", status=" + status + ", idCliente=" + idCliente
                + ", cliente=" + cliente + "]";
    }
	public List<Linea> getLineasPedido() {
		return lineasPedido;
	}
}
