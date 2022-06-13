package PolimorfismoHeranca;

public class TestaAnimal {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro();

		dog.setNome("Pluto");
		dog.setIdade(4);
		dog.setSom(true);
		dog.setCorre(true);

		Cavalo horse = new Cavalo();

		horse.setNome("Mustang");
		horse.setIdade(11);
		horse.setSom(true);
		horse.setCorre(true);

		Preguica sloth = new Preguica();

		sloth.setNome("Sid");
		sloth.setIdade(5);
		sloth.setSom(true);
		sloth.setEscala(true);

		System.out.println("Nome do Cachorro: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade());
		Cachorro.emitirSom();
		Cachorro.correr();
		System.out.println("\n");

		System.out.println("Nome do Cavalo: " + horse.getNome());
		System.out.println("Idade: " + horse.getIdade());
		Cavalo.emitirSom();
		Cavalo.correr();
		System.out.println("\n");

		System.out.println("Nome do Bicho-Preguiça: " + sloth.getNome());
		System.out.println("Idade: " + sloth.getIdade());
		Preguica.emitirSom();
		Preguica.subirArvore();
		System.out.println("\n");
	}

}
