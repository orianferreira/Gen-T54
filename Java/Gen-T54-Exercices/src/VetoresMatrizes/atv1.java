package VetoresMatrizes;

import javax.swing.JOptionPane;

public class atv1 {

	public static void main(String[] args) {

		int[] valores = new int[5];
		int maiorValor = 0;
		
		for (int i = 0; i < 5; i++) {
			
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "°" + " Valor: "));

			if (valores[i] > maiorValor) {
				maiorValor = valores[i];
			}
		}

		JOptionPane.showMessageDialog(null, "O maior número é " + maiorValor);
	}

}
