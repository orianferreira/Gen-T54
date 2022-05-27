programa
{
	
	funcao inicio()
	{
		real nota1,nota2,nota3,nota4,media
		cadeia aluno
		
		//escreva("Digite o nome do aluno:")
		//leia(aluno)
		escreva("Digite a 1°Nota: ")
		leia(nota1)
		escreva("Digite a 2°Nota: ")
		leia(nota2)
		escreva("Digite a 3°Nota: ")
		leia(nota3)
		escreva("Digite a 4°Nota: ")
		leia(nota4)
		
		media = (nota1+nota2+nota3+nota4)/4
		
		aluno = ("Vulgo RD")
		
		escreva("Você obteve a média : " + media )
		
		//Verifica se a média é maior ou igual a 7
		se(media>=7) {
		    escreva("\n" + "Parabéns " + aluno + "! você foi Aprovado!")
		} 
		
		//Caso seja menor que 7 execulta este comando
		senao {
		    escreva("\n" + "Você foi reprovado hahaha, estuda mais irmão")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 709; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */