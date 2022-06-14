package br.comgeneration.interfacee;

public class TestaInterfaceAnimal {

	public static void main(String[] args) {
		
		Cachorro meuCachorro = new Cachorro();
		meuCachorro.somAnimal();
		meuCachorro.dormir();
		
		Gato meuGato = new Gato();
		meuGato.somAnimal();
		meuGato.dormir();
	}

}
