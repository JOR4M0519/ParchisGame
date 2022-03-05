package co.edu.unbosque.model;

public class Jugador {

	private Ficha ficha[];
	private String pais;
	
	public Jugador(String pais) {
		this.pais = pais;
		ficha = new Ficha[4];
		generarFichas();
		
	}
	
	public void generarFichas() {
		for (int i = 0; i < ficha.length; i++) {
			ficha[0] = new Ficha(convertirCoordenadas(pais)[0], convertirCoordenadas(pais)[1]);
		}
	}
	
	public int[] convertirCoordenadas(String pais) {
		int[] coordenadas = new int[2];
		
		switch(pais){
			
		case "EEUU": 
			coordenadas[0]=0;
			coordenadas[1]=0;
			break;
			
		case "CHINA":
			coordenadas[0]=0;
			coordenadas[1]=0;
			break;
			
		case "OTAN":
			coordenadas[0]=0;
			coordenadas[1]=0;
			break;
			
		case "UCRANIA":
			coordenadas[0]=0;
			coordenadas[1]=0;
			break;
		}
		
		return coordenadas;
	}

	public Ficha[] getFicha() {
		return ficha;
	}

	public void setFicha(Ficha[] ficha) {
		this.ficha = ficha;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
}
