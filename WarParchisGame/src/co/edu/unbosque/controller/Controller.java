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
		
<<<<<<< HEAD
		view = new View(fachada.getTablero().getJugadores(), fachada.getTablero().getJugadores().length);
		
		fichasInicio();
		
//		view.getTablero().mover(1, 2, 5,fachada.getTablero());
//		view.getTablero().mover(1, 2, 10,fachada.getTablero());
//		view.getTablero().mover(3, 1, 10,fachada.getTablero());
//		funcionar();
=======
		view = new View(fachada.getTablero().getJugadores());
//		view.getTablero().mover(1, 2, 5,fachada.getTablero());
//		view.getTablero().mover(1, 2, 66,fachada.getTablero());
//		view.getTablero().mover(1, 2, 1,fachada.getTablero());
		view.getTablero().mover(2, 3, 72,fachada.getTablero());
		funcionar();
>>>>>>> 8ee5f0f3aa0f347b060d7f61737d8dff919111ef

	}

	public void fichasInicio() {
		
		view.getTablero().remove(view.getTablero().getFondo());
		System.out.println(fachada.getTablero().getJugadores().length);
		for(int i=0;i<fachada.getTablero().getJugadores().length;i++) {
			for(int j=0;j<4;j++) {
				String url = ("./Data/"+i+"_"+(j+1)+".png");
				//infoJugador
				view.getTablero().generarFichasInicio(i,j, url, 
						fachada.getTablero().getJugadores()[i].getFicha()[j].getUbicacion().getX(),
						fachada.getTablero().getJugadores()[i].getFicha()[j].getUbicacion().getY());
			}			
		}	
		view.getTablero().generarFondo();
		
//		view.getTablero().remove(view.getTablero().getFondo());
//		for(int x=0;x<view.getTablero().getFichas().length;x++) {
//			for(int i=0;i<view.getTablero().getFichas()[x].length;i++) {
//				view.getTablero().add(view.getTablero().getFichas()[x][i]);
//			}	
//		}
//		view.getTablero().add(view.getTablero().getFondo());
//		
		
//		view.getTablero().agregarFichas();
		
	}
	
	public void funcionar() {


	}
}

