programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, res

		escreva("Quantos anos você tem?: ")
		leia(anos)

		escreva("Quantos meses você tem?: ")
		leia(meses)
		
		escreva("Quantos dias você tem?: ")
		leia(dias)

		res = anos * 365 + meses * 31 + dias

		escreva("Você tem " + res + " dias de vida.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */