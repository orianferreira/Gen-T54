package br.com.generation.classes2;

public class Carro {

	String cor, modelo, placa;
	int ano, velocidade;
	boolean legalizado;
	
	void acelerar(int aceleracao) throws InterruptedException {
		
		aceleracao = velocidade + aceleracao;
		
		do {
			velocidade += 10;
			Thread.sleep(500);
			
		} while (velocidade <= 100);
	}
	
	void freiar(int reducao) throws InterruptedException {
		
		velocidade = velocidade - reducao;
		
		do {
			velocidade -= 10;
			Thread.sleep(500);
			
		} while (velocidade > 0);
	}
}
