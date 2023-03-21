package com.model;

import java.util.Objects;

public class Carta {
	private int number;
	private String palo;
	
	public Carta (int number, String palo) {
		this.number=number;
		this.palo=palo;
	}
	
	public double getValor() {
		double valor=this.number;
		
		if (this.number>9) {
			valor=0.5;
		}
		
		return valor;
	}
	
	
	public int getNumber() {
		return number;
	}


	public String getPalo() {
		return palo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, palo);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this == obj;
		if (!sonIguales && obj != null && obj instanceof Carta) {
			Carta other = (Carta) obj;
			sonIguales=Objects.equals(other.number, this.number) && Objects.equals(other.palo, this.palo) ;
		}
		return sonIguales;
	}
	@Override
	public String toString() {
        return String.format("%s de  %s, cuyo valor es %s",
                        this.number, this.palo, this.getValor());

	}
}
