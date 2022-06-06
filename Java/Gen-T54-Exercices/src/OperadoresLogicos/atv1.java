package OperadoresLogicos;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, res;
		
		System.out.print("Quantos anos você tem: ");
		anos = leia.nextInt();
		
		System.out.print("Quantos meses você tem: ");
		meses = leia.nextInt();
		
		System.out.print("Quantos dias você tem: ");
		dias = leia.nextInt();
		
		res = anos * 365 + meses * 31 + dias;
		
		System.out.println("Você tem " + res + " dias de vida!");
	}

}
