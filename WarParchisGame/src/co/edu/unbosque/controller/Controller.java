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

//		for(int j =1;j<=50;j++) {
//			mover((int) (Math.random()*3+0),(int) (Math.random()*3+0),(int)(Math.random()*30+1));
//		}

				mover(2,3,72);
		//		mover(2,3,16);
		//		mover(2,3,4);
		//		mover(2,3,30);
		//		mover(2,3,2);
		//		mover(3, 3, 5);
		//		mover(3, 3, 30);
		//		mover(3, 3, 16);

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

		int posicionFicha= tablero.getJugadores()[jugadorJugando].getFicha()[ficha].getPosicionFicha();
		int paisEnDondeEsta = tablero.getJugadores()[jugadorJugando].getFicha()[ficha].getPaisEnDondeEstaAhora();
		int coorX=0;
		int coorY=0;

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
				view.getTablero().getFichas()[jugadorJugando][ficha].setLocation(coorX,coorY);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}


	public void funcionar() {

	}
}

