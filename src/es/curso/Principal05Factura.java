package es.curso;

public class Principal05Factura {

	public static void main(String[] args) {

		
		Factura f=new Factura();
		f. importe=100;
		System.out.println(f.importe);
		System.out.println(f.calcularConIVA());
		System.out.println(f.calcularSoloIVA());
		
		
	}

}
