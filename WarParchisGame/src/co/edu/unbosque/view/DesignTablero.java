package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

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
		

		img = new ImageIcon("./Data/EEUU_1.png");
		coordenada = new JLabel();
		coordenada.setBounds(402,513,25,25);
		coordenada.setIcon(new ImageIcon(img.getImage()));
		coordenada.setBackground(Color.BLACK);
		add(coordenada);

		img = new ImageIcon("./Data/Table.png");
		fondo = new JLabel();
		fondo.setBounds(0,0,675,675);
		fondo.setIcon(new ImageIcon(img.getImage()));
		add(fondo);

	}

	public void mover(String colorFicha) {

//		for(int x=0;x<4;x++) {
//			for (int i = 0; i <= 16; i++) {
//				try {
//					Thread.sleep(1000);
//					coordenada.setLocation(tablero.getRecorrido()[x].getSector()[i].getX(),tablero.getRecorrido()[x].getSector()[i].getY());
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				} 			
//			}	
//			
//		}
//		for(int x=0;x<4;x++) {
//			for (int i = 0; i <8; i++) {
//				try {
//					Thread.sleep(1000);
//					coordenada.setLocation(tablero.getRecorrido()[x].getFilaGanadora()[i].getX(),tablero.getRecorrido()[x].getFilaGanadora()[i].getY());
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				} 
//			}
//		}

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
		
		moverfichas();
	}

	public void moverfichas() {
		
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


	public JLabel getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(JLabel coordenada) {
		this.coordenada = coordenada;
	}


}
