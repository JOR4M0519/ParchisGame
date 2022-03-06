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
	private JLabel coordenada;

	/**
	 * Create the panel.
	 */
	public DesignTablero(Jugador[] jugador) {

		setLayout(null);
		this.jugador = jugador;
		fichasInicio();

		img = new ImageIcon("./Data/Table.png");
		fondo = new JLabel();
		fondo.setBounds(0,0,675,675);
		fondo.setIcon(new ImageIcon(img.getImage()));
		add(fondo);

	}

	public void mover(int jugadorJugando,int ficha, int numeroDado, Tablero tablero) {

		int posicionActual = tablero.getJugadores()[jugadorJugando-1].getFicha()[ficha-1].getUbicacionFicha();
		int coorX=0;
		int coorY=0;

		for(int x=0;x<numeroDado;x++) {
			try {

				Thread.sleep(1000);

				coorX =tablero.getRecorrido()[jugadorJugando-1].getSector()[posicionActual].getX();
				coorY =tablero.getRecorrido()[jugadorJugando-1].getSector()[posicionActual].getY();
				posicionActual=posicionActual+1;

				fichas[jugadorJugando-1][ficha-1].setLocation(coorX, coorY);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		jugador[jugadorJugando-1].getFicha()[ficha-1].setUbicacionFicha(posicionActual);

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
				fichas[i][x] = coordenada;		
			}			
		}

		for(int x=0;x<fichas.length;x++) {
			for(int i=0;i<fichas[x].length;i++) {
				add(fichas[x][i]);
			}	
		}	
	}


	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}
	}