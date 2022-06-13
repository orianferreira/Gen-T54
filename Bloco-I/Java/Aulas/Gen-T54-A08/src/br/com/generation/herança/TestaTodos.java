package br.com.generation.herança;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestaTodos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Professor prof1 = new Professor();

		prof1.setNome("Jeff");
		prof1.setIdade(35);
		prof1.setEndereco("Rua: Das Nações, 255 - SP");
		prof1.setSalario(5000.00);
		prof1.setDisciplina("Java");

		System.out.println("Nome do professor" + prof1.getNome());
		System.out.println("Idade: " + prof1.getIdade());
		System.out.println("Endereço: " + prof1.getEndereco());
		System.out.println("Salario: " + prof1.getSalario());
		System.out.println("Disciplina: " + prof1.getDisciplina());
		
		System.out.println("\n");
		
		

		Aluno aluno1 = new Aluno();

		aluno1.setNome("Rian");
		aluno1.setIdade(19);
		aluno1.setEndereco("Rua: Da Paz, 41 - SP");
		aluno1.setSemestre("1° Bloco");
		aluno1.setCurso("Desenvolvimento Fullstack Java");
		
		/*System.out.print("Digite seu Nome: ");
		aluno1.setNome(entrada.next());
		
		System.out.print("Digite sua Idade: ");
		aluno1.setIdade(entrada.nextInt());
		
		System.out.print("Digite seu Endereço: ");
		aluno1.setEndereco(entrada.next());
		
		System.out.print("Digite seu Bloco: ");
		aluno1.setSemestre(entrada.next());
		
		System.out.print("Digite seu Curso: ");
		aluno1.setCurso(entrada.next());
		*/
		
		System.out.println("\nNome do aluno: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Endereço: " + aluno1.getEndereco());
		System.out.println("Semestre: " + aluno1.getSemestre());
		System.out.println("Curso: " + aluno1.getCurso());
		
		
		
		FuncAdm func1 = new FuncAdm();
		
		func1.setNome("Helo");
	}

}
