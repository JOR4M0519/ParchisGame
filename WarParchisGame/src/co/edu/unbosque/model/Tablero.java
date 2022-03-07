package co.edu.unbosque.model;
public class Tablero {

	private Dados dados;
	private Jugador[] jugadores;
	private Sector[] recorrido;
	private int turno;

	public Tablero(){

		recorrido = new Sector[4];
		dados= new Dados();
		recorrido[0] = new Sector("EEUU");
		recorrido[1] = new Sector("CHINA");
		recorrido[2] = new Sector("OTAN");
		recorrido[3] = new Sector("UCRANIA");

	}

	public void generarJugadores(int numeroJugadores) {
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

			jugadores[i]= new Jugador(pais);

		}	
	}


	
	
	
	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
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
