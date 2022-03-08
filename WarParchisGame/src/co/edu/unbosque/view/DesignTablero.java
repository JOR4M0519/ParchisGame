package co.edu.unbosque.view;

import java.awt.Color;
import javax.swing.*;

public class DesignTablero extends JPanel {

	private JLabel[][] fichas;
	private JLabel fondo;
	private ImageIcon img;
	private JLabel[] puntuacion;

	/**
	 * Create the panel.
	 */
	public DesignTablero(int[][] coordenadasX, int[][] coordenadasY, int numJugadores) {

		setLayout(null);
		setBounds(0, 0, 675, 675);
		fichasInicio(coordenadasX,coordenadasY,numJugadores);
		img = new ImageIcon("./Data/Table.png");
		fondo = new JLabel();
		fondo.setBounds(0,0,675,675);
		fondo.setIcon(new ImageIcon(img.getImage()));
		add(fondo);

	}

	public void fichasInicio(int[][] coordenadasX, int[][] coordenadasY,int numJugadores) {

		puntuacion = new JLabel[4];

		int[][] coordenadasPuntuacion = new int[2][4];
		
//		puntuacion[0].setBounds(451,206,47,13);
//		
//		puntuacion[1].setBounds(178,206,47,13);
//
//		puntuacion[2].setBounds(178,461,47,13);
//
//		puntuacion[3].setBounds(451,451,47,13);
//		
		coordenadasPuntuacion[0][0] = 473;
		coordenadasPuntuacion[1][0] = 206;

		coordenadasPuntuacion[0][1] = 200;
		coordenadasPuntuacion[1][1] = 206;
		
		coordenadasPuntuacion[0][2] = 200;
		coordenadasPuntuacion[1][2] = 461;
		
		coordenadasPuntuacion[0][3] = 473;
		coordenadasPuntuacion[1][3] = 461;
		
			for(int x=0;x<4;x++) {
				JLabel coordenada = new JLabel();
				coordenada.setBounds(coordenadasPuntuacion[0][x],coordenadasPuntuacion[1][x],47,13);
				
				puntuacion[x] = coordenada;	
				add(puntuacion[x]);	
				puntuacion[x].setForeground(Color.WHITE);
				puntuacion[x].setText("0");
		}
		
		

//		for (int i = 0; i < puntuacion.length; i++) {
//			puntuacion[i].setText("0");
//			add(puntuacion[i]);
//		}
		
		
		fichas = new JLabel[numJugadores][4];

		for(int i=0;i<numJugadores;i++) {

			for(int x=0;x<4;x++) {
				ImageIcon img = new ImageIcon("./Data/"+i+"_"+(x+1)+".png");
				JLabel coordenada = new JLabel();
				coordenada.setBounds(coordenadasX[i][x],coordenadasY[i][x],25,25);
				coordenada.setIcon(new ImageIcon(img.getImage()));
				coordenada.setBackground(Color.BLACK);
				fichas[i][x] = coordenada;	
				add(fichas[i][x]);
			}			
		}
	}

	
	
	public JLabel[] getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(JLabel[] puntuacion) {
		this.puntuacion = puntuacion;
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