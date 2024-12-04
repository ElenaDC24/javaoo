package es.curso;

public class PrincipalEjercicio2 {

	public static void main(String[] args) {
		
			String cadena= "hola amigo, que tal estas?";
			
			for (int i=0;i<cadena.length();i++) {
				
			//System.out.println(cadena.charAt(i));
			if(cadena.charAt(i)=='a' || cadena.charAt(i)=='e' || cadena.charAt(i)=='i' || cadena.charAt(i)=='o'|| cadena.charAt(i)=='u')
			System.out.println(cadena.charAt(i));
//recorrer la cedena "hola...." e imprimir solo las vocales por la consola
		
	}
	}
}
