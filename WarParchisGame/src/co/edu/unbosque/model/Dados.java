package co.edu.unbosque.model;

public class Dados {
	private int[] numeros = new int[2];
	
	public Dados() {
		numeros[0]=0;
		numeros[1]=0;
	}
	
	public void generarNumero() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random()*6+1);
		}
	
	}

	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
	
}
