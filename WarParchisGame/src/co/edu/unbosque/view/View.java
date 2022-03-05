package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.model.Jugador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class View extends JFrame {


	private DesignTablero tablero;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public View(Jugador[] jugador) {
		initiComponents(jugador);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 713);
		setLocationRelativeTo(null);

	}
	
	public void initiComponents(Jugador[] jugador) {
		tablero = new DesignTablero(jugador);
		getContentPane().add(tablero);
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
