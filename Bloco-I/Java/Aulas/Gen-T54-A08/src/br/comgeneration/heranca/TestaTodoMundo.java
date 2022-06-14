package br.comgeneration.heranca;

import java.util.Scanner;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Professor prof1 = new Professor();//Construtor de classe, ele um espaço em memoria para criação do objeto
				
		System.out.println("Digite o nome do Professor: ");
		prof1.setNome(entrada.next());
		prof1.setIdade(25);
		prof1.setEndereco("Rua: Das Nações, 255 - SP");
		
		prof1.setSalario(10000.00);
		
		prof1.setDisciplina("Geografia");
		
		System.out.println(prof1.getNome());
		System.out.println(prof1.getIdade());
		System.out.println(prof1.getEndereco());
		System.out.println(prof1.getSalario());
		System.out.println(prof1.getDisciplina());
		System.out.println();
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Vanessa");
		aluno1.setIdade(22);
		aluno1.setEndereco("Rua: Dos Alunos, 900");
		aluno1.setSemestre("6º semestre");
		aluno1.setCurso("Analise de Sistemeas");
		
		System.out.println("Nome do Aluno: " + aluno1.getNome());
		
		
		FuncAdm func1 = new FuncAdm();
		
		func1.setNome("Ana Marcela");
		
		System.out.println("Nome do Funcionário Adm: "  + func1.getNome());
	}

}
