package trenes;

import java.util.List;

import vista.Pantalla;

public class Simulador {
	
	public static Boolean terminaSimulacion = false;
	
	public static void main(String[] args) {
		Pantalla pantalla = Pantalla.getInstance();
		Recorrido recorrido = Recorrido.getRecorrido();	
		List<Tren> trenes = Tren.getTrenes(recorrido);
		//Recorrido.testearGetRecorrido(recorrido);
		pantalla.start();
		for(Tren tren:trenes){
			tren.start();
		}
		/**
		 * agregar a las personas
		 */
		
	}

}
