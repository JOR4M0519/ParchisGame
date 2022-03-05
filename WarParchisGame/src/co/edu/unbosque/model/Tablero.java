package co.edu.unbosque.model;
public class Tablero {

	private Sector sectorAmarillo,sectorAzul,sectorRojo,sectorVerde;
	private Sector[] unaVuelta;


	public Tablero(){

		unaVuelta = new Sector[4];

		unaVuelta[0] = sectorAmarillo = new Sector("amarillo");
		unaVuelta[1] = sectorAzul = new Sector("azul");
		unaVuelta[2] = sectorRojo = new Sector("rojo");
		unaVuelta[3] = sectorVerde = new Sector("verde");

	}


	public Sector[] getUnaVuelta() {
		return unaVuelta;
	}


	public void setUnaVuelta(Sector[] unaVuelta) {
		this.unaVuelta = unaVuelta;
	}


}
