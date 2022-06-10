package br.com.generation.classes;

public class TesteAluno {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.nome = "Rian De A. Ferreira";
		aluno1.idade = 19;
		aluno1.curso = "Java Bloco I";
		
		System.out.println(aluno1.nome);
		System.out.println(aluno1.idade);
		System.out.println(aluno1.curso);
		
		aluno1.assistirAula();
		aluno1.estudar();
		
		System.out.println("\n");
		
		aluno2.nome = "Felipe Camilo";
		aluno2.idade = 22;
		aluno2.curso = "Java Bloco I";
		
		System.out.println(aluno2.nome);
		System.out.println(aluno2.idade);
		System.out.println(aluno2.curso);
		
		aluno2.assistirAula();
		aluno2.estudar();
	}

}
