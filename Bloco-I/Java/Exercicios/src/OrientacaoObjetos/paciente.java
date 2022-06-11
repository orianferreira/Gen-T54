package OrientacaoObjetos;

public class paciente {

	private String nome, cpf, diagnostico, tratamento;
	private int idade;

	public paciente(String nome, String cpf, int idade, String diagnostico, String tratamento) {

		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.diagnostico = diagnostico;
		this.tratamento = tratamento;
	}

	public void imprimirInfo() {
		System.out.println("\nCliente: " + nome + "\nCPF: " + cpf + "\nIdade: " + idade + "\nDiagnostico: " + diagnostico + "\nTratamento: " + tratamento);
	}
	
}
