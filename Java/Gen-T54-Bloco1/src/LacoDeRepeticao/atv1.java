package LacoDeRepeticao;

public class atv1 {

	public static void main(String[] args) {

		for (int value = 1000; value <= 1999; value++) {
			
			value++;
			
			if (value % 11 == 5) {
				System.out.println("Quando " + value + " é divido por 11, obtemos o resto de 5...");
			}

		}

	}

}
