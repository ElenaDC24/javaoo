package es.curso;

public class PrincipalEjercicio2b {

	public static void main(String[] args) {
		//otra forma mas sencilla de hacer el ejercicio 2
			String texto= "hola amigo, que tal estas?";
			
			for (int i=0;i<texto.length();i++) {
			//caracter	
			char letra=texto.charAt(i);
			
			if (letra =='a' || letra =='e' || letra =='i' || letra =='o' || letra =='u')
				System.out.println(texto.charAt(i));
				//recorrer la cedena "hola...." e imprimir solo las vocales por la consola
		
	}
	}
}
