package com.Ejercicio7;

import java.util.Objects;

public class Cliente {
	private int id;

	public Cliente() {
		super();
		this.id = id++;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object cliente) {
		return this==cliente || cliente!=null && cliente instanceof Cliente cl && 
				cl.hashCode()==this.hashCode();
	}

	@Override
	public String toString() {
		return "Cliente"  + id;
	}
	
}
