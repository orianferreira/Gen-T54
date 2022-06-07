package br.com.generation.aula02;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVariavel03 {

	public static void main(String[] args) {

		//byte n = -128;
		//byte n2 = 127;
		
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		System.out.print("Digite o numero de galões: ");
		galoes = leia.nextDouble();
		
		litros = galoes * 3.7854;
		
		System.out.println("A quantidade de litros de combustível é igual a " + litros + " litros...");

	}

}
