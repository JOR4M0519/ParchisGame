package co.edu.unbosque.model;

public class Fachada {
	
	private Tablero tablero;
	
	public Fachada() {
		
		tablero = new Tablero();
		
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}
	
}
