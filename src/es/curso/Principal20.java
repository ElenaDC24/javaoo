package es.curso;

public class Principal20 {

	public static void main(String[] args) {
		
	
		String cadena="hola que tal estas";
	
		//dime la longitud de la cadena
		//System.out.println(cadena.length());
		//imprime la letra de la posicion
		//System.out.println(cadena.charAt(i));
		
		int i=0;
		while (i<cadena.length()) {
			
			char letra=cadena.charAt(i);
			System.out.println(letra);
			i++;
		}
}}
