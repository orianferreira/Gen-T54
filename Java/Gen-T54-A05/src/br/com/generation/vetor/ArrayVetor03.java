package br.com.generation.vetor;

import java.util.Scanner;

public class ArrayVetor03 {

	public static void main(String[] args) {

		Scanner entradaVetor = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do Vetor: ");
		
		int tamanhoVetor = entradaVetor.nextInt();
		
		int[] vetor = new int[tamanhoVetor];
		
		System.out.println("Tamanho do Vetor: " + vetor.length);
		
		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Deixe os Conteúdos do Vetor: ");
			vetor[i] = entradaVetor.nextInt();
		}
		
		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Posição: " + i + " Conteúdo " + vetor[i]);
		}
		
	}

}
