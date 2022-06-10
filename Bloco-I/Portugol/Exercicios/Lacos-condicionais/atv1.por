programa
{
	
	funcao inicio()
	{
		real P, E, M

		escreva("Qual é o peso dos Tomates: ")
		leia(P)

		se (P > 50) {

			E = P - 50
			
			M = E * 0.4
			
			escreva("Você devera pagar uma multa de : " + M + " R$...")
		} 
		
		senao se (P <= 50 e P > 0) {
			
			escreva("Não ouve excesso de peso, o sistema de multas não se aplica!")
			
		}

		senao {
			escreva("[ERRO] \n Este valor não é valido!")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */