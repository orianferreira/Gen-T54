package OrientacaoObjetos;

public class bancaria {

	private String nome, cpf, senha, marca;
	private int idade;
	private double saldo;
	private boolean digital;

	public bancaria(String nome, String cpf, int idade, String marca, String senha, boolean digital, double saldo ) {

		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.marca = marca;
		this.senha = senha;
		this.digital = digital;
		this.saldo = saldo;
	}

	public void imprimirInfo() {
		System.out.println("\nCliente: " + nome + "\nCPF: " + cpf + "\nIdade: " + idade + "\nMarca: " + marca + "\nSenha: " + senha + "\nBiometria: " + digital + "\nSaldo: " + saldo);
	}
	
}
