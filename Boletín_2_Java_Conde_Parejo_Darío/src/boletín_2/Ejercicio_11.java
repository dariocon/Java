package boletín_2;

public class Ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un método llamado minimoComunMultiplo que reciba dos números y
	calcule el mínimo común múltiplo de dos números. Con el máximo común divisor de
	una pareja de números podemos obtener fácilmente el mínimo común múltiplo de
	dicha pareja. El mínimo común múltiplo de dos números es igual al producto de los
	números dividido entre su máximo común divisor. Por ejemplo, el máximo común
	divisor de 24 y 36 es 12, por tanto el mínimo común múltiplo de 24 y 36 es
	(24×36)/12=72.*/
		System.out.println(minimoComunMultiplo(45,67));
		
	}
	

	public static int minimoComunMultiplo(int num1, int num2) {
		
		Integer gcd=0;
		
		/*Integer gcd=greaterCommonDivisor(num1,num2);*/
		
		
		int mcm = (num1*num2)/greaterCommonDivisor(num1,num2);
		
		return mcm;
	}
	public static Integer greaterCommonDivisor(int num1, int num2) {
		int gcd=0;
		while (num2>0) {
			if(num1 > num2) {
				num1 = (num1 - num2);
			}else {
				num2 = (num2 - num1);
			}
			gcd=num1;
		}
		
		return gcd;
	}
		

}
