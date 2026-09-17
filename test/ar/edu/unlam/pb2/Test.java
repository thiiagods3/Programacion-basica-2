package ar.edu.unlam.pb2;

public class Test {
	
	/* j=0 j=1 j=2 j=3
	i=0 X   X   X   X
	i=1 X   X   O   X
	i=2 X   O   X   X	
	*/
	
	private static void printButacas(Butaca[][] butacas) {
		for (int i=0; i < butacas.length ; i++) {
			for (int j=0; j < butacas[0].length; j++) {
				System.out.print(butacas[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	private static void mensajeVenta(boolean sePudo) {
		if (sePudo) {
			System.out.println("Se vendió la entrada correctamente");
		} else {
			System.out.println("No se pudo vender la entrada");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaDeCine sala4D = new SalaDeCine4D(8, 5);
		SalaDeCine salaSorround = new SalaDeCineSorround(8, 5);
		
		Pelicula starWars = new Pelicula("Star Wars", Genero.SUSPENSO, 180, 16);
		Pelicula toyStory5 = new Pelicula("Toy Story 5", Genero.INFANTIL, 90, 0);
		sala4D.proyectarPelicula(starWars);
		salaSorround.proyectarPelicula(toyStory5);
		
		System.out.println(sala4D.getVolumen());
		System.out.println(salaSorround.getVolumen());
		
		salaSorround.cambiarVolumen(75);
		System.out.println(salaSorround.getVolumen());
		
		salaSorround.proyectarPelicula(starWars);
		
		System.out.println(salaSorround.getSonidoBienvenida());
		System.out.println(sala4D.getSonidoBienvenida());
		System.out.println(SalaDeCine.cantidadDeSalas);
		
		//salaSorround.getCantidad
		
		/*if (salaSorround instanceof SalaDeCineSorround) {
			SalaDeCineSorround salatmp = (SalaDeCineSorround) salaSorround;
			salatmp.getCantidadDeParlantes();
			((SalaDeCineSorround) salaSorround).getCantidadDeParlantes();
		}*/
		//((SalaDeCineSorround)sala4D).getCantidadDeParlantes();
		
		//System.out.println(salaSorround.getCantidadDeParlantes());
		
		//SalaDeCine sala = new SalaDeCine(10,10);
		
		
		
		
		
		
		/*
		printButacas(sala.getEstado());
		
		mensajeVenta(sala.venderBoleto(0, 0, 20));
		printButacas(sala.getEstado());
		
		mensajeVenta(sala.venderBoleto(0, 0, 30));
		printButacas(sala.getEstado());
		
		mensajeVenta(sala.venderBoleto(1, 0, 10));
		printButacas(sala.getEstado());
		
		mensajeVenta(sala.venderBoleto(1, 0, 20));
		printButacas(sala.getEstado());*/
		/*int volumen = 10;
		sala.cambiarVolumen(volumen);*/
		
		
		
	}
	/*
• Después de cada venta, muestra cómo quedó la sala para ver los cambios.
• Finalmente, cambia a otra película y repite el proceso de venta
	 */
	
	
	

}
