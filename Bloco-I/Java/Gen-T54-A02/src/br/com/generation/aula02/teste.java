package br.com.generation.aula02;

import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));

		double galoes, litros;
		System.out.println("Digite a quantidade de galões: ");
		Scanner leia = new Scanner (System.in);
		
		galoes = leia.nextDouble();
		litros = galoes * 3.7854;
		System.out.println("A quantidade de litros de combustível é igual a "+litros+" litros.");

	}

}