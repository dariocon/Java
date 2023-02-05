package boletín_2;

public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(toDecimal("1010101011"));
	}
    public static int toDecimal(String binario) {
        int decimal = 0;
        int exponente = 0;
        for(int i=binario.length()-1;i>=0;i--) {
            decimal += Integer.valueOf(binario.substring(i, i+1)) * Math.pow(2, exponente);
            exponente++;
        }
        return decimal;
    }

}
