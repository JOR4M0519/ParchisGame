package co.edu.unbosque.model;

public class Celdas {
	
    private int x;
    private int y;
    private boolean seguro;
    
    public Celdas(int x,int y) {
    	
    	this.x = x;
    	this.y = y;
    	
    }

    
    
	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
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
