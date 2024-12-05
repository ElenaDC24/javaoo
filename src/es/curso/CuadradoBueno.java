package es.curso;

public class CuadradoBueno {
	
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public CuadradoBueno(int lado) {
		super();
		this.lado = lado;
	}
	
	public double area() {
		return lado*lado;
	}
	}
	
	
