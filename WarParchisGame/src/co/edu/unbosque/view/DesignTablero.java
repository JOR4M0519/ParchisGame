package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction;
import javax.swing.tree.TreeCellRenderer;

import co.edu.unbosque.model.Celdas;
import co.edu.unbosque.model.Jugador;
import co.edu.unbosque.model.Sector;
import co.edu.unbosque.model.Tablero;

public class DesignTablero extends JPanel {

	private JLabel[][] fichas;
	private Jugador[] jugador;
	private JLabel fondo;
	private ImageIcon img;
	private int numJugadores;

	/**
	 * Create the panel.
	 */
	public DesignTablero(Jugador[] jugador,int numJugadores) {
		
		setLayout(null);
		this.jugador = jugador;
		this.numJugadores = numJugadores;
		System.out.println("Numero jugadores: "+numJugadores);
		fichas = new JLabel[numJugadores][4];
		
//		fichasInicio();

		img = new ImageIcon("./Data/Table.png");
		fondo = new JLabel();
		fondo.setBounds(0,0,675,675);
		fondo.setIcon(new ImageIcon(img.getImage()));
		add(fondo);

	}

	public void generarFondo() {
		img = new ImageIcon("./Data/Table.png");
		fondo = new JLabel();
		fondo.setBounds(0,0,675,675);
		fondo.setIcon(new ImageIcon(img.getImage()));
		add(fondo);
	}
	
	public void mover(int jugadorJugando,int ficha, int numeroDado, Tablero tablero) {

		int posicionActual = tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].getUbicacionFicha();
		int jugadorGanar =jugadorJugando-1;
		int jugadorContador = jugadorJugando-1;
		int coorX=0;
		int coorY=0;

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
				
					Thread.sleep(700);
					coorX =tablero.getRecorrido()[jugadorGanar].getFilaGanadora()[posicionActual].getX();
					coorY =tablero.getRecorrido()[jugadorGanar].getFilaGanadora()[posicionActual].getY();
					posicionActual=posicionActual+1;
					if(posicionActual>tablero.getRecorrido()[jugadorGanar].getFilaGanadora().length-1) {
						System.out.println("Ganaste perra");
						fichas[jugadorJugando-1][ficha-1].setLocation(1000, 1000);
					}else {
						fichas[jugadorJugando-1][ficha-1].setLocation(coorX, coorY);
					}
						
				}else {
					Thread.sleep(700);
					coorX =tablero.getRecorrido()[jugadorContador].getSector()[posicionActual].getX();
					coorY =tablero.getRecorrido()[jugadorContador].getSector()[posicionActual].getY();
					posicionActual=posicionActual+1;
					fichas[jugadorJugando-1][ficha-1].setLocation(coorX, coorY);	
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		jugador[jugadorJugando-1].getFicha()[ficha-1].setUbicacionFicha(posicionActual);

	}

	public void generarFichasInicio(int numJugador, int celdas,String url, int x, int y){
//		ImageIcon img = new ImageIcon(url);
		JLabel coordenada = new JLabel();
		System.out.println(x + " - "+y);
		coordenada.setBounds(x,y,25,25);
		coordenada.setIcon(new ImageIcon(new ImageIcon(url).getImage()));
		coordenada.setBackground(Color.BLACK);
		fichas[numJugador][celdas] = coordenada;
		add(coordenada);

	}
	
	public void agregarFichas() {
		remove(fondo);
		for(int j=0;j<fichas.length;j++) {
			for(int i=0;i<fichas[j].length;i++) {
				add(fichas[j][i]);
				System.out.println(fichas[j][i].getBackground());
				
				System.out.println("#j:"+j +" #i:" +i);
				
			}	
		}
		add(fondo);
	}
	
	public void fichasInicio() {

		fichas = new JLabel[jugador.length][4];

		for(int i=0;i<jugador.length;i++) {

			for(int x=0;x<4;x++) {
				ImageIcon img = new ImageIcon("./Data/"+i+"_"+(x+1)+".png");
				JLabel coordenada = new JLabel();
				coordenada.setBounds(jugador[i].getFicha()[x].getUbicacion().getX(),jugador[i].getFicha()[x].getUbicacion().getY(),25,25);
				coordenada.setIcon(new ImageIcon(img.getImage()));
				coordenada.setBackground(Color.BLACK);
<<<<<<< HEAD
				fichas[i][x] = coordenada;	
				add(fichas[i][x]);
			}			
		}
=======
				fichas[i][x] = coordenada;
				add(fichas[i][x]);
			}			
		}	
>>>>>>> 8ee5f0f3aa0f347b060d7f61737d8dff919111ef
	}


	
	public JLabel[][] getFichas() {
		return fichas;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}
	}