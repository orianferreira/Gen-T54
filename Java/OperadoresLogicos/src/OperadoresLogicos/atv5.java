package OperadoresLogicos;

import java.util.Locale;
import java.util.Scanner;

public class atv5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Locale.setDefault(new Locale("en", "US"));

		double nota1, nota2, nota3, media;
		 
		String nome;
		
		System.out.print("Digite o nome do alune: ");
		nome = leia.next();
		
		System.out.print("Digite a 1° nota: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Digite a 2° nota: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Digite a 3° nota: ");
		nota3 = leia.nextDouble();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("A média ponderada é de: " + media);
	}

}
