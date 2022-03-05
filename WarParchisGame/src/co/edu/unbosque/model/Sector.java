package co.edu.unbosque.model;

public class Sector {

	private Celdas[] sector;
	private String color;

	public Sector(String color) {
		sector = new Celdas[17];
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

				if(sector[0]==null) {
					sector[0]=new Celdas(xCor,yCor);
				}else if (x>0 && x<=7){
					yCor=yCor-32*n;
					sector[x]=new Celdas(xCor,yCor);
				}else if(x>7 && x<=15) {
					xCor = xCor+32*n;
					sector[x]=new Celdas(xCor-11*n,yCor-23*n);
				}else if(x>15 && x<=16) {
					yCor=yCor-97*n;
					sector[x]=new Celdas(xCor-10*n,yCor);
				}

			}	
			return;
		}

		for(int x=0;x<=16;x++) {

			if(sector[0]==null) {
				sector[0]=new Celdas(xCor,yCor);
			}else if (x>0 && x<=7){
				xCor=xCor-32*n;
				sector[x]=new Celdas(xCor,yCor);
			}else if(x>7 && x<=15) {
				yCor = yCor-32*n;
				sector[x]=new Celdas(xCor-20*n,yCor+9*n);
			}else if(x>15 && x<=16) {
				xCor=xCor-97*n;
				sector[x]=new Celdas(xCor+1*n,yCor+8*n);
			}
		}	


	}

	public Celdas[] getSector() {
		return sector;
	}

	public void setSector(Celdas[] sectorUno) {
		this.sector = sectorUno;
	}

}
