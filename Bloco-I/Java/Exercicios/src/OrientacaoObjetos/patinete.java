package OrientacaoObjetos;

public class patinete {

	private String marca, modelo, tipo, cor;

	public patinete(String marca, String modelo, String tipo, String cor) {

		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.cor = cor;
	}

	public void imprimirInfo() {
		System.out.println("\nMarca: " + marca + "\nModelo: " + modelo + "\nTipo: " + tipo + "\nCor: " + cor);
	}
	
}
