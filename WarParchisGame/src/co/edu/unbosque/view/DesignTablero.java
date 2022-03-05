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
		
		coordenada.setBounds(412,525,15,21);
//		coordenada.setBounds(275,350,10,14);
		coordenada.setIcon(new ImageIcon(img.getImage()));
//		coordenada.setBounds(50,50,20,10);
		coordenada.setBackground(Color.BLACK);
		add(coordenada);
		
		img = new ImageIcon("./Data/Table 1_1.png");
		fondo = new JLabel();
		fondo.setBounds(0,0,675,675);
		fondo.setIcon(new ImageIcon(img.getImage()));
		add(fondo);
		
	
		
	}
	
	public void bucle() {
		System.out.println("y");
		for (int i = 0; i < 50; i++) {
			System.out.println(i);	 
			coordenada.setLocation(coordenada.getLocation().x+1, coordenada.getLocation().y+1);
//			try {
//				Thread.sleep(1000);
//				mover();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 
			
			
			
		}
	}
	
	public void mover() {
		
	}
	
	
}
