programa
{
	
	funcao inicio()
	{
		real indice
		
		escreva("Digite a índice de poluição: ")
		leia(indice)

		se (indice < 0.3) {
		 	escreva("O índice de poluição esta aceitável")
		}
		senao se (indice < 0.4) {
			escreva("Sua empresa recebera uma intimação, e terão de suspender suas atividades!\n Mantenha-se dentro do índice")
		}
		senao se (indice < 0.5) {
			escreva("Sua empresa tera de suspender as atividades até que o indice abaixe!")
		}
		senao se (indice >= 0.5) {
			escreva("Sua empresa tera de paralizar as atividades")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 548; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */