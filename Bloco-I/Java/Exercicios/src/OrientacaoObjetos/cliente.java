package OrientacaoObjetos;

public class cliente {

	private String nome, cpf;
	private int idade;

	public cliente(String nome, String cpf, int idade) {

		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public void imprimirInfo() {
		System.out.println("\nCliente: " + nome + "\nCPF: " + cpf + "\nIdade: " + idade);
	}

}
