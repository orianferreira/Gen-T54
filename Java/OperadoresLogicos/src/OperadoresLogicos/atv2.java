package OperadoresLogicos;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade, dias, res, res2, res3;
		
		idade = 19;
		
		System.out.print("Quantos dias de vida você tem: ");
		dias = leia.nextInt();
		
		res = dias / 365;

		res2 = (dias % 365) / 30;

		res3 = (dias % 365) % 30;
		
		
		System.out.println("Você tem " + res + " Anos, " + res2 + " Meses e " + res3 + " Dias de vida!");
	}

}
