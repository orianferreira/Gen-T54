package br.com.generation.whilee;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int numero = -1;
		
		while (numero != 10) {
			System.out.println("Digite um número: ");
			numero = in.nextInt();
			
			if (numero % 2 == 0) {
				
				numero++;
				System.out.println("Incrementando valor: " + numero);
			}
			else {
				
				numero--;
				System.out.println("Decrementando valor: " + numero);
			}
		}

	}

}
