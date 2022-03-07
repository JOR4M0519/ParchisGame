package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBotones extends JPanel{

	private ImageIcon img;
	private JLabel fondo;

	public PanelBotones() {
		
		setLayout(null);
		setBounds(675,0, 300, 675);
		
		JLabel dado = new JLabel();
		dado.setBounds(675,0,300,675);
		dado.setIcon(new ImageIcon(new ImageIcon("./Data/3_4.png").getImage()));
		dado.setBackground(Color.BLACK);
		add(dado);
		
		img = new ImageIcon("./Data/PanelBotones.png");
		fondo = new JLabel();
		fondo.setBounds(675,0,300,675);
		fondo.setIcon(new ImageIcon(img.getImage()));
		fondo.setBackground(Color.BLACK);
		add(fondo);
		
		
	}
}
