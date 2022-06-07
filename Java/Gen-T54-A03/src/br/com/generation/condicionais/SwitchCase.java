package br.com.generation.condicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva uma letra: ");
		char letra = entrada.next().charAt(0);

		switch(letra) {
		case 'a', 'A':
			System.out.println("Anya");
		break;
		
		case 'f', 'F':
			System.out.println("Forger");
		break;
		
		default:
			System.out.println("Anya Forger");
		break;
		}
	}

}
