package LacoDeRepeticao;

import javax.swing.JOptionPane;

public class atv5 {

	public static void main(String[] args) {

		int contador = 0, num;
		
		do {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
			
			contador = contador + num;
			
		} while (num != 0);
		
		JOptionPane.showMessageDialog(null, "A soma dos Número digitados foi: " + contador);

	}

}
