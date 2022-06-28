package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class helloController {

	@GetMapping

	public String hello() {
		return "Hello World!\n"
				+ "\n"
				+ "PT - BSM-0 - Introdução às Habilidades Comportamentais e Mentalidades\\n\r\n"
				+ "PT - BSM-GM - Mentalidade de Crescimento\\n\r"
				+ "PT - BSM-P - Persistência\\n\r"
				+ "PT - BSM-PR - Responsabilidade Pessoal\\n\r"
				+ "PT - BSM-FO - Orientação ao Futuro\\n\r"
				+ "PT - BSM-C - Comunicação\\n\r"
				+ "PT - BSM-OD - Orientação ao Detalhe\\n\r"
				+ "PT - BSM-PA - Proatividade\\n\r"
				+ "PT - BSM-T - Trabalho em Equipe\\n\r"
				+ "PT - C-GG - Dar e Receber\\n\r"
				+ "PT - SA-CS1 - Estudo de Caso 1: Força de Trabalho Distribuída\\n\r"
				+ "PT - SA-CS2 - Estudo de Caso 2: Entregável Urgente\\n\r"
				+ "PT - SA-CS3 - Estudo de Caso 3: Novas Habilidades Necessárias\\n\r"
				+ "PT - SA-CS4 - Estudo de Caso 4: Aprender e Compartilhar\\n\r"
				+ "PT - SSM-TM - Gestão do Tempo\\n\r"
				+ "PT - SSM-IV - Introdução à VIA e a Descoberta das Forças de Caráter VIA\\n\r"
				+ "PT - SSM-RLW - Maximizar a Aprendizagem Online e o Trabalho Remoto\n"
				+ "\n"
				+ "Objetivos de aprendizagem da semana: conseguir entender todo conteúdo passado pelos instrutores sem perder nenhum detalhe.";
	}
}
