package com.Ejercicio4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.Ejercicio4.excepciones.PaginaException;
import com.Ejercicio4.Historial;

public class Programa {

	

	public static void main(String[] args) {
		//Historial historial = new Historial<Pagina>();
		Historial historial = new Historial(new ArrayList<>());
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("1. Nueva página consultada");
            System.out.println("2. Consultar historial completo");
            System.out.println("3. Consultar historial de un día");
            System.out.println("4. Borrar todo el historial");
            System.out.println("5. Borrar visitas a una página");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            
            Scanner input;
			switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Introduzca la url de la página: ");
                    String url = scanner.nextLine();
                    Pagina pagina = new Pagina(url, LocalDateTime.now());
                    try {
                        historial.addPagina(pagina);
                        System.out.println("Página agregada al historial.");
                    } catch (PaginaException e) {
                        System.out.println("Error al agregar la página: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println(historial.mostrarHistorialCompleto());
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Introduzca la fecha (en formato yyyy-MM-dd): ");
                    String fecha = scanner.nextLine();
                    LocalDate dia = LocalDate.parse(fecha);
                    System.out.println(historial.mostrarHistorialDia(dia));
                    break;
                case 4:
                    historial.borrarHistorial();
                    System.out.println("Historial borrado.");
                    break;
                /*case 5:
                    System.out.println("Introduzca la url de la página a borrar:");
                    String url = scanner.nextLine();
                  
                    System.out.println("Introduzca la fecha y hora de la página a borrar (formato yyyy-MM-dd HH:mm:ss):");
                    //No sé hacer nextline de esto
                    try {
                        //Pagina paginaABorrar = new Pagina(url, fechaHora);
                        //historial.borrarPagina(paginaABorrar);
                        System.out.println("Página borrada correctamente.");
                    } catch (PaginaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;*/

                case 6:
                    System.out.println("Saliendo.");
                    break;
            }
            
            System.out.println();
            
        } while (opcion != 6);
        
        
	}

}
