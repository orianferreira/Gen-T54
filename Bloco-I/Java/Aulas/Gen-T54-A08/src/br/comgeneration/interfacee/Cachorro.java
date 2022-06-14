package br.comgeneration.interfacee;

public class Cachorro implements Animal{

	@Override //--> sobrescrita de método
	public void somAnimal() {
		System.out.println("O som do cachorro: au au au...");
		
	}

	@Override
	public void dormir() {
		System.out.println("O cachorro dormindo... ");
		
	}

}
