package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenerarArchivoOrdenado {
	/*El programa debe crear un nuevo fichero en donde aparezca el id y el nombre de cada país, junto con el
	 *  número de ciudades que hay en ese país y el número de direcciones que hay, de forma que en cada país
	 *   se muestren primero las ciudades con más direcciones. Si hay dos ciudades con el mismo numero de 
	 *   direcciones  deberán aparecer ordenadas alfabéticamente.
	 */
	
	
	private List<Country> countries;
	
	public GenerarArchivoOrdenado() throws IOException {
		this.countries= new ArrayList<>();
		addCountry();
	}
	
	private void addCountry() throws IOException {
		/*Este método lee el archivo country.txt y carga su información en una estructura de List que contiene 
		 * objetos de la clase "Country".*/
		FileReader flujoLectura=new FileReader("files/country.txt");
		BufferedReader filtroLectura = new BufferedReader(flujoLectura);
		filtroLectura.readLine();
    	String linea=filtroLectura.readLine();
    	String[] arrayLinea;
		while(linea!=null) {
			arrayLinea=linea.split(",");
			
			this.countries.add(new Country(arrayLinea[0], arrayLinea[1]));
      
			linea = filtroLectura.readLine();

		}
		filtroLectura.close();
		
	}
	
	public void generarArchivo() throws IOException {
		/*este método crea un nuevo archivo llamado generado.txt y escribe en él la información de cada país
		 *  y sus ciudades en orden ascendente según la cantidad de direcciones que tengan, y en caso de que
		 *   haya dos ciudades con la misma cantidad de direcciones, se ordenan alfabéticamente. 
		 *   Finalmente, el archivo generado se guarda en la misma ubicación del archivo "GeneradorArchivo.java".*/
		File file = new File("files/archivoGenerado.txt");
		file.createNewFile();
		FileWriter flujoEscritura= new FileWriter(file);
		BufferedWriter filtroEscritura= new BufferedWriter(flujoEscritura);
		
		for(Country c:this.countries) {
			filtroEscritura.append(c.toString());
			filtroEscritura.newLine();
		}
		filtroEscritura.close();
		flujoEscritura.close();
	}

}
