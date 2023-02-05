package boletín_2;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un método llamado segundosEntre que recibirá seis valores enteros, los
		tres primeros representarán la hora, minuto y segundos de la primera hora y los
		otros tres de la segunda hora. Se deberá devolver el número de segundos que hay
		entre la primera hora y la segunda (el valor debe ser siempre en positivo). Si los
		datos no son correctos se deberá devolver -1000.*/
		System.out.println(segundosEntre());
	}
	public static Integer segundosEntre() {
		
		System.out.println("Introduce una hora para la primera hora: ");
		Scanner scanner= new Scanner(System.in);
		Integer hora1= scanner.nextInt();
		System.out.println("Introduce un minuto para la primera hora: ");
		Integer minuto1= scanner.nextInt();
		System.out.println("Introduce un segundo para la primera hora: ");
		Integer segundo1= scanner.nextInt();
		System.out.println("Introduce una hora para la segunda hora: ");
		Integer hora2= scanner.nextInt();
		System.out.println("Introduce un minuto para la segunda hora: ");
		Integer minuto2= scanner.nextInt();
		System.out.println("Introduce un segundo para la segunda hora: ");
		Integer segundo2= scanner.nextInt();
		int horaMayor=0;
		int horaTotal_1=0;
		int horaTotal_2=0;
		int segundosTotal_1=0;
		int segundosTotal_2=0;
		int segundosEntre1y2=0;
		
		
		if ((hora1 >= 00 && hora2 >= 00) && (hora1 <= 24 && hora2 <= 24) &&  (minuto1 <= 60 && minuto2 <= 60) && (segundo2 <= 60 && segundo2 <= 60)) {
			segundosTotal_1=((hora1*60)*60)+(minuto1*60)+segundo1;
			segundosTotal_2=((hora2*60)*60)+(minuto2*60)+segundo2;
			segundosEntre1y2=Math.abs(segundosTotal_1-segundosTotal_2);

			
		}else {
			segundosEntre1y2=-1000;
		}
		 
			
		return segundosEntre1y2;
	}

}
