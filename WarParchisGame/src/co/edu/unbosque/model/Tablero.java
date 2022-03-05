package co.edu.unbosque.model;
public class Tablero {

	private Sector[] recorrido;

	public Tablero(){

		recorrido = new Sector[4];

		recorrido[0] = new Sector("amarillo");
		recorrido[1] = new Sector("azul");
		recorrido[2] = new Sector("rojo");
		recorrido[3] = new Sector("verde");

	}


	public Sector[] getRecorrido() {
		return recorrido;
	}


	public void setRecorrido(Sector[] unaVuelta) {
		this.recorrido = unaVuelta;
	}


}
