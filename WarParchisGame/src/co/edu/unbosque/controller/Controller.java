package co.edu.unbosque.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Tablero;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Tablero tablero;
	private ArrayList<String> fichasURL;

	public Controller(){

		tablero = new Tablero();
		tablero.generarJugadores(Integer.valueOf(JOptionPane.showInputDialog("ingrese el numero de jugadores")));
		fichasURL = new ArrayList<>();



		view = new View(generarCoordenadasInicio("X"),generarCoordenadasInicio("Y"), tablero.getJugadores().length);
		
			for(int j =1;j<=50;j++) {
				mover3((int) (Math.random()*4+1),(int) (Math.random()*4+1),(int)(Math.random()*30+1));
			}

	}

	public void encadenarFicha(int jugadorJugando) {
		for(int i=0;i<fichasURL.size();i++) {
			for(int j=0;j<tablero.getJugadores().length;j++) {
				for(int k=0;k<4;k++) {
					if(view.getTablero().getFichas()[j][k].getIcon().toString().equals(fichasURL.get(i))) {
						view.getTablero().remove(view.getTablero().getFichas()[j][k]);
						System.out.println("pase?");
					}
				}
			}

		}
	}

	public boolean preguntarComerFicha(int jugadorJugando,int ficha, int numeroDado) {
		int posicionActual = tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].getUbicacionFicha();
		//Muestra el numero de sectores que recorre hasta dar la vuelta
		int sectorActualGanar = tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].getVuelta();

		if((posicionActual+numeroDado) <=16) {
			posicionActual = posicionActual+numeroDado;
		}else {
			posicionActual = (posicionActual+numeroDado-16);
		}
		boolean validacion = false;
		if(posicionActual != 4 && posicionActual != 11 && posicionActual !=16) {
			for (int i = 0; i < tablero.getJugadores().length; i++) {
				if(i != jugadorJugando-1) {
					for (int j = 0; j < tablero.getJugadores()[i].getFicha().length; j++) {
						if(posicionActual == tablero.getJugadores()[i].getFicha()[j].getUbicacionFicha()
								&& (sectorActualGanar+jugadorJugando-1) == (tablero.getJugadores()[i].getFicha()[j].getVuelta()+i)){

							fichasURL.add(view.getTablero().getFichas()[i][j].getIcon().toString());
							validacion = true;
						}
					}
				}

			}

		}
		if(validacion) {
			return view.validationWindows("Puede derribar la unidad enemiga, ¿Desea proceder? ", "Avistamiento de enemigo");
		}else {
			return false;
		}

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



	public void mover3(int jugadorJugando,int ficha, int numeroDado) {
		int posicionActual = tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].getUbicacionFicha();
		int jugadorGanar =jugadorJugando-1;
		int jugadorContador = jugadorJugando-1+tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].getVuelta();
		if(jugadorContador>=4) {
			jugadorContador=jugadorContador-4;
		}
		int coorX=0;
		int coorY=0;
		boolean comerFicha = preguntarComerFicha(jugadorJugando, ficha, numeroDado);
		for(int x=0;x<numeroDado;x++) {
			try {
				if(posicionActual>tablero.getRecorrido()[jugadorJugando-1].getSector().length-1) {
					posicionActual=0;
					tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].setVuelta(tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].getVuelta()+1);
					jugadorContador = jugadorContador+1;
					if(jugadorContador>=4) {
						jugadorContador=0;
					}
				}
				if(tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].getVuelta()==4) {
					Thread.sleep(100);
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
					Thread.sleep(100);
					System.out.println("Jugador COntador:"+jugadorContador);
					System.out.println("Sector: "+tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].getVuelta());
					coorX =tablero.getRecorrido()[jugadorContador].getSector()[posicionActual].getX();
					coorY =tablero.getRecorrido()[jugadorContador].getSector()[posicionActual].getY();
					posicionActual=posicionActual+1;
					if(comerFicha) {	
						if(x==numeroDado-1) {
							encadenarFicha(jugadorJugando-1);
						}
					}
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

