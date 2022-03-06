package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.model.Jugador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class View extends JFrame {


	private DesignTablero tablero;
	private PanelBotones panelBotones;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public View(int[][] coordenadasX, int[][] coordenadasY, int numJugadores) {
		initiComponents(coordenadasX,coordenadasY, numJugadores);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 713);
		setLocationRelativeTo(null);

	}
	
	public void initiComponents(int[][] coordenadasX, int[][] coordenadasY, int numJugadores) {
		panelBotones = new PanelBotones();
		tablero = new DesignTablero(coordenadasX,coordenadasY, numJugadores);
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 0.01;
		c.weighty = 0;
		add(tablero, c);
		
		c.gridy = 0;
		c.gridx = 1;
		c.weightx = 0;
		c.weighty = 0;
		add(panelBotones, c);
		
	}

	   public String inputWindows(String info, String title, int messageType) {

	        return JOptionPane.showInputDialog(null, info, title, messageType);
	    }

	    public void exportConsole(String info) {
	        System.out.println(info);
	    }

	    public void exportWindows(String info, String title, int messageType) {
	        JOptionPane.showMessageDialog(null, info, title, messageType);
	    }

	    public boolean validationWindows(String info, String title) {
	        int answer = JOptionPane.showConfirmDialog(null, info, title,
	                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	        if (answer == 0) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	public DesignTablero getTablero() {
		return tablero;
	}

	public void setTablero(DesignTablero tablero) {
		this.tablero = tablero;
	}



}
