programa
{
	/* Progrma: Laços
 	* Autor: Rian
 	* Data: 30/05/2022
	*/

	funcao inicio()
	{
		
		//Laço condicional
		
		real nota1, nota2, media

		cadeia nome

		escreva("Qual é o Nome do Aluno : ")
		leia(nome)
	
		escreva("Digite a 1° Nota: ")
		leia(nota1)

		escreva("Digite a 2° Nota: ")
		leia(nota2)

		media = (nota1 + nota2) / 2

		se(media >= 9.0){
			escreva(nome + " Foi aprovado com perfeição!!" + "\nMédia: " + media)
		}
		senao se(media >= 6.0 e media <= 9.0){
			escreva(nome + " Foi Aprovado!!" + "\nMédia: " + media)
		}
		senao se(media >= 3.0 e media < 6.0){
			escreva(nome + " Esta em Recuperação!!" + "\nMédia: " + media)
		}
		senao{
			escreva(nome + " Esta Reprovado!!" + "\nMédia: " + media)
		}

		//Laço Condicional - Esccolha Caso
	
		real numero1, numero2, resultado
		caracter operacao
	
		escreva("Digite o primeiro número: ")
		leia(numero1)
	
		escreva("Digite a operação desejada: ")
		leia(operacao)
		
		escreva("Digite o segundo número: ")
		leia(numero2)
	
			escolha(operacao){
				caso '+':
				 	resultado = numero1 + numero2
				 	escreva("Resultado : " + resultado)
				pare
				caso '-':
					resultado = numero1 - numero2
				 	escreva("Resultado : " + resultado)
				pare
				caso '*':
					resultado = numero1 * numero2
				 	escreva("Resultado : " + resultado)
				pare
				caso '/':
					resultado = numero1 / numero2
				 	escreva("Resultado : " + resultado)
				pare
				caso contrario:
				    escreva("Operação Inválida!!!")
				pare
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 118; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */