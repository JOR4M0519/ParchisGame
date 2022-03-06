package co.edu.unbosque.controller;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.Celdas;
import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.model.Tablero;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Fachada fachada;

	public Controller(){
		
		fachada = new Fachada();
		fachada.getTablero().generarJugadores(Integer.valueOf(JOptionPane.showInputDialog("ingrese el numero de jugadores")));
		
		view = new View(fachada.getTablero().getJugadores());
		view.getTablero().mover(1, 2, 5,fachada.getTablero());
		view.getTablero().mover(1, 2, 10,fachada.getTablero());
//		view.getTablero().mover(2, 1, 10,fachada.getTablero());
		funcionar();

	}

	public void funcionar() {


	}
}

