package br.com.generation01;

public class TestaAutomovel {

	public static void main(String[] args) {

		Automovel carro = new Automovel("Rosa", "BMW", "VDL1993", "Preto", 2023, true);
		
		carro.imprimirInfo();

		System.out.println("\n Transferencia de proprietario");
		
		carro.setNomeProprietario("Rian");
		
		carro.setPlaca("CXY986");
		
		System.out.println("\n ***************************************");
		
		carro.imprimirInfo();

	}

}
