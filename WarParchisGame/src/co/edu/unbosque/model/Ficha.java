package co.edu.unbosque.model;

public  class Ficha extends Habilidades{
	
	private Celdas ubicacion;
	private String tipoFicha;
	private int ubicacionFicha;
	private int vuelta;

	
	public Ficha(int x, int y,int ubicacionFicha,int vuelta) {
		this.ubicacion = new Celdas(x, y);
		this.ubicacionFicha = ubicacionFicha;
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


	public int getUbicacionFicha() {
		return ubicacionFicha;
	}


	public void setUbicacionFicha(int ubicacionFicha) {
		this.ubicacionFicha = ubicacionFicha;
	}


	public int getVuelta() {
		return vuelta;
	}


	public void setVuelta(int vuelta) {
		this.vuelta = vuelta;
	}
	
}
