package br.com.generation.sobrecargametodos;

import java.util.Scanner;

public class TestaCalculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double numero1 = entrada.nextDouble();
		double numero2 = entrada.nextDouble();
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		System.out.println(calc.soma(numero1, numero2));
		
		//System.out.println(calc.soma(10, 100));
		//System.out.println(calc.soma(10.0, 100.0));

	}

}
