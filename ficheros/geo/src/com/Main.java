package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
		
		
		Country country = null;
		City city = null;

		try {
			country = new Country("52354","Narnia");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		 
		try {
			city = new City("6667","Chipiona");
			System.out.println(city);
		} catch (IOException e2) {
			e2.printStackTrace();
		} 
		
		
		
		try {
			GenerarArchivoOrdenado generarArchivoOrdenado = new GenerarArchivoOrdenado();
			generarArchivoOrdenado.generarArchivo();
		} catch (IOException e3) {
			e3.printStackTrace();
		}
	
		
	}

}