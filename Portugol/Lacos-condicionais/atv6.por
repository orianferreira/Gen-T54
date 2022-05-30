programa
{
	
	funcao inicio()
	{
		caracter group

		escreva("A = 5 a 7 anos\nB = 8 a 11 anos\nC = 12 a 13 anos\nD = 14 a 17 anos")
		escreva("Digite o Grupo desejado: ")
		leia(group)
	
			escolha(group){
				caso 'A':
				 	escreva("Você faz parte do Grupo Infantil A\n 5 a 7 anos")
				pare
				caso 'B':
				 	escreva("Você faz parte do Grupo Infantil B\n 8 a 11 anos")
				pare
				caso 'C':
				 	escreva("Você faz parte do Grupo Juvenil A\n 12 a 13 anos")
				pare
				caso 'D':
				 	escreva("Você faz parte do Grupo Juvenil B\n 14 a 17 anos")
				pare
				caso contrario:
				    escreva("Grupo Inválido!")
				pare
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 188; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */