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
         
		boolean salir = salirDeCelda();
		
		
//		for(int j =1;j<=50;j++) {
//			mover((int) (Math.random()*4+0),(int) (Math.random()*4+0),(int)(Math.random()*30+1));
//		}

		//				mover(3,2,21);
		//				mover(0,0,4);

						mover(0,0,4);
						mover(0,2,4);
						
						mover(3,2,21);

		//		mover(1,2,9);
		//		mover(1,3,9);
		//		mover(0,3,20);
		//		mover(0,3,6);
		//		mover(1,3,9);
		//		mover(0,3,6);


	}


	public boolean salirDeCelda(int numDadoUno,int numDadoDos) {
        if(numDadoUno==numDadoDos) {
        	return true;
        }
        return false;
	}


	public void lanzarDado() {


	}

	public void encadenarFicha(int jugadorJugando) {
		for(int i=0;i<fichasURL.size();i++) {
			for(int j=0;j<tablero.getJugadores().length;j++) {
				for(int k=0;k<4;k++) {
					if(view.getTablero().getFichas()[j][k].getIcon().toString().equals(fichasURL.get(i))) {

						//Agregar mover ficha enemiga a la prision
						view.getTablero().remove(view.getTablero().getFichas()[j][k]);
					}
				}
			}

		}
	}

	public boolean comerFicha(int jugadorJugando,int posicionActual,int paisEnDondeEsta,int ficha, int numeroDado) {
		fichasURL.clear();

		//		int posicionActual = tablero.getJugadores()[jugadorJugando].getFicha()[ficha].getPosicionFicha();
		//		System.out.println(posicionActual);
		//		//Muestra el numero de sectores que recorre hasta dar la vuelta
		//		int sectorActualGanar = tablero.getJugadores()[jugadorJugando].getFicha()[ficha].getPaisEnDondeEstaAhora();

		if((posicionActual+numeroDado) <=17) {
			posicionActual = posicionActual+numeroDado;
		}else {
			paisEnDondeEsta++;
			if(paisEnDondeEsta == 4) {
				paisEnDondeEsta = 0;
			}
			posicionActual = (posicionActual+numeroDado-17);
			System.out.println("resta:"+posicionActual);
		}

		/*
		 * No pasar la barrera
		 * no posicionar más de dos fichas en una celda
		 */

		//*No pasar la barrera
		//Encontrar dos fichas iguales posiciones y paises
		//mirar la ubicacion de la ficha mover
		//validar si alcanza a pasar


		boolean validacion = false;
		if(posicionActual != 4 && posicionActual != 11 && posicionActual !=16) {
			for (int i = 0; i < tablero.getJugadores().length ; i++) {

				for (int j = 0; j < tablero.getJugadores()[i].getFicha().length; j++) {

					System.out.println(posicionActual+"Depredador - "+ tablero.getJugadores()[i].getFicha()[j].getPosicionFicha());
					System.out.println(paisEnDondeEsta+"(pais) - "+ tablero.getJugadores()[i].getFicha()[j].getPaisEnDondeEstaAhora());

					if(posicionActual == tablero.getJugadores()[i].getFicha()[j].getPosicionFicha()
							&& (paisEnDondeEsta) == (tablero.getJugadores()[i].getFicha()[j].getPaisEnDondeEstaAhora())){

						fichasURL.add(view.getTablero().getFichas()[i][j].getIcon().toString());
						//No permite la salida si la ficha le pertenece al jugador
						if(i != jugadorJugando) {
							validacion = true;
						}
					}

				}

			}


			//Avisa que existe una barrera en la posición a la que va
			if(fichasURL.size() ==2) {
//				for(int k=0;k<4;k++) {
//					if(view.getTablero().getFichas()[jugadorJugando][k].getIcon().toString().equals(fichasURL.get(1))) {
//
//					}
//				}


				return false;
			}
		}
		if(validacion) {
			return true;
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
		boolean comerFicha = comerFicha(jugadorJugando, posicionFicha, paisEnDondeEsta , ficha, numeroDado);

		if(fichasURL.size() != 2){
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
							encadenarFicha(jugadorJugando);
						}
					}

					view.getTablero().getFichas()[jugadorJugando][ficha].setLocation(coorX,coorY);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			return;
		} 
		view.exportWindows("El terreno ya se encuentra ocupado por dos bases. Imposible posicionarse", "Avistamiento Fortaleza", 0);

	}

	public void funcionar() {

	}
}

