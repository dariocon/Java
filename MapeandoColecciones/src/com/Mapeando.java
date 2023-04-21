package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;



public class Mapeando {
	
	List<Persona> personas = new ArrayList<>();
	//Set<Persona> gente = new HashSet<>();
	/**
	 * Recibe una colección de personas y las agrupa por género
	 * @param personas
	 * @return Mapa con la colección de personas clasificadas por género
	 */
	public Map mapearPersonasPorGenero(Collection<Persona> personas) {
		Map <Genero, Collection<Persona>> mapaOrdenGenero = new HashMap<>();
		for(Persona p : personas) {
	        if(!mapaOrdenGenero.containsKey(p.getGenero())) {
	        	mapaOrdenGenero.put(p.getGenero(), new HashSet<>());
	        }
	        mapaOrdenGenero.get(p.getGenero()).add(p);
	    }
	    return mapaOrdenGenero;
	
		
	}
	
	
	/**
	 * Recibe una colección de números y cuenta cuantas ocurrencias hay de cada uno de ellos
	 * creando un mapa en el que aparece cada número junto a su frecuencia de aparición
	 * @param numeros
	 * @return Tabla de frecuencias de los números facilitados
	 */
	public Map<Integer, Integer> contarNumeros(Collection<Integer> numeros) {
	    Map<Integer, Integer> mapaFrecuencia = new HashMap<>();
	    for (Integer numero : numeros) {
	        if (mapaFrecuencia.containsKey(numero)) {
	            int frecuencia = mapaFrecuencia.get(numero);
	            mapaFrecuencia.put(numero, ++frecuencia);
	        } else {
	            mapaFrecuencia.put(numero, 1);
	        }
	    }
	    return mapaFrecuencia;
	}

	
	
	/**
	 * Genera una lista de números aleatorios entre 0 y 20 del tamaño indicado
	 * @param size tamaño de la lista
	 * @return lista de size números aleatorios
	 */
	public static Collection<Integer> generarNumerosAleatorios(int size){
		List<Integer> numeros = new ArrayList<>() {{
			for(int i=0; i<size; i++) {
				add(new Random().nextInt(0, 20));
			}
		}};
		
		return numeros;
	}

}
