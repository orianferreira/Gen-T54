package PolimorfismoHeranca;

public class Cavalo extends Animal {

	private boolean correr;

	public boolean isCorre() {
		return correr;
	}

	public void setCorre(boolean corre) {
		this.correr = corre;
	}

	public static void correr() {
		System.out.println("Cavalo correndo...");
	}

	public static void emitirSom() {
		System.out.println("IRRRIINN!");
	}
}
