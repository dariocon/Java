package com.Ejercicio6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import com.Ejercicio4.Pagina;

public class Palabra {
    private String palabra;
    private List<String> significados;
    
    public Palabra(String palabra, Collection<String> significados) {
    	this.palabra=palabra;
    	this.significados = new ArrayList<>();
    	this.significados.addAll(significados);
    }

	public String getPalabra() {
		return palabra;
	}
	public List<String> getSignificados() {
	    return significados;
	}


	@Override
	public int hashCode() {
		return Objects.hash(palabra, significados);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Palabra))
			return false;
		Palabra other = (Palabra) obj;
		return Objects.equals(palabra, other.palabra) && Objects.equals(significados, other.significados);
	}

	@Override
	public String toString() {
		return "Palabra [palabra=" + palabra + ", significados=" + significados + "]";
	}
    

}
