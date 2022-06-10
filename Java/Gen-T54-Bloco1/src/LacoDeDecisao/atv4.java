package LacoDeDecisao;

import javax.swing.JOptionPane;

import java.lang.Math;

public class atv4 {

	public static void main(String[] args) {
		
		int num = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, + num + " é Par, e sua Raiz quadrada é: " + Math.sqrt(num));
		}
		else {
			JOptionPane.showMessageDialog(null, +num + " é Ímpar, e Sua elevação ao quadrado é: " + Math.pow(num, num));
		}
	}

}
