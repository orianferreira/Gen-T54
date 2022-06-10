package br.com.generation.metodos;

import java.util.Scanner;

public class TestaMetodos {

	static int numero3 = 2, numero4 = 5, multiplicacao;

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o 1° Valor: ");
		numero3 = entrada.nextInt();
		
		System.out.println("Digite o 2° Valor: ");
		numero4 = entrada.nextInt();

		metodo01();
		System.out.println("Método Principal...");
		metodo03();
		metodo04();
		
		TestaMetodoFora.metodo05();
		
		metodo06(90, 20);
	}

	public static void metodo01() {

		System.out.println("Olá Sou o Método01!");
		metodo02();

	}

	public static void metodo02() {

		double numero1 = 10, numero2 = 30, soma;

		soma = numero1 + numero2;

		System.out.println("Soma realizada no Método02: " + soma);

	}

	public static void metodo03() {

		multiplicacao = numero3 * numero4;

	}

	public static void metodo04() {

		System.out.println("Método04 mostrando Multiplicação realizada no método03: " + multiplicacao);

	}
	
	public static void metodo06(int num5, int num6) {
		
		int subtracao = num5 - num6;
		
		System.out.println("Subtração feita no Método06: " + subtracao);
	}
}
