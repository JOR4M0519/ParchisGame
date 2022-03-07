package co.edu.unbosque.model;

public class Celdas {
	
    private int x;
    private int y;
    private int cantFichas;
    
    public Celdas(int x,int y) {
    	this.cantFichas = 0;
    	this.x = x;
    	this.y = y;
    }

	public int getCantFichas() {
		return cantFichas;
	}

	public void setCantFichas(int cantFichas) {
		this.cantFichas = cantFichas;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

    
}
