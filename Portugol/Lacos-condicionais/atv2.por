programa
{
	
	funcao inicio()
	{
		real C, E
		inteiro N

		C = 10.0

		escreva("Quantas horas trabalhou este mês: ")
		leia(N)

		se (N <= 50 e N > 0) {
			
			E = N * C

			escreva("Seu salário este mês sera de " + E + " R$!")
		}

		senao se (N > 50) {
			
			C = 20

			E =  (N - 50) * C + 500

			escreva("Seu salário este mês sera de " + E + " R$!")
		}

		senao {
			escreva("[ERRO] \n Este valor não é válido!")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 155; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */