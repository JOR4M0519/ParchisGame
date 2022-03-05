package co.edu.unbosque.model;

public class Sector {

	private Celdas[] sectorUno;
	private Celdas vector;
	private String color;

	public Sector(String color) {
		sectorUno = new Celdas[17];
		this.color = color;
		moverLauIntentoArray();
	}

	public void moverLauIntentoArray() {
		int xCor =0;
		int yCor =0;
		int n = 0;

		if(color.equals("amarillo")) {
			xCor =402;
			yCor =513;
			n =1;
		}else if(color.equals("rojo")) {
			xCor =254;
			yCor =137;
			n=-1;
		}else if(color.equals("azul")) {
			xCor =521;
			yCor =250;
			n =1;
		}else if(color.equals("verde")) {
			xCor =141;
			yCor =398;
			n=-1;
		}

		if(color.equals("amarillo") || color.equals("rojo")) {

			for(int x=0;x<=16;x++) {

				if(sectorUno[0]==null) {
					sectorUno[0]=vector = new Celdas(xCor,yCor);
				}else if (x>0 && x<=3){
					yCor=yCor-33*n;
					sectorUno[x]=vector = new Celdas(xCor,yCor);
				}else if(x>3 && x<=11) {
					xCor = xCor+30*n;
					sectorUno[x]=vector = new Celdas(xCor,yCor-20*n);
				}else if(x>11 && x<=13) {
					yCor=yCor-80*n;
					sectorUno[x]=vector = new Celdas(xCor,yCor);
				}else if(x>13 && x<=16) {
					xCor = xCor-30*n;
					sectorUno[x] = vector = new Celdas(xCor,yCor);
				}
			}	
			return;
		}

		for(int x=0;x<=16;x++) {

			if(sectorUno[0]==null) {
				sectorUno[0]=vector = new Celdas(xCor,yCor);
			}else if (x>0 && x<=3){
				xCor=xCor-33*n;
				sectorUno[x]=vector = new Celdas(xCor,yCor);
			}else if(x>3 && x<=11) {
				yCor = yCor-30*n;
				sectorUno[x]=vector = new Celdas(xCor-20*n,yCor);
			}else if(x>11 && x<=13) {
				xCor=xCor-80*n;
				sectorUno[x]=vector = new Celdas(xCor,yCor);
			}else if(x>13 && x<=16) {
				yCor = yCor+30*n;
				sectorUno[x] = vector = new Celdas(xCor,yCor);
			}
		}	


	}

	public Celdas[] getSectorUno() {
		return sectorUno;
	}

	public void setSectorUno(Celdas[] sectorUno) {
		this.sectorUno = sectorUno;
	}

}
