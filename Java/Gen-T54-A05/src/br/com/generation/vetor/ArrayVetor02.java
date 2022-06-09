package br.com.generation.vetor;

public class ArrayVetor02 {

	public static void main(String[] args) {

		double[] temperatura = new double[31];
		
		temperatura[0] = 31.3;
		temperatura[1] = 29.9;
		temperatura[2] = 34.6;
		
		System.out.println("O valor da temperatura no dia 03: " + temperatura[2]);
		
		System.out.println("O tamanho do vetor de temperatura: " + temperatura.length);
		
		System.out.println("Valores do meu vetor de temperatura : ");
		
		for (int i = 0; i < temperatura.length; i++) {
			
			System.out.println("O valor da temperatura no dia: " + (i+1) + "° é: " + temperatura[2]);

		}
	} 

}
