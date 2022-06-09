package br.com.generation.matriz;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[][] notaAluno = new double[2][4];

		System.out.println("--> Adicionando Notas dos Alunos <--");

		for (int l = 0; l < notaAluno.length; l++) {
			for (int c = 0; c < notaAluno[l].length; c++) {

				System.out.printf("Digite ás notas na posição da Matriz: %d° Linha %d° Coluna:", (l+1), (c+1));
				notaAluno[l][c] = entrada.nextDouble();
			}
			System.out.println();
		}
		
		System.out.println("--> Vizualizando Notas dos Alunos <--");

		for (int l = 0; l < notaAluno.length; l++) {
			for (int c = 0; c < notaAluno[l].length; c++) {

				System.out.print(notaAluno[l][c] + " | ");
			}
			System.out.println();
		}

	}

}
