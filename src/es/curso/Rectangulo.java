package es.curso;

public class Rectangulo {
	private double lado1;
	private double lado2;
	
	public double calcularArea() {
		return lado1*lado2;
				
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if(lado1>0)
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if(lado2>0)
		this.lado2 = lado2;
	}
		
}
