package co.edu.unbosque.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
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
		setBounds(0, 0, 1000, 705);
		setLocationRelativeTo(null);

	}
	
	public void initiComponents(int[][] coordenadasX, int[][] coordenadasY, int numJugadores) {
		panelBotones = new PanelBotones();
		tablero = new DesignTablero(coordenadasX,coordenadasY, numJugadores);
		
		add(tablero);
		add(panelBotones);
		
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

	public PanelBotones getPanelBotones() {
		return panelBotones;
	}



}
