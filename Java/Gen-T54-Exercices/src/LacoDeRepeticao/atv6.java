package LacoDeRepeticao;

import javax.swing.JOptionPane;

public class atv6 {

	public static void main(String[] args) {

		int num, media = 0, numMedia = 0, contador = 1;
		
		do {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + contador + "°  Número: "));
			contador++;
			
			if (num % 3 == 0) {
				
				media += num;
				numMedia++;
			}

		} while (contador <= 10);
		
		media = media / numMedia;
		
		JOptionPane.showMessageDialog(null, "A soma dos Números multiplos de 3 foi: " + media);
	}

}
