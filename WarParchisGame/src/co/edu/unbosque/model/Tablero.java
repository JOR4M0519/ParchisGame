package co.edu.unbosque.model;
public class Tablero {

	private Dados dados;
	private Jugador[] jugadores;
	private Sector[] recorrido;

	public Tablero(){

		recorrido = new Sector[4];
		recorrido[0] = new Sector("amarillo");
		recorrido[1] = new Sector("azul");
		recorrido[2] = new Sector("rojo");
		recorrido[3] = new Sector("verde");

	}

	public void generarJugadores(int numeroJugadores) {
		Jugador jugador;
		jugadores = new Jugador[numeroJugadores];
		String pais="";

		for(int i=0;i<numeroJugadores;i++) {
			
			switch(i){
			case 0: pais="EEUU";
			break;
			case 1: pais="CHINA";
			break;
			case 2: pais="OTAN";
			break;
			case 3: pais="UCRANIA";
			break;
			}

			jugadores[i]= jugador = new Jugador(pais);

		}	
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

	public Sector[] getRecorrido() {
		return recorrido;
	}

}
