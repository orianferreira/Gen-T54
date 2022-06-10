programa
{
	
	funcao inicio()
	{
		inteiro valores[5]
		inteiro maiorValor = 0
		
			para (inteiro i = 0; i < 5; i++){
				escreva ("Digite o " + (i + 1) + "°" + " Valor: ")
				leia (valores[i])
				
					se (valores[i] > maiorValor) {
						maiorValor = valores[i]
					}
			}
			
			escreva("O maior número é " + maiorValor)
	}
}
					/*
					se (valores[i] >= valores[i] e i >= 1) {
						maiorValor = valores[i - 1]

						se (valores[i] == valores[4]) {
							escreva("O maior número é " + maiorValor)
						}
					}
					*/
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */