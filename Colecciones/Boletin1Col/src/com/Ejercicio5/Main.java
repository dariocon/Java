package com.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*Profesor p = new Profesor(45, "Pepe", "26666666X");
		Alumno a = new Alumno(14,"Antonia",  "123123123");
		Alumno a2 = new Alumno("Luisa", 14, "65656565");
		Alumno a3 = new Alumno("María", 25, "445345354");*/
		
		Alumno alumno1 = new Alumno(17, "Juan", new ArrayList<Mensaje>());
		Alumno alumno2 = new Alumno(22, "María", new ArrayList<Mensaje>());
		
		Profesor profesor = new Profesor(35, "Pedro", new ArrayList<Mensaje>());
		
		List<Persona> personas = new ArrayList<>();
		personas.add(alumno1);
		personas.add(alumno2);
		personas.add(profesor);
		
		/*for (Persona persona : personas) {
			System.out.println("Mensajes de " + persona.getNombre());
			try {
				System.out.println(persona.leerMensajes());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}*/
		

		
		try {
			alumno1.enviarMensaje("Hola, profe.", profesor);
			alumno2.enviarMensaje("Buenos días, profe", profesor);
			profesor.enviarMensaje("Sí, dime Juan.", alumno1);
			profesor.enviarMensaje("Hola, María. ¿En qué puedo ayudarte?", alumno2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Persona persona : personas) {
			System.out.println("Mensajes de " + persona.getNombre());
			try {
				System.out.println(persona.leerMensajes());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		try {
			alumno1.borrarMensaje(1);
			alumno2.borrarMensaje(1);
			profesor.borrarMensaje(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Persona persona : personas) {
			System.out.println("Mensajes de " + persona.getNombre());
			try {
				System.out.println(persona.leerMensajes());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		
		System.out.println("Mensajes de Pedro ordenados alfabéticamente:");
		try {
			System.out.println(profesor.leerMensajesAlfabeticamente());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

		
		System.out.println("Mensajes que contienen la frase 'profe':");
		System.out.println(profesor.buscarMensajesPorFrase("profe"));
	
	}

}
