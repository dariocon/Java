package feria2;

import java.util.Objects;

public class Caseta {
	private String calle;
	private Tipo tipo;
	private int numero;
	private String nombre;
	private int modulos;
	private String idCalle;
	private String id;

	
	public Caseta(String calle, Tipo tipo, int numero, String nombre, int modulos, String idCalle, String id) {
		super();
		this.calle = calle;
		this.tipo = tipo;
		this.numero = numero;
		this.nombre = nombre;
		this.modulos = modulos;
		this.idCalle = idCalle;
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public int getNumero() {
		return numero;
	}

	public String getNombre() {
		return nombre;
	}

	public int getModulos() {
		return modulos;
	}

	public String getIdCalle() {
		return idCalle;
	}

	public String getId() {
		return id;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Caseta && this.hashCode()==obj.hashCode();
	}
	public void restarModulos(int modulos) throws Exception {
	    int nuevoNumero = this.numero - modulos;
	    if (nuevoNumero < 0) {
	        throw new Exception("El número de la caseta no puede ser negativo");
	    }
	    this.numero = nuevoNumero;
	}





	@Override
	public String toString() {
		return String.format("Caseta %s Titulo %s ID calle %s en calle %s numero %s, modulos %s de clase %s.",
				id, nombre, idCalle, calle, numero, modulos, tipo);
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setModulos(int modulos) {
		this.modulos = modulos;
	}
	

	
	
	

}
