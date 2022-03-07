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
            mover((int) (Math.random()*3+0),(int) (Math.random()*3+0),(int)(Math.random()*30+1));
        }
		
	}

	public void encadenarFicha(int jugadorJugando) {
		for(int i=0;i<fichasURL.size();i++) {
			for(int j=0;j<tablero.getJugadores().length;j++) {
				for(int k=0;k<4;k++) {
					if(view.getTablero().getFichas()[j][k].getIcon().toString().equals(fichasURL.get(i))) {
						view.getTablero().remove(view.getTablero().getFichas()[j][k]);
					}
				}
			}

		}
	}

	public boolean preguntarComerFicha(int jugadorJugando,int ficha, int numeroDado) {
		int posicionActual = tablero.getJugadores()[jugadorJugando].getFicha()[ficha].getPosicionFicha();
		//Muestra el numero de sectores que recorre hasta dar la vuelta
		int sectorActualGanar = tablero.getJugadores()[jugadorJugando].getFicha()[ficha].getVuelta();

		if((posicionActual+numeroDado) <=16) {
			posicionActual = posicionActual+numeroDado;
		}else {
			posicionActual = (posicionActual+numeroDado-16);
		}
		boolean validacion = false;
		if(posicionActual != 4 && posicionActual != 11 && posicionActual !=16) {
			for (int i = 0; i < tablero.getJugadores().length; i++) {
				if(i != jugadorJugando) {
					for (int j = 0; j < tablero.getJugadores()[i].getFicha().length; j++) {
						if(posicionActual == tablero.getJugadores()[i].getFicha()[j].getPosicionFicha()
								&& (sectorActualGanar+jugadorJugando) == (tablero.getJugadores()[i].getFicha()[j].getVuelta()+i)){

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


	public void mover(int jugadorJugando,int ficha, int numeroDado) {

		int posicionFicha= tablero.getJugadores()[jugadorJugando].getFicha()[ficha].getPosicionFicha();
		int paisEnDondeEsta = tablero.getJugadores()[jugadorJugando].getFicha()[ficha].getPaisEnDondeEstaAhora();
		int coorX=0;
		int coorY=0;
		boolean comerFicha = preguntarComerFicha(jugadorJugando, ficha, numeroDado);

		for(int x=0;x<numeroDado;x++) {
			if(posicionFicha>16) {
				posicionFicha = 0;
				tablero.getJugadores()[jugadorJugando].getFicha()[ficha].setVuelta(tablero.getJugadores()[jugadorJugando].getFicha()[ficha].getVuelta()+1);
				paisEnDondeEsta= paisEnDondeEsta+1;
				if(paisEnDondeEsta>3) {
					paisEnDondeEsta=0;
				}
			}

			if(tablero.getJugadores()[jugadorJugando].getFicha()[ficha].getVuelta()==4) {	
				coorX = tablero.getRecorrido()[jugadorJugando].getFilaGanadora()[posicionFicha].getX();
				coorY = tablero.getRecorrido()[jugadorJugando].getFilaGanadora()[posicionFicha].getY();

				if(posicionFicha>=7) {
					try {
						Thread.sleep(200);
						view.getTablero().getFichas()[jugadorJugando][ficha].setLocation(coorX,coorY);
						System.out.println("Ganaste perra");
						view.getTablero().getFichas()[jugadorJugando][ficha].setLocation(1000, 1000);
						return;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}		
				posicionFicha = posicionFicha+1;
				tablero.getJugadores()[jugadorJugando].getFicha()[ficha].setPosicionFicha(posicionFicha);

			}else {
				coorX = tablero.getRecorrido()[paisEnDondeEsta].getSector()[posicionFicha].getX();
				coorY = tablero.getRecorrido()[paisEnDondeEsta].getSector()[posicionFicha].getY();
				posicionFicha = posicionFicha+1;
				tablero.getJugadores()[jugadorJugando].getFicha()[ficha].setPaisEnDondeEstaAhora(paisEnDondeEsta);
				tablero.getJugadores()[jugadorJugando].getFicha()[ficha].setPosicionFicha(posicionFicha);
			}

			try {
				Thread.sleep(200);

				if(comerFicha) {	
					if(x==numeroDado-1) {
						encadenarFicha(jugadorJugando-1);
					}
				}

				view.getTablero().getFichas()[jugadorJugando][ficha].setLocation(coorX,coorY);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public void funcionar() {

	}
}

