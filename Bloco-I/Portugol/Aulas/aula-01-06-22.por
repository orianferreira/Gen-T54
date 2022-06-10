programa
{
	
	/*Exmplo Vetor -2 em vez de /4 na 
	média coloca (i+1) que vai dividir por 4 tbm*/
	
	funcao inicio()
{
		//Exemplo Vetor - 2
	
		real notas[4]
		real soma = 0.0, media = 0.0
		
		escreva ("==== Sistema de Notas do Ensino Médio ====")
		escreva ("\nDigite as notas do Aluno: \n")
		
			para (inteiro i = 0; i <= 3; i++){
				escreva ((i + 1) + "° Nota: ")
				leia (notas[i])
				soma = soma + notas[i]
				media = soma / (i + 1)		
			}
			
			se(media >= 5.75){
				escreva ("\nAluno Aprovado!")		
			}
			
			senao {
				escreva ("\nAluno Reprovado!")
			}
			
		escreva ("\nSoma das notas: " + soma)
		escreva ("\nA Média das notas: " + media)

		/*
		inteiro notas[4][4] = {{10, 20, 30, 40},{10, 20, 30, 40},{10, 20, 30, 40},{10, 20, 30, 40}}
	
		notas[2][1] = 87
	
			para(inteiro l = 0; l < 4; l++){
			
				para(inteiro c = 0; c < 4; c++){
					escreva(notas[l][c], " | ")
				}
			}
		*/

		/*
		//Declaração da Matriz
        
        	real notas[3][3] 

       	escreva("Digite as notas: \n")
       	
        		para(inteiro l = 0; l <= 2; l++){
        		
            		para(inteiro c = 0; c <= 2; c++){
                		escreva("Notas: ")
                		leia(notas[l][c])
            		}
            		escreva("\n")
        		}
		*/
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 120; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */