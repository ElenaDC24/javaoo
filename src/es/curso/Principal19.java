package es.curso;

public class Principal19 {
	//sacar el numero de letras "a"
	public static void main(String[] args) {
		
	
		String cadena="hola que tal estas";
		int contador=0;
		for (int i=0;i<cadena.length();i++) {
			char letra=cadena.charAt(i);
			if(letra=='a') {
			System.out.println(letra);
			contador++;
		
		}
		
	}
		System.out.println(contador);
}}
