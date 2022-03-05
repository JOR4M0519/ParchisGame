package co.edu.unbosque.model;
public class Tablero {
	private Dados dados;
	private Jugador[] jugadores;
	private Sector[] recorrido;

	public Tablero(int[] numJugadores,String[] paises){

		for (int i = 0; i < numJugadores.length; i++) {
			jugadores[i] = new Jugador("");
		}
		
		recorrido = new Sector[4];

		recorrido[0] = new Sector("amarillo");
		recorrido[1] = new Sector("azul");
		recorrido[2] = new Sector("rojo");
		recorrido[3] = new Sector("verde");

	}
	
	public void moverficha() {
		
	}


	public Sector[] getRecorrido() {
		return recorrido;
	}

	
	
	public Dados getDados() {
		return dados;
	}

	public void setDados(Dados dados) {
		this.dados = dados;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}


	public void setRecorrido(Sector[] unaVuelta) {
		this.recorrido = unaVuelta;
	}


}
