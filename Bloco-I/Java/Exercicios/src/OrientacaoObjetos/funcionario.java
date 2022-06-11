package OrientacaoObjetos;

public class funcionario {

	private String nome, cpf, cargo, salario, horario ;
	private int idade;

	public funcionario(String nome, String cpf, String cargo, String salario, String horario, int idade) {

		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
		this.horario = horario;
		this.idade = idade;
	}

	public void imprimirInfo() {
		System.out.println("\nFuncionarie: " + nome + "\nCPF: " + cpf + "\nIdade: " + idade + "\nCargo: " + cargo + "\nSalario: " + salario + "\nCarga horaria por dia: " + horario);
	}
	
}
