package dbconnect.main.java;

import java.lang.System.Logger;
import java.sql.SQLException;
import java.util.Scanner;

import dbconnect.main.java.api.Connector;
import dbconnect.main.java.model.Cliente;
import dbconnect.main.java.model.Linea;
import dbconnect.main.java.model.Pedido;
import dbconnect.main.java.model.Genero;

public class MainApp {

	
	
		public static void main(String[] args) throws ClassNotFoundException {
			try {
				Connector connector = new Connector();
				Scanner scanner = new Scanner(System.in);
				
			/*
	            String informacionClientes = connector.mostrarInformacionClientes();
	            System.out.println("Información de los clientes:");
	            System.out.println(informacionClientes);

	            String pedidosPorImporte = connector.mostrarPedidosPorImporteDecreciente();
	            System.out.println("Pedidos por importe (precio) decreciente:");
	            System.out.println(pedidosPorImporte);*/
	            
	            

	            boolean salir = false;
	            while (!salir) {
	                System.out.println("---------- Menú ----------");
	                System.out.println("1. Mostrar información de los clientes");
	                System.out.println("2. Mostrar pedidos por importe (precio) decreciente");
	                System.out.println("3. Agregar un nuevo cliente");
	                System.out.println("4. Actualizar un cliente existente");
	                System.out.println("5. Eliminar un cliente");
	                System.out.println("6. Añadir un nuevo pedido");
	                System.out.println("7. Incluir líneas en un pedido");
	                System.out.println("0. Salir");
	                System.out.print("Elija una opción: ");
	                int opcion = scanner.nextInt();
	                scanner.nextLine(); // Consumir el salto de línea

	                switch (opcion) {
	                    case 1:
	                        // Mostrar información de los clientes
	                        String informacionClientes = connector.mostrarInformacionClientes();
	                        System.out.println("Información de los clientes:");
	                        System.out.println(informacionClientes);
	                        break;
	                    case 2:
	                        // Mostrar pedidos por importe decreciente
	                        String pedidosPorImporte = connector.mostrarPedidosPorImporteDecreciente();
	                        System.out.println("Pedidos por importe (precio) decreciente:");
	                        System.out.println(pedidosPorImporte);
	                        break;
	                    case 3:
	                        // Agregar un nuevo cliente
	                        System.out.print("Ingrese el nombre del cliente: ");
	                        String nombre = scanner.nextLine();
	                        System.out.print("Ingrese los apellidos del cliente: ");
	                        String apellidos = scanner.nextLine();
	                        System.out.print("Ingrese el email del cliente: ");
	                        String email = scanner.nextLine();
	                        System.out.print("Ingrese la fecha de nacimiento del cliente (AAAA-MM-DD): ");
	                        String fechaNacimiento = scanner.nextLine();
	                        System.out.print("Ingrese el género del cliente (M/F): ");
	                        String generoStr = scanner.nextLine();
	                        Genero genero = generoStr.equalsIgnoreCase("M") ? Genero.M : Genero.F;

	                        Cliente nuevoCliente = new Cliente(nombre, apellidos, email, fechaNacimiento, genero);
	                        connector.agregarCliente(nuevoCliente);
	                        System.out.println("Cliente agregado exitosamente.");
	                        break;
	                    case 4:
	                        // Actualizar un cliente existente
	                        //System.out.print("Ingrese el ID del cliente a actualizar: ");
	                        //int idClienteActualizar = scanner.nextInt();
	                        System.out.print("Ingrese el nuevo nombre del cliente: ");
	                        String nuevoNombre = scanner.nextLine();
	                        System.out.print("Ingrese los nuevos apellidos del cliente: ");
	                        String nuevosApellidos = scanner.nextLine();
	                        System.out.print("Ingrese el nuevo email del cliente: ");
	                        String nuevoEmail = scanner.nextLine();
	                        System.out.print("Ingrese la nueva fecha de nacimiento del cliente (AAAA-MM-DD): ");
	                        String nuevaFechaNacimiento = scanner.nextLine();
	                        System.out.print("Ingrese el nuevo género del cliente (M/F): ");
	                        String nuevoGeneroStr = scanner.nextLine();
	                        Genero nuevoGenero = nuevoGeneroStr.equalsIgnoreCase("M") ? Genero.M : Genero.F;

	                        Cliente clienteActualizado = new Cliente(nuevoNombre, nuevosApellidos, nuevoEmail, nuevaFechaNacimiento, nuevoGenero);	            
	                        connector.actualizarClienteExistente(clienteActualizado);
	                        System.out.println("Cliente actualizado exitosamente.");
	                        break;
	                    case 5:
	                        // Eliminar un cliente por nombre y apellido
	                        System.out.print("Ingrese el nombre del cliente a eliminar: ");
	                        String nombreClienteEliminar = scanner.nextLine();
	                        System.out.print("Ingrese los apellidos del cliente a eliminar: ");
	                        String apellidosClienteEliminar = scanner.nextLine();
	                        connector.eliminarCliente(nombreClienteEliminar, apellidosClienteEliminar);
	                        System.out.println("Cliente eliminado exitosamente.");
	                    case 6:
	                        // Añadir un nuevo pedido
	                        System.out.print("Ingrese el código del pedido: ");
	                        String codigoPedido = scanner.nextLine();
	                        System.out.print("Ingrese el estado del pedido: ");
	                        String estadoPedido = scanner.nextLine();
	                        System.out.print("Ingrese el ID del cliente: ");
	                        int idClientePedido = scanner.nextInt();
	                        scanner.nextLine(); // Consumir el salto de línea

	                        Pedido nuevoPedido = new Pedido(codigoPedido, estadoPedido, idClientePedido);
	                        connector.annadirPedido(nuevoPedido);
	                        System.out.println("Pedido añadido exitosamente.");
	                        break;
	                    case 7:
	                    	 System.out.print("Ingrese el ID del pedido: ");
	                    	 int idPedido = scanner.nextInt();
	                    	 boolean agregarLineas = true;
	                    	 while (agregarLineas) {
	                    	        System.out.print("Ingrese el código de la línea: ");
	                    	        String codigoLinea = scanner.nextLine();
	                    	        System.out.print("Ingrese el nombre del producto: ");
	                    	        String nombreProducto = scanner.nextLine();
	                    	        System.out.print("Ingrese la cantidad: ");
	                    	        int cantidad = scanner.nextInt();
	                    	        System.out.print("Ingrese el precio: ");
	                    	        double precio = scanner.nextDouble();
	                    	      
	                    	        Linea nuevaLinea = new Linea(codigoLinea, nombreProducto, idPedido, cantidad, precio);
	                    	        connector.incluirLineasPedido(idPedido, nuevaLinea);

	                    	        System.out.print("¿Desea agregar más líneas? (s/n): ");
	                    	        String opcion7 = scanner.nextLine();
	                    	        if (opcion7.equalsIgnoreCase("n")) {
	                    	            agregarLineas = false;
	                    	        }
	                    	 }
	                    	 
	                        break;
	                    case 0:
	                   	salir = true;
	                        break;
	                    default:
	                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
	                        break;
	                        
	                }
	            }
	        } catch (Exception e) {
	            System.out.println("Error en la conexión: " + e.getMessage());
	        } 
			
	        //connector.close();
	       
	            
			
		}
}
