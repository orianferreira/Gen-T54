package LacoDeRepeticao;

import javax.swing.JOptionPane;

public class atv4 {

	public static void main(String[] args) {

		int pessoas, contador = 1, idade = 0, femi = 0, masc = 0, outro = 0, temperamento = 0;
		
		int totalCalmos, pessoaNervosaMais40 = 0, pessoaCalmaMenos18 = 0;
		
		int calmas = 0, nervosas = 0, agressivas = 0;
		int calmos = 0, nervosos = 0, agressivos = 0;
		int calmes = 0, nervoses = 0, agressives = 0;

		//150 PESSOAS
		while (contador <= 6) {

			idade = Integer.parseInt(JOptionPane.showInputDialog("Registro da " + contador + "° Qual é sua idade?"));

			contador++;

			if (idade >= 1 && idade < 18) {

				pessoas = Integer.parseInt(JOptionPane.showInputDialog(
						"Registro da " + contador + "° Pessoa\n" + "(1-feminino / 2-masculino / 3-Outros)"));

				if (pessoas == 1) {

					femi++;

					temperamento = Integer.parseInt(JOptionPane.showInputDialog(
							"(Digite 1, se você calma; Digite 2, se você é nervosa e Digite 3, se você é agressiva)"));

					if (temperamento == 1) {

						pessoaCalmaMenos18++;
						calmas++;
					} else if (temperamento == 2) {

						nervosas++;
					} else if (temperamento == 3) {

						agressivas++;
					} else {
						System.out.println("Este Temperamento não é válido!");
					}
				} else if (pessoas == 2) {

					masc++;

					temperamento = Integer.parseInt(JOptionPane.showInputDialog(
							"(Digite 1, se você calmo; Digite 2, se você é nervoso e Digite 3, se você é agressivo)"));

					if (temperamento == 1) {

						pessoaCalmaMenos18++;
						calmos++;
					} else if (temperamento == 2) {

						nervosos++;
					} else if (temperamento == 3) {

						agressivos++;
					} else {
						System.out.println("Este Temperamento não é válido!");
					}
				} else if (pessoas == 3) {

					outro++;

					temperamento = Integer.parseInt(JOptionPane.showInputDialog(
							"(Digite 1, se você calme; Digite 2, se você é nervose e Digite 3, se você é agressive)"));

					if (temperamento == 1) {

						pessoaCalmaMenos18++;
						calmes++;
					} else if (temperamento == 2) {

						nervoses++;
					} else if (temperamento == 3) {

						agressives++;
					} else {
						System.out.println("Este Temperamento não é válido!");
					}
				} else {
					System.out.println("Grupo inválido!");
				}
			}

			else if (idade >= 18 && idade <= 40) {

				pessoas = Integer.parseInt(JOptionPane.showInputDialog(
						"Registro da " + contador + "° Pessoa\n" + "(1-feminino / 2-masculino / 3-Outros)"));

				if (pessoas == 1) {

					femi++;

					temperamento = Integer.parseInt(JOptionPane.showInputDialog(
							"(Digite 1, se você calma; Digite 2, se você é nervosa e Digite 3, se você é agressiva)"));

					if (temperamento == 1) {

						calmas++;
					} else if (temperamento == 2) {

						nervosas++;
					} else if (temperamento == 3) {

						agressivas++;
					} else {
						System.out.println("Este Temperamento não é válido!");
					}
				} else if (pessoas == 2) {

					masc++;

					temperamento = Integer.parseInt(JOptionPane.showInputDialog(
							"(Digite 1, se você calmo; Digite 2, se você é nervoso e Digite 3, se você é agressivo)"));

					if (temperamento == 1) {

						calmos++;
					} else if (temperamento == 2) {

						nervosos++;
					} else if (temperamento == 3) {

						agressivos++;
					} else {
						System.out.println("Este Temperamento não é válido!");
					}
				} else if (pessoas == 3) {

					outro++;

					temperamento = Integer.parseInt(JOptionPane.showInputDialog(
							"(Digite 1, se você calme; Digite 2, se você é nervose e Digite 3, se você é agressive)"));

					if (temperamento == 1) {

						calmes++;
					} else if (temperamento == 2) {

						nervoses++;
					} else if (temperamento == 3) {

						agressives++;
					} else {
						System.out.println("Este Temperamento não é válido!");
					}
				} else {
					System.out.println("Grupo inválido!");
				}
			}

			else if (idade > 40) {

				pessoas = Integer.parseInt(JOptionPane.showInputDialog(
						"Registro da " + contador + "° Pessoa\n" + "(1-feminino / 2-masculino / 3-Outros)"));

				if (pessoas == 1) {

					femi++;

					temperamento = Integer.parseInt(JOptionPane.showInputDialog(
							"(Digite 1, se você calma; Digite 2, se você é nervosa e Digite 3, se você é agressiva)"));

					if (temperamento == 1) {

						calmas++;
					} else if (temperamento == 2) {

						pessoaNervosaMais40++;
						nervosas++;
					} else if (temperamento == 3) {

						agressivas++;
					} else {
						System.out.println("Este Temperamento não é válido!");
					}
				} else if (pessoas == 2) {

					masc++;

					temperamento = Integer.parseInt(JOptionPane.showInputDialog(
							"(Digite 1, se você calmo; Digite 2, se você é nervoso e Digite 3, se você é agressivo)"));

					if (temperamento == 1) {

						calmos++;
					} else if (temperamento == 2) {

						pessoaNervosaMais40++;
						nervosos++;
					} else if (temperamento == 3) {

						agressivos++;
					} else {
						System.out.println("Este Temperamento não é válido!");
					}
				} else if (pessoas == 3) {

					outro++;

					temperamento = Integer.parseInt(JOptionPane.showInputDialog(
							"(Digite 1, se você calme; Digite 2, se você é nervose e Digite 3, se você é agressive)"));

					if (temperamento == 1) {

						calmes++;
					} else if (temperamento == 2) {

						pessoaNervosaMais40++;
						nervoses++;
					} else if (temperamento == 3) {

						agressives++;
					} else {
						System.out.println("Este Temperamento não é válido!");
					}
				} else {
					System.out.println("Grupo inválido!");
				}
			}

			else if (idade < 0) {
				JOptionPane.showMessageDialog(null, "Idade inválida!");
			}

			else {
				JOptionPane.showMessageDialog(null, "Idade inválida!");
			}

		}

		totalCalmos = calmas + calmos + calmes;

		System.out.println("No registro há um total de:\n\n" + totalCalmos + " Pessoas Calmas\n" + nervosas
				+ " Mulheres Nervosas\n" + agressivos + " Homens Agressivos\n" + calmes + " Outres Calmes");
		System.out.println(pessoaNervosaMais40 + " Pessoas Nervosas com mais de 40 Anos\n" + pessoaCalmaMenos18
				+ " Pessoas calmas com menos de 18 ANos");
	}

}
