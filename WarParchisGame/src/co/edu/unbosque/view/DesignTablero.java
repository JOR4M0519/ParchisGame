package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

import co.edu.unbosque.model.Celdas;
import co.edu.unbosque.model.Sector;
import co.edu.unbosque.model.Tablero;

public class DesignTablero extends JPanel {
	//Lau
	private Tablero tablero;
	
	//Lau
	private JLabel fondo;
	private ImageIcon img;
	private JLabel coordenada;



	/**
	 * Create the panel.
	 */
	public DesignTablero() {
		tablero = new Tablero();
		setLayout(null);
		
		img = new ImageIcon("./Data/pngwing.com (1).png");
		coordenada = new JLabel();
		coordenada.setBounds(402,513,15,21);
		coordenada.setIcon(new ImageIcon(img.getImage()));
		coordenada.setBackground(Color.BLACK);
		add(coordenada);

		img = new ImageIcon("./Data/Table 1_1.png");
		fondo = new JLabel();
		fondo.setBounds(0,0,675,675);
		fondo.setIcon(new ImageIcon(img.getImage()));
		add(fondo);

	}
	
	public void mover(String colorFicha) {
		
		for(int x=0;x<4;x++) {
		for (int i = 0; i <= 16; i++) {
			try {
				Thread.sleep(1000);
				coordenada.setLocation(tablero.getUnaVuelta()[x].getSectorUno()[i].getX(),tablero.getUnaVuelta()[x].getSectorUno()[i].getY());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 			
		}	
		}
	}


	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

	public JLabel getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(JLabel coordenada) {
		this.coordenada = coordenada;
	}


}
