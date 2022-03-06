package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBotones extends JPanel{

	private ImageIcon img;
	private JLabel fondo;

	public PanelBotones() {
		img = new ImageIcon("./Data/PanelBotones.png");
		fondo = new JLabel();
		fondo.setBounds(675,0,300,675);
		fondo.setIcon(new ImageIcon(img.getImage()));
		fondo.setBackground(Color.BLACK);
		add(fondo);
	}
}
