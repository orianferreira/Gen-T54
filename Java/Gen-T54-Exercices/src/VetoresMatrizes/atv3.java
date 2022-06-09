package VetoresMatrizes;

import java.util.Scanner;

public class atv3 {

	public static void main(String[] args) {

		int res1 = 0, res2 = 0;

		Scanner entrada = new Scanner(System.in);

		int[][] value = new int[2][2];

		System.out.println("--> Adicionando Notas dos Alunos <--");

		for (int l = 0; l < value.length; l++) {
			for (int c = 0; c < value[l].length; c++) {

				System.out.printf("Digite ás notas na posição da Matriz: %d° Linha %d° Coluna: ", (l + 1), (c + 1));
				value[l][c] = entrada.nextInt();
			}
			System.out.println();
		}

		res1 = value[0][0] + value[0][1];
		res2 = value[1][0] - value[1][1];

		System.out.println("--> Vizualizando Notas dos Alunos <--\n");

		for (int l = 0; l < value.length; l++) {
			for (int c = 0; c < value[l].length; c++) {

				System.out.print(value[l][c] + " | ");
			}
			System.out.println("\n");

		}

		System.out.println("A soma dos valores é: " + res1 + "\nA divisão dos valores é: " + res2);
	}

	/*
	 * 
	 * int[][] valor = new int[2][2];
	 * 
	 * valor[0][0] = 4; valor[0][1] = 6; valor[1][0] = 4; valor[1][1] = 6;
	 * 
	 * for (int l = 0; l < 2; l++) {
	 * 
	 * for (int c = 0; c < 2; c++) {
	 * 
	 * System.out.println(valor[l][c] + " | "); } System.out.println("\n"); }
	 * 
	 * for (int l = 0; l < 2; l++) {
	 * 
	 * for (int c = 0; c < 2; c++) {
	 * 
	 * res1 = valor[0][0] + valor[0][1]; } System.out.println("\n"); }
	 * 
	 * System.out.println("A soma dos valores é: " + res1);
	 * 
	 * for (int l = 0; l < 2; l++) {
	 * 
	 * for (int c = 0; c < 2; c++) {
	 * 
	 * res2 = valor[1][0] - valor[1][1]; } System.out.println("\n"); }
	 * System.out.println("A soma dos valores é: " + res2);
	 */
}
