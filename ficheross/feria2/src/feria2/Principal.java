package feria2;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
	    String path = "files/casetas.xml";
	    Feria feria = new Feria(path);

	    try {
	        feria.eliminarCaseta("Calle 1", 1);
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }

	    String casetasEnCalle = feria.mostrarCasetasEnCalle("Calle 2");
	    System.out.println(casetasEnCalle);

	    String casetasFamiliares = feria.mostrarCasetasFamiliares();
	    System.out.println(casetasFamiliares);

	   
	    String casetasDistrito = feria.mostrarCasetasDistrito();
	    System.out.println(casetasDistrito);

	    String casetasNoFNoD = feria.mostrarCasetasNoFNoD();
	    System.out.println(casetasNoFNoD);

	    String casetasFamiliaresPorCalle = feria.mostrarCasetasFamiliaresPorCalle();
	    System.out.println(casetasFamiliaresPorCalle);

	    String casetasDistritoPorCalle = feria.mostrarCasetasDistritoPorCalle();
	    System.out.println(casetasDistritoPorCalle);

	    try {
	        feria.generarJson();
	    } catch (IOException e) {
	        System.out.println(e.getMessage());
	    }
	}

}
