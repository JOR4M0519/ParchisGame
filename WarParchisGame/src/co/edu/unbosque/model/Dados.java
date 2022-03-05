package co.edu.unbosque.model;

public class Dados {
	private int[] numeros;
	
	public Dados(int[] numeros) {
		this.numeros = numeros;
	}
	
	
	
	public int[] generarNumero() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random()*6+1);
		}
		return numeros;
	}

	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
	
}
