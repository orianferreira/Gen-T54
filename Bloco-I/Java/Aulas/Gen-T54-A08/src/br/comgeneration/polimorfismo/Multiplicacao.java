package br.comgeneration.polimorfismo;

public class Multiplicacao extends OperacaoMatematica{
	
	@Override
	public double calcular(double x, double y) {
		System.out.print("Multiplicação: ");
		return x * y;
	}

}
