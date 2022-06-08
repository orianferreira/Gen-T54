package LacoDeRepeticao;

import javax.swing.JOptionPane;

public class atv3 {

	public static void main(String[] args) {

		int total1 = 0, total2 = 0, total3 = 0, contador = 0, idade = 0;
		
		while (idade != -99) {
			
			contador++;
			
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + contador + "° idade: "));
			
			if (idade >= 1 && idade < 21) {
				
				total1++;
			}
			else if (idade > 50) {
				
				total2++;
			}
			else if (idade < 0) {
				
				System.out.println("Esta Idade não é válida!");
			}
			else {
				
				total3++;
			}
		}
		
		System.out.println("Programa finalizado!\n\n" + "Há um Total de:\n" + total1 + " pessoas com menos de 21 Anos.\n" + total3 + " Pessoas com a idade entre 21 e 50.\n" + total2 + " Pessoas com mais de 50 anos.");
	}

}
