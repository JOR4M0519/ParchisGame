package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.net.URI;
import java.net.URL;

import javax.swing.*;


public class PanelBotones extends JPanel{

	private ImageIcon img;
	private JLabel fondo;
	private JLabel dado1;
	private JLabel dado2;
	private JButton tirarDados;
	private JLabel turno;
	private JButton ficha1;
	private JButton ficha2;
	private JButton ficha3;
	private JButton ficha4;

	public PanelBotones() {
		
		setLayout(null);
		setBounds(675,0, 300, 675);
		
		
		ficha1 = new JButton();
		ficha1.setActionCommand("FICHA1");
		ficha1.setBounds(695, 125, 63, 53);
		ficha1.setOpaque(false);
		ficha1.setBorderPainted(false);
		ficha1.setContentAreaFilled(false);
		add(ficha1);
		
		ficha2 = new JButton();
		ficha2.setActionCommand("FICHA2");
		ficha2.setBounds((675+215),156,63,53);
		ficha2.setOpaque(false);
		ficha2.setBorderPainted(false);
		ficha2.setContentAreaFilled(false);
		add(ficha2);
		
		ficha3 = new JButton();
		ficha3.setActionCommand("FICHA3");
		ficha3.setBounds((675+20), 215, 63, 53);
		ficha3.setOpaque(false);
		ficha3.setBorderPainted(false);
		ficha3.setContentAreaFilled(false);
		add(ficha3);
		
		ficha4 = new JButton();
		ficha4.setActionCommand("FICHA4");
		ficha4.setBounds((218+675), 250, 63, 53);
		ficha4.setOpaque(false);
		ficha4.setBorderPainted(false);
		ficha4.setContentAreaFilled(false);
		add(ficha4);
		
		
		turno = new JLabel();
		turno.setBounds(710,50,235,50);
		turno.setHorizontalAlignment(SwingConstants.CENTER);
		turno.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 23));
		turno.setText("USA");
		add(turno);
		
		
		tirarDados = new JButton();
		tirarDados.setActionCommand("TIRAR_DADOS");
		tirarDados.setBounds(735, 323, 179, 70);
		tirarDados.setOpaque(false);
		tirarDados.setBorderPainted(false);
		tirarDados.setContentAreaFilled(false);
		add(tirarDados);
		
		dado1 = new JLabel();
		dado1.setBounds(725,450,90,88);
		dado1.setIcon(new ImageIcon(new ImageIcon("./Data/dado-0.png").getImage()));
		dado1.setBackground(Color.BLACK);
		add(dado1);
		
		dado2 = new JLabel();
		dado2.setBounds(817,540,90,88);
		dado2.setIcon(new ImageIcon(new ImageIcon("./Data/dado-0.png").getImage()));
		dado2.setBackground(Color.BLACK);
		add(dado2);
		
		img = new ImageIcon("./Data/Botones.png");
		fondo = new JLabel();
		fondo.setBounds(675,0,300,675);
		fondo.setIcon(new ImageIcon(img.getImage()));
		fondo.setBackground(Color.BLACK);
		add(fondo);
		
		
	}
	
	public void cambiarDado(int numDado1,int numDado2) {
		
			dado1.setIcon(new ImageIcon(new ImageIcon("./Data/dado-"+numDado1+".png").getImage()));
			dado2.setIcon(new ImageIcon(new ImageIcon("./Data/dado-"+numDado2+".png").getImage()));
		
	}

	public ImageIcon getImg() {
		return img;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public JLabel getDado1() {
		return dado1;
	}

	public JLabel getDado2() {
		return dado2;
	}

	public JButton getTirarDados() {
		return tirarDados;
	}

	public JLabel getTurno() {
		return turno;
	}

	public JButton getFicha1() {
		return ficha1;
	}

	public JButton getFicha2() {
		return ficha2;
	}

	public JButton getFicha3() {
		return ficha3;
	}

	public JButton getFicha4() {
		return ficha4;
	}
	
	
}
