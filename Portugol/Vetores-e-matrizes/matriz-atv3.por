programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro valor[2][2] = {{4,6},{4,6}}
		inteiro res1 = 0, res2 = 0
	
			para(inteiro l = 0; l < 2; l++){
			
				para(inteiro c = 0; c < 2; c++){
					escreva(valor[l][c], " | ")
				}
				escreva("\n")
			}

			para(inteiro l = 0; l < 2; l++){
			
				para(inteiro c = 0; c < 2; c++){
					res1 = valor[0][0] + valor[0][1]
				}
				escreva("\n")
			}
			escreva("A soma dos valores é: " + res1)

			para(inteiro l = 0; l < 2; l++){
			
				para(inteiro c = 0; c < 2; c++){
					res1 = valor[1][0] - valor[1][1]
				}
				escreva("\n")
			}
			escreva("A soma dos valores é: " + res2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 183; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */