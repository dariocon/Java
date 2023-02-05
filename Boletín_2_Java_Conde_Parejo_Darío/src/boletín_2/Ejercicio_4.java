package boletín_2;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(invertirCadenaPorPares("Hola"));
	}
	public static String invertirCadenaPorPares(String cadena) {
		StringBuilder sb= new StringBuilder();
		if (cadena!=null && !cadena.isEmpty()) {
			for (int i=0; i<cadena.length()-1;i+=2) {
				sb.append(cadena.charAt(i+1));
				sb.append(cadena.charAt(i));
			}
			sb.append((cadena.length()%2!=0)? 
					cadena.charAt(cadena.length()-1): "");
			/*if(cadena.length()%2!=0) {
			 	sb.append(cadena.charAt(cadena.length()-1));
			  }*/
		}
		return sb.toString();
	}
}
