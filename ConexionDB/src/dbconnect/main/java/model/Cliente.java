package dbconnect.main.java.model;

public class Cliente {
	
	private int id;
	private String nombre;
	private String apellidos;
	private String dni;
	private String email;
	private String fechaNacimiento;
	private Genero Genero;
	
	
	public Cliente(String nombre, String apellidos,String email, String fechaNacimiento, Genero Genero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.Genero=Genero;
	}
	public Cliente(int id, String nombre, String apellidos,String email, String fechaNacimiento, Genero Genero) {
	    this(nombre, apellidos, email, fechaNacimiento, Genero);
	    this.id = id;
	}

	 public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	



	@Override
	public String toString() {
		return "Cliente [name=" + nombre + ", apellidos=" + apellidos + ", fecha de nacimiento=" + fechaNacimiento + ", email=" + email
				+ "]";
	}


	public Genero getGenero() {
		return Genero;
	}


	public void setGenero(Genero Genero) {
		this.Genero = Genero;
	}
	
	
	

}
