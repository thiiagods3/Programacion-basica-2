package ar.edu.unlam.pb2;

public class SalaDeCine4D extends SalaDeCine {
	
	public SalaDeCine4D(int filas, int columnas) {
		super(filas, columnas);
		this.tipoDePantalla = Pantalla.CUATROD;
	}
	
	@Override
	public String getSonidoBienvenida() {
		return super.getSonidoBienvenida() + ". Disfruta una experiencia multidimensional";
	}
	
	public void metodoDePrueba() {
		super.getSonidoBienvenida();
		this.getSonidoBienvenida();
	}
	
	
	
	
	

}
