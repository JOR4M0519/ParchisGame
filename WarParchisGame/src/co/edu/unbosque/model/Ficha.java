package co.edu.unbosque.model;

public  class Ficha extends Habilidades{
	
	private Celdas ubicacion;
	private String tipoFicha;
<<<<<<< HEAD
	private String urlImagen;
=======
	private String urlIlustracion;
	
>>>>>>> Yopalito
	
	public Ficha(int x, int y) {
		this.ubicacion = new Celdas(x, y);
	}
	

	public void movimiento(){
    	
    }

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

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	
}
