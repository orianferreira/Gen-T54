package br.comgeneration.interfacee;

public class Gato implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("O som do Gato: miau miau");
		
	}

	@Override
	public void dormir() {
		System.out.println("O gato dormindo.... ");
		
	}

}
