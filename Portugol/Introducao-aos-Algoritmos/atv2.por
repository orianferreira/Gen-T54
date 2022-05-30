programa
{
	
	funcao inicio()
	{
		inteiro idade, dias, res, res2, res3

		escreva("Digite sua idade: ")
		leia(idade)
		escreva("Quantos dias de vida você tem: ")
		leia(dias)

		res = dias / 365 
		res2 = 31 / dias
		res3 = idade / dias

		escreva("Você tem " + res + " Anos, " + res2 + " Meses e " + res3 + " Dias de vida." )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */