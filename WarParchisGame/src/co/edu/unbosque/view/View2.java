package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class View2 extends JFrame {

	
	private DesignTablero tablero;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					View2 frame = new View2();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public View2() {
		tablero = new DesignTablero();
		getContentPane().add(tablero);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(0, 0, 466, 488);
		setBounds(0, 0, 800, 800);

		
		
	
	}

	public DesignTablero getTablero() {
		return tablero;
	}

	public void setTablero(DesignTablero tablero) {
		this.tablero = tablero;
	}

	

}
