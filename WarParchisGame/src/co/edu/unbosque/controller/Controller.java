package co.edu.unbosque.controller;

import javax.swing.JOptionPane;
import co.edu.unbosque.model.Tablero;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Tablero tablero;

	public Controller(){
		
		tablero = new Tablero();
		tablero.generarJugadores(Integer.valueOf(JOptionPane.showInputDialog("ingrese el numero de jugadores")));
		
		
		
		
		view = new View(generarCoordenadasInicio("X"),generarCoordenadasInicio("Y"), tablero.getJugadores().length);
		
		mover(3, 4, 20);
		mover(3, 4, 5);
		
//		mover(3, 4, 5);
//		mover(3, 4, 5);
//		mover(3, 4, 5);
//		mover(3, 4, 5);

//		mover(3,4, 10);
//		mover(1,4, 3);
//		mover(3,4, 62);
//		mover(1,3, 72);
		
	

	}
	
	public int[][] generarCoordenadasInicio(String eje) {
		int[][] coordenadasX = new int[tablero.getJugadores().length][4];
		int[][] coordenadasY = new int[tablero.getJugadores().length][4];
		
		for (int i = 0; i < tablero.getJugadores().length; i++) {
			for (int j = 0; j < 4; j++) {
				coordenadasX[i][j] = tablero.getJugadores()[i].getFicha()[j].getUbicacion().getX();
				coordenadasY[i][j] = tablero.getJugadores()[i].getFicha()[j].getUbicacion().getY();
			}
		}
		if(eje.equals("X")) {
			return coordenadasX;
		}
		return coordenadasY; 
	}
	
	public void mover(int jugadorJugando,int ficha, int numeroDado) {

		int posicionActual = tablero.getJugadores()[jugadorJugando].getFicha()[ficha].getUbicacionFicha();
		int jugadorGanar =jugadorJugando;
		int jugadorContador = jugadorJugando;
		int coorX=0;
		int coorY=0;

		for(int x=0;x<numeroDado;x++) {
			try {

				if(posicionActual>tablero.getRecorrido()[jugadorJugando].getSector().length-1) {
					posicionActual=0;
					tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].setVuelta(tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].getVuelta()+1);
					jugadorContador = jugadorContador+1;
					if(jugadorContador>=4) {
						jugadorContador=0;
					}
				}
				
				if(tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].getVuelta()==4) {
				
					Thread.sleep(700);
					coorX =tablero.getRecorrido()[jugadorGanar].getFilaGanadora()[posicionActual].getX();
					coorY =tablero.getRecorrido()[jugadorGanar].getFilaGanadora()[posicionActual].getY();
					posicionActual=posicionActual+1;
					if(posicionActual>tablero.getRecorrido()[jugadorGanar].getFilaGanadora().length-1) {
						System.out.println("Ganaste perra");
						view.getTablero().getFichas()[jugadorJugando-1][ficha-1].setLocation(1000, 1000);
					}else {
						view.getTablero().getFichas()[jugadorJugando-1][ficha-1].setLocation(coorX, coorY);
					}
						
				}else {
					Thread.sleep(700);
					coorX =tablero.getRecorrido()[jugadorContador].getSector()[posicionActual].getX();
					coorY =tablero.getRecorrido()[jugadorContador].getSector()[posicionActual].getY();
					posicionActual=posicionActual+1;
					view.getTablero().getFichas()[jugadorJugando-1][ficha-1].setLocation(coorX, coorY);	
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].setUbicacionFicha(posicionActual);
	}	
	
	public void funcionar() {
		
	}
}

