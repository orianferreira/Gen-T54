package PolimorfismoHeranca;

public class Animal {

	private String nome;
	private int idade;
	private boolean som;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;
	}

	public static void emitirSom() {
		System.out.println("...");
	}
}
