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
		int coorX=0;
		int coorY=0;

		switch(pais){

		case "EEUU": 
			coorX=537;
			coorY=85;
			break;

		case "CHINA":
			coorX=81;
			coorY=81;
			break;

		case "OTAN":
			coorX=87;
			coorY=534;
			break;

		case "UCRANIA":
			coorX=536;
			coorY=535;
			break;
		}

		for (int i = 0; i < 4; i++) {

			switch(i){
			case 0:ficha[0] = new Ficha(coorX,coorY,4);
			break;
			case 1:
				coorX=coorX+30;
				ficha[i] = new Ficha(coorX, coorY,4);
				coorX=coorX-30;
				break;
			case 2:
				coorY = coorY+30;
				ficha[i] = new Ficha(coorX, coorY,4);
				break;
			case 3:
				coorX=coorX+30;
				ficha[i] = new Ficha(coorX, coorY,4);
				break;
			}

		}
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
