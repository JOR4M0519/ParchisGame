package co.edu.unbosque.model;

public  class Ficha extends Habilidades{
	
	private Celdas ubicacion;
	private String tipoFicha;
	private int posicionFicha,paisEnDondeEstaAhora;
	private int vuelta;

	
	public Ficha(int x, int y,int posicionFicha,int paisEnDondeEstaAhora,int vuelta) {
		this.ubicacion = new Celdas(x, y);
		this.posicionFicha = posicionFicha;
		this.paisEnDondeEstaAhora = paisEnDondeEstaAhora;
		this.vuelta = vuelta;
	}
	

	public void movimiento(){
    	
    }

	public void activarHabilidadEspecial() {
	
		
	}
    

	public Celdas getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Celdas ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTipoFicha() {
		return tipoFicha;
	}

	public void setTipoFicha(String tipoFicha) {
		this.tipoFicha = tipoFicha;
	}

	public int getPosicionFicha() {
		return posicionFicha;
	}


	public void setPosicionFicha(int posicionFicha) {
		this.posicionFicha = posicionFicha;
	}


	public int getPaisEnDondeEstaAhora() {
		return paisEnDondeEstaAhora;
	}


	public void setPaisEnDondeEstaAhora(int paisEnDondeEstaAhora) {
		this.paisEnDondeEstaAhora = paisEnDondeEstaAhora;
	}


	public int getVuelta() {
		return vuelta;
	}

	public void setVuelta(int vuelta) {
		this.vuelta = vuelta;
	}
	
}
