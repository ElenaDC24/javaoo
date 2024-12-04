package curso4;

public class PrincipalCalculadoraMejor {
//se invoca el metodo directamente
//sin instanciar nada primero
//es un metodo de clase
	public static void main(String[] args) {
	//sin variables
	//metods estaticos para que sean funciones puras
	
	//Math es una clase como scanner, donde vienen ya las funciones hechas
	System.out.println(Math.pow(2,2));	
	System.out.println(CalculadoraMejor.sumar(8,4));
	System.out.println(CalculadoraMejor.restar(15,5));
	System.out.println(CalculadoraMejor.multiplicar(5,5));
	System.out.println(CalculadoraMejor.dividir(40,8));
	}
	

}
