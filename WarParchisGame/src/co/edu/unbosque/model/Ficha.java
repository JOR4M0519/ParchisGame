package co.edu.unbosque.model;

public  class Ficha extends Habilidades{
	
	private Celdas ubicacion;
	private String tipoFicha;
	private String urlImagen;
	
	public Ficha(int x, int y) {
		this.ubicacion = new Celdas(x, y);
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

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	
}
