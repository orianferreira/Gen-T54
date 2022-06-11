package OrientacaoObjetos;

public class eletronicos {

	private String tipo, marca, modelo, cor;
	private int ano;

	public eletronicos(String tipo, String marca, String modelo, String cor, int ano) {

		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}

	public void imprimirInfo() {
		System.out.println("\nTipo: " + tipo + "\nMarca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nCor: " + cor);
	}
	
}
