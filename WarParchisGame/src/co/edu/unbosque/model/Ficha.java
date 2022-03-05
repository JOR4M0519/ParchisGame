package co.edu.unbosque.model;

public  class Ficha extends Habilidades{
	private Celdas ubicacion;
	private String tipoFicha;
	private String urlIlustracion;
	
	
	public Ficha(int x, int y) {
		this.ubicacion = new Celdas(x, y);
		
	}
	

	public void movimiento(){
    	
    }

	@Override
	public void activarHabilidadEspecial() {
	
		
	}
    
	
	
    public String getUrlIlustracion() {
		return urlIlustracion;
	}


	public void setUrlIlustracion(String urlIlustracion) {
		this.urlIlustracion = urlIlustracion;
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
	
}
