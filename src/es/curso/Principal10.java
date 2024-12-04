package es.curso;

public class Principal10 {
//es el 7 de cecilio
	public static void main(String[] args) {
	//le pedimos que nos devuelva el numero mayor de la lista	
	//le pedimos el menor también	
		int[] lista= new int[] {2,5,6,7};
		//recorrer e imprimir los valores de la lista
		
		
		for (int i=0;i<lista.length;i++) {
			
			System.out.println(lista[i]);
		}
	//invoco la funcion
		int mayor= numeroMayor(lista);
		System.out.println("******");
		System.out.println(mayor);
		
		int menor= numeroMenor(lista);
		System.out.println("******");
		System.out.println(menor);
		
	}
	public static int numeroMayor(int[] miArray) {
		
		int mayor=0;
	
	for (int i=0;i<miArray.length;i++) {	
		
		if (miArray[i]> mayor) {
			mayor = miArray[i];
	
	}
		
	}
	return mayor;
}
	
	public static int numeroMenor(int[] miArray)
	{	
		int menor = Integer.MAX_VALUE;
		
		for (int i=0; i<miArray.length; i++) {
			
			if (miArray[i] <menor) {
				menor = miArray[i];
				
			}
		}
		return menor;
		
	}
}