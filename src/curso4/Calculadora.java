package curso4;

public class Calculadora {
	private double a;
	private double b;
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public Calculadora(double a, double b) {
		
		this.a = a;
		this.b = b;
		
	}
	public double suma() {
		return a+b;
	}
	public double resta() {
		return a-b;
	}	
	public double multiplicacion( ) {
		return a*b;
	}
	public double division() {
		return a/b;
	}
	
	}
	

