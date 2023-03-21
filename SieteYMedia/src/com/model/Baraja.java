package com.model;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Baraja {
	protected int numCartas;
	protected int siguiente;
	private static final  String[] PALOS= {"oros", "copas", "espadas", "bastos"};
	private Carta[] cartas;

	public Baraja () {
		this.numCartas=40;
		this.cartas=  new Carta[40];
		this.siguiente=0;
		int posicion=0;
		for (int j=0;j<PALOS.length;j++) {
			for (int i=1;i<13;i++) {
				if (i!=8 && i!=9) {
					try {
						this.cartas[posicion++]= new Carta(i, PALOS[j]);
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	public void barajar() {
		//Random r = new Random();
		int posicionAleatoria=0;
		Carta carta =null;
		
		
		for (int i=0;i<cartas.length;i++) {
			carta=cartas[i];
			cartas[i]=cartas[posicionAleatoria];
			posicionAleatoria=generarNumero();
			cartas[posicionAleatoria]=carta;
			
		}

			//cartas[r.nextInt()]=new Carta(generarNumero(), generarPalo());
			//contador++;
			
	
			
		
	}
	public Carta getSiguiente () {
		this.siguiente++;
		return cartas[this.siguiente];
	}
	private static String generarPalo () {
		Random r = new Random();
		
		int palo=r.nextInt(0,3);

		return PALOS[palo];
		
	}
	private static int generarNumero () {
		Random r = new Random();

		return r.nextInt(0,40);
		
	}
	@Override
	public String toString() {
        return String.format("La baraja tiene %s cartas. La siguiente carta es  %s",
                        this.numCartas, this.cartas);
               
    }

}
