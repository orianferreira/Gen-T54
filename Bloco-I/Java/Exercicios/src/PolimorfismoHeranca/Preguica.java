package PolimorfismoHeranca;

public class Preguica extends Animal {

	private boolean escala;

	public boolean isEscala() {
		return escala;
	}

	public void setEscala(boolean escala) {
		this.escala = escala;
	}

	public static void subirArvore() {
		System.out.println("Preguica subindo em arvores...");
	}

	public static void emitirSom() {
		System.out.println("AAAAAAHHHHZZZZ");
	}

}
