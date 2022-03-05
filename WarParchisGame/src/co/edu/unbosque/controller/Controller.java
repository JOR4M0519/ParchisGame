package co.edu.unbosque.controller;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Fachada fachada;

	public Controller(){
		fachada = new Fachada();
		fachada.getTablero().generarJugadores(Integer.valueOf(JOptionPane.showInputDialog("ingrese el numero de jugadores")));
		view = new View(fachada.getTablero().getJugadores());
		funcionar();

	}

	public void funcionar() {

		view.getTablero().mover("rojo");

	}
}

