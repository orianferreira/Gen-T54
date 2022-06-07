package LacoDeDecisao;

import javax.swing.JOptionPane;

public class atv2 {

	public static void main(String[] args) {
		
		int num1, num2, num3, temp;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número inteiro: "));
		
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número inteiro: "));
		
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° número inteiro: "));
		
		if(num2 > num1){
	        temp = num1;
	        num1 = num2;
	        num2 = temp;
	    }

	    if(num3 > num1){
	        temp = num1;
	        num1 = num3;
	        num3 = temp;
	    }

	    if(num3 > num2){
	        temp = num2;
	        num2 = num3;
	        num3 = temp;
	    }
		
			JOptionPane.showMessageDialog(null, "A ordem crescente dos números é " + num3 + num2 + num1 + "...");
		
	}

}