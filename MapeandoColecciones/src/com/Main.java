package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		/*Persona persona1 = new Persona ("Antonio","Cruz", Genero.MASCULINO);
		Persona persona2 = new Persona ("Luisa","Cruz", Genero.FEMENINO);
		
		List<Persona> personas = new ArrayList<>();
		
		personas.add(persona1);
		personas.add(persona2);
		
		Mapeando mapa = new Mapeando();
		
		Map<String,Genero> personas2 = new SetMap<>();
		personas.put(persona1);*/
		
		Persona persona1 = new Persona("Antonio", "Cruz", Genero.MASCULINO);
        Persona persona2 = new Persona("Luisa", "Cruz", Genero.FEMENINO);
        Persona persona3 = new Persona("popo", "cabeza", Genero.MASCULINO);
        Persona persona4 = new Persona("maria", "garcia", Genero.FEMENINO);

        List<Persona> personas = new ArrayList<>();

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        Mapeando mapa = new Mapeando();

        Map<Genero, List<Persona>> mapaPersonas = mapa.mapearPersonasPorGenero(personas);
        System.out.println(mapaPersonas);
        
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(4);
        Map<Integer, Integer> mapaNumeros = mapa.contarNumeros(numeros);
        System.out.println(mapaNumeros);
        
        int size=6;
        Collection<Integer> numerosTamanno = mapa.generarNumerosAleatorios(size);
        
        System.out.println(numerosTamanno);
        
	}

}
