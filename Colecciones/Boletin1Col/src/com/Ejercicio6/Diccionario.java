package com.Ejercicio6;
import java.util.*;

import com.Ejercicio4.excepciones.PaginaException;

public class Diccionario {
	private Map<String, List<String>> diccionario;

	public Diccionario() {
        diccionario = new HashMap<>();
    }
	/*public void añadirPalabra(String palabra, String significado) {
	    if(!diccionario.containsKey(palabra)) {
	        diccionario.put(palabra, new ArrayList<>());
	    }
	    diccionario.get(palabra).add(significado);
	}*/
    public void añadirPalabra(String palabra, Collection<String> significados) {
        if (!diccionario.containsKey(palabra)) {
            diccionario.put(palabra, new ArrayList<>());
        }
        diccionario.get(palabra).addAll(significados);
    }
	public void borrarPalabra(String palabra) {
		
		/*		
		Iterator<Palabra> it = entradas.iterator();
		boolean encontrado = false;
		while(it.hasNext() && !encontrado) {
			if(it.next().getPalabra().equals(palabra)) {
				it.remove();
        		encontrado = true;
			}
		}*/
	
		if(diccionario.containsKey(palabra)) {
			diccionario.remove(palabra);
		}
	}
	
	public String buscarPalabra(String palabra) throws Exception {
	    /*List<String> significados = diccionario.get(palabra);
	
	    Iterator<String> it = significados.iterator();
	    while (it.hasNext()) {
	        String significado = it.next();
	        System.out.println(significado);
	    }*/
	    
	    /*List<String> significados = new ArrayList<>();
	    Iterator<Palabra> it = diccionario.it();
	    while (it.hasNext()) {
	       
	        if (it.next().getPalabra().equalsIgnoreCase(palabra)) {
	            significados.addAll(it.next().getSignificados());
	        }
	    }*/
    	//Con StringBuilder sb = new StringBuilder(); es más largo 
		List<String> significados =null;
		if (this.diccionario.containsKey(palabra)) {
			significados = this.diccionario.get(palabra);
			
		}else {
			throw new Exception("La palabra no existe");
		}
	    return significados.toString();
	}
	public String listarPalabras(String prefijo) {
	    StringBuilder sb = new StringBuilder();
	    
	    for (String palabra : diccionario.keySet()) {
	        if (palabra.toLowerCase().startsWith(prefijo.toLowerCase())) {
	            sb.append(palabra).append(System.lineSeparator());
	        }
	    }
	    
	    return sb.toString();
	}



    /*public void añadirPalabr1a(String palabra, String significado) {
    	
    
		if(!this.diccionario.containsKey(palabra.getPalabra())) {
    		diccionario.put(diccionario.getPalabra(), new HashSet<>());
		}
		diccionario.put(palabra, significado);
		diccionario.get(palabra.getGenero()).add(significado);
		
	           
    }
    	if(!this.diccionario.containsKey(palabra.getPalabra())) {
    		diccionario.put(diccionario.getPalabra(), new HashSet<>());
    		diccionario.put(palabra, significado);
    }
        if(this.diccionario.containsKey(palabra)) {
        	if(this.diccionario.containsKey(significado)) {
        	
        significados.add(significado);
        diccionario.put(palabra, significados);
        System.out.println("Palabra añadida al diccionario.");
        
        
        /*if (!diccionario.isEmpty()) {
		if (diccionario.getFechaHora().isBefore(this.paginas.get(paginas.size()-1).getFechaHora())) {
			 throw new PaginaException("Consulta anterior a la última introducida");
		}
			
	}this.paginas.add(pagina);*/
    
        	
	
	
}
