package curso4;

public class PrincipalCaja {

	public static void main(String[] args) {
		Caja c= new Caja(4.15,5.80,6.00);
		System.out.println(c.getAlto());
		System.out.println(c.getAncho());
		System.out.println(c.getFondo());
		
		System.out.println(c.getVolumen());
		

	}

}
