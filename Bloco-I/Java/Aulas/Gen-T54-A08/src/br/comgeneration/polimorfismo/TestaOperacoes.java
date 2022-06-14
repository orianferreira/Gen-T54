package br.comgeneration.polimorfismo;

import java.util.Scanner;

public class TestaOperacoes {
	
	public static void calculaOperacao(OperacaoMatematica op, double x, double y) {
		System.out.println(op.calcular(x, y));
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com os valores a serem calculados: ");
		double x1 = entrada.nextDouble();
		double x2 = entrada.nextDouble();
		
		calculaOperacao(new Soma(), x1, x2);
		calculaOperacao(new Multiplicacao(), x1, x2);
		calculaOperacao(new Divisao(), x1, x2);

	}

}
