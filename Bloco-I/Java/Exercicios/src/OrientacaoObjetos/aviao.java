package OrientacaoObjetos;

public class aviao {

	private String marca, modelo, piloto, cor;
	private int ano;

	public aviao(String marca, String modelo, String piloto, String cor, int ano) {

		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.piloto = piloto;
	}

	public void imprimirInfo() {
		System.out.println("\nMarca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nCor: " + cor + "\nPiloto: " + piloto);
	}
	
}
