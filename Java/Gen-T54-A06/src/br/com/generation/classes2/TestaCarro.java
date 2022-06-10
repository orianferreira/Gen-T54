package br.com.generation.classes2;

public class TestaCarro {

	public static void main(String[] args) throws InterruptedException {

		Carro mercedes = new Carro();
		
		mercedes.modelo = "C180";
		mercedes.cor = "Branco";
		mercedes.ano = 2022;
		mercedes.legalizado = true;
		mercedes.velocidade = 0;

		System.out.println("Modelo: " + mercedes.modelo);
		System.out.println("Cor: " + mercedes.cor);
		System.out.println("Ano: " + mercedes.ano);
		System.out.println("Legalizado: " + mercedes.legalizado);
		
		mercedes.acelerar(0);
		System.out.println("Acelerando: " + mercedes.velocidade + "Km/h");
		
		mercedes.freiar(0);
		System.out.println("Reduzindo Velocidade: " + mercedes.velocidade + "Km/h");
		
	}

}
