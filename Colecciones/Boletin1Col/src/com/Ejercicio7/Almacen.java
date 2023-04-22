package com.Ejercicio7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.Ejercicio4.Pagina;
import com.Ejercicio4.excepciones.PaginaException;
import com.Ejercicio5.Mensaje;

public class Almacen {
	private List<Caja> cajas;

	public Almacen(List<Caja> cajas) {
		super();
		this.cajas = new ArrayList<>(20);
	    for (int i = 1; i <= 20; i++) {
	        this.cajas.add(new Caja(i, new ArrayList<>()));
	    }
	}
	public void abrirCaja (int numCaja) throws Exception{
		
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
		if(!cajas.get(numCaja).getEstado()) {
			cajas.get(numCaja).setEstado(true);
		}else {
            throw new Exception("La caja está abierta.");

		}
	}
	public void cerrarCaja (int numCaja) throws Exception{
		if(cajas.get(numCaja).getEstado() && cajas.get(numCaja).getClientes().isEmpty()) { //por qué no null?
			cajas.get(numCaja).setEstado(false);
		}else {
			 throw new Exception("La caja no está abierta o aún hay clientes.");
		}
	}
	public void addClienteNuevoGenerado () throws Exception{
		Cliente cliente = new Cliente();
		
		Iterator<Caja> it = this.cajas.iterator();
		Caja cajaAsignada = null;

	    while (it.hasNext()) {
	        Caja cajaIt = it.next();
	        if (cajaAsignada == null || cajaIt.getClientes().size() < cajaAsignada.getClientes().size()) {
	        	cajaAsignada = cajaIt;
	        	}     
	        }
	    //En caso de haber un tope de clientes por caja, lo cual no pide el enunciado:
	    /*if (cajaAsignada == null etc) {
			throw new Exception("No hay cajas disponibles.");*/
		
		cajaAsignada.getClientes().add(cliente); //Lo hago asi porque no tengo método addCliente en Caja, en cuyo caso
		//debería poner aquí: cajaAsignada.addCliente(cliente);
		
	}
	//public String atenderCliente(int numCaja) throws Exceptions {
		
			
	
	     
	

}
