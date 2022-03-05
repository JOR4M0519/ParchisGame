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
			xCor =399;
			yCor =645;
			n =1;
		}else if(color.equals("rojo")) {
			xCor =250;
			yCor =3;
			n=-1;
		}else if(color.equals("azul")) {
			xCor =644;
			yCor =252;
			n =1;
		}else if(color.equals("verde")) {
			xCor =4;
			yCor =397;
			n=-1;
		}

		if(color.equals("amarillo") || color.equals("rojo")) {

			for(int x=0;x<=16;x++) {

				if(sectorUno[0]==null) {
					sectorUno[0]=vector = new Celdas(xCor,yCor);
				}else if (x>0 && x<=7){
					yCor=yCor-32*n;
					sectorUno[x]=vector = new Celdas(xCor,yCor);
				}else if(x>7 && x<=15) {
					xCor = xCor+32*n;
					sectorUno[x]=vector = new Celdas(xCor-11*n,yCor-23*n);
				}else if(x>15 && x<=16) {
					yCor=yCor-97*n;
					sectorUno[x]=vector = new Celdas(xCor-10*n,yCor);
				}

			}	
			return;
		}

		for(int x=0;x<=16;x++) {

			if(sectorUno[0]==null) {
				sectorUno[0]=vector = new Celdas(xCor,yCor);
			}else if (x>0 && x<=7){
				xCor=xCor-32*n;
				sectorUno[x]=vector = new Celdas(xCor,yCor);
			}else if(x>7 && x<=15) {
				yCor = yCor-32*n;
				sectorUno[x]=vector = new Celdas(xCor-20*n,yCor+9*n);
			}else if(x>15 && x<=16) {
				xCor=xCor-97*n;
				sectorUno[x]=vector = new Celdas(xCor+1*n,yCor+8*n);
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
