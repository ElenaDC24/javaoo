package es.curso;

public class Principal11 {
//suma de todos los elementos del array
	public static void main(String[] args) {
	
		
		int[] lista= new int[] {2,5,6,7};
		//recorrer e imprimir los valores de la lista
		
		int suma=0;
		
		for (int i=0;i<lista.length;i++) {
			
			System.out.println(lista[i]);
		
		suma=suma+lista[i];//suma+=lista [i];
		}
		
		System.out.println(suma);
	}
		
		
			
	
}
	
