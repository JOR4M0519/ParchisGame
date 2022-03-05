package co.edu.unbosque.controller;
import co.edu.unbosque.view.View;
import co.edu.unbosque.view.View2;


public class Controller {
    private View2 view;

    public Controller(){
    	view = new View2();

    	funcionar();
    	view.getTablero().bucle();
    	System.out.println("Hola");
      }

	public void funcionar() {
		// TODO Auto-generated method stub
		view.moverFicha();
	}
}

