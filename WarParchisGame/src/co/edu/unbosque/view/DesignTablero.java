package co.edu.unbosque.view;

import java.awt.Color;
import javax.swing.*;

public class DesignTablero extends JPanel {

	private JLabel[][] fichas;
	private JLabel fondo;
	private ImageIcon img;

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