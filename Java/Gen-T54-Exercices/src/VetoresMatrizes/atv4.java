package VetoresMatrizes;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[][] valor = new int[3][3];
		int res = 0;

		for (int l = 0; l < 3; l++) {

			for (int c = 0; c < 3; c++) {

				System.out.printf("Digite ás notas na posição da Matriz: %d° Linha %d° Coluna: ", (l + 1), (c + 1));
				valor[l][c] = entrada.nextInt();
			}

			System.out.println("\n");
			res = valor[0][0] + valor[1][1] + valor[2][2];
		}

		System.out.println(
				valor[0][0] + " | " + valor[0][1] + " | " + valor[0][2] + "\n" + valor[1][0] + " | " + valor[1][1]
						+ " | " + valor[1][2] + "\n" + valor[2][0] + " | " + valor[2][1] + " | " + valor[2][2] + "\n");

		System.out.println("\nA soma dos valores da diagonal é " + res);
	}

}
