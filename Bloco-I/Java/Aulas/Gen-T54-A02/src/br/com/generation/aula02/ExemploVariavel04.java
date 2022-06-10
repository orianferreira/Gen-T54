package br.com.generation.aula02;

import java.util.Scanner;

public class ExemploVariavel04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double a, b, soma, divisao, multiplicacao, subtracao;
		
		System.out.print("Digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		b = leia.nextDouble();
		
		soma = a + b;
		
		divisao = a / b;
		
		multiplicacao = a * b;
		
		subtracao = a - b;
		
		System.out.println("O resultado da soma é: " + soma);
		System.out.println("O resultado da subtração é: " + subtracao);
		System.out.println("O resultado da divisão é: " + divisao);
		System.out.println("O resultado da multiplicação é: " + multiplicacao);

	}

}
