package com.Ejercicio7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Caja {
	private int numCaja;
	private List<Cliente> clientes;
	private Boolean estado;
	
	
	public Caja() {
		super();
		this.numCaja = numCaja++;
		this.clientes = new ArrayList<>();
		
	}
	public Caja(int numCaja, List<Cliente> clientes) {
		this();
		this.clientes.addAll(clientes);
	}
	public int getNumCaja() {
		return numCaja;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Boolean getEstado() {
		return estado;
	}
	/*public void addCliente (Cliente cliente) throws Exception{
		
		if(getEstado()) {
			cola.add(cliente);
		}else throw new Exception("La caja esta cerrada");
	}*/
	
		
	    /*Iterator<Caja> it = this.cajas.iterator();
	    while (it.hasNext()) {
	        Caja caja = it.next();
	        if (numCaja == caja.getNumCaja()) {
	            if (caja.getEstado()) {
	                throw new Exception("La caja está abierta.");
	            } else {
	                caja.setEstado(true);
	            }
	        }
	    }*/

	

}
