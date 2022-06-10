programa
{
	
	funcao inicio()
	{
		inteiro valor[3][3]
		inteiro res = 0
	
			para(inteiro l = 0; l < 3; l++){
				
				para(inteiro c = 0; c < 3; c++){
					escreva ("Digite os valores da " + (l + 1) + "°" + " linha da Matriz: ")
					leia (valor[l][c])

				}
				escreva("\n")
				res = valor[0][0] + valor[1][1] + valor[2][2]
				
			}
			escreva(valor[0][0] + " | " + valor[0][1] + " | " + valor[0][2] + "\n"
					+ valor[1][0] + " | " + valor[1][1] + " | " + valor[1][2] + "\n"
						+ valor[2][0] + " | " + valor[2][1] + " | " + valor[2][2] + "\n")
			
			escreva("\nA soma dos valores da diagonal é " + res)
	}
}
/*
		inteiro valor[3][3]
		inteiro res1 = 0
			
			para(inteiro l = 0; l < 3; l++){
						
				para(inteiro c = 0; c < 3; c++){
					escreva("Digite o " + (l + 1) + "°" + " Valor da Matriz: ")
					leia (valor[l][c])
					
					escreva(valor[l][c], " | ")
				}
						
				escreva("\n")
*/
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */