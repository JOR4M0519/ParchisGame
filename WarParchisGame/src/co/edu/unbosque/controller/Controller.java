package co.edu.unbosque.controller;
import co.edu.unbosque.view.View;


public class Controller {
    private View view;
 

    public Controller(){
    	view = new View();
    	
    	
    	funcionar();
    	view.getTablero().mover("rojo");
//    	view.getTablero().bucle();

      }

	public void funcionar() {
		// TODO Auto-generated method stub
//		tablero.bucle();
//		view.getTablero().moverLauIntentoArray("rojo");
//		view.moverFicha();
	}
}

