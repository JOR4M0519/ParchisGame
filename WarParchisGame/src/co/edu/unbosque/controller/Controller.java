package co.edu.unbosque.controller;
import co.edu.unbosque.view.View2;


public class Controller {
    private View2 view;
 

    public Controller(){
    	view = new View2();
    	
    	
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

