package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.*;

public class DesignTablero extends JPanel {

	private JLabel fondo;
	private ImageIcon img;
	private JLabel coordenada;

	/**
	 * Create the panel.
	 */
	public DesignTablero() {
		setLayout(null);
		
		
		img = new ImageIcon("./Data/pngwing.com (1).png");
		coordenada = new JLabel();
		//1.5*[(-10x),(-10y)]
		coordenada.setBounds(402,648,15,21);
		coordenada.setIcon(new ImageIcon(img.getImage()));
		coordenada.setBackground(Color.BLACK);
		add(coordenada);
		
		img = new ImageIcon("./Data/Table 1_1.png");
		fondo = new JLabel();
		fondo.setBounds(0,0,675,675);
		fondo.setIcon(new ImageIcon(img.getImage()));
		add(fondo);
		
	
		
	}
	
	public void bucle() {
//		System.out.println("y");
		for (int i = 0; i < 50; i++) {

			try {
				Thread.sleep(1000);
				coordenada.setLocation(coordenada.getLocation().x, coordenada.getLocation().y-33);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 			
		}	
			
		}
	
	
	public void mover() {
		
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
