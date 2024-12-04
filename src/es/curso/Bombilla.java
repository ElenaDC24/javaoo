package es.curso;

public class Bombilla {
	
	private int intensidad;
	//funcion que nos devuelve el valor como función pública
	public int getIntensidad() {
		return intensidad;
	}
	
	public void setIntensidad(int i) {
	if (i>=0 && i<=3)
	intensidad=i;
}
	public void incrementar() {/*lo dejo void porque no necesito 
	que me devuelva un valor*/
		
		setIntensidad(getIntensidad()+1);/*llama a get porque 
		ya está limitada*/
		//intensidad=intensidad+1;
		}
	public void decrementar() {/*lo dejo void porque no necesito 
		que me devuelva un valor*/
		setIntensidad(getIntensidad()-1);	
			//intensidad=intensidad-1;
	}

}