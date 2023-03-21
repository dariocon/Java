package com;

import java.util.Scanner;

import com.model.Baraja;
import com.model.Carta;

public class Main {

	public static void main(String[] args) {
		
		double puntuacionJugador=0;
		double puntuacionBanca=0;
		Baraja baraja = new Baraja();
		baraja.barajar();
		
		Carta carta=null;
		
		
		String respuesta="";
		do {
			carta= baraja.getSiguiente();
			System.out.println(carta);
			puntuacionJugador+=carta.getValor();
			
			do {
				Scanner sc= new Scanner(System.in);
				System.out.println("¿Desea seguir? (S/N)");
				respuesta=String.valueOf(sc.nextLine());
				
			}while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
		}while (puntuacionJugador<7.5 && respuesta.equalsIgnoreCase("S"));
		
		
			
			
		do {
			carta= baraja.getSiguiente();
			System.out.println(carta);
			puntuacionBanca+=carta.getValor();
	
		}while (puntuacionBanca<7.5);
		if (puntuacionBanca==7.5 || (puntuacionBanca<7.5&&puntuacionBanca>puntuacionJugador) || puntuacionJugador>7.5) {
			System.out.println("Gana banca con puntuacion de " + puntuacionBanca);
			
		}else {
			System.out.println("Gana el jugador con puntuacion de " + puntuacionJugador);
		}
		

	}	
	
		

}
