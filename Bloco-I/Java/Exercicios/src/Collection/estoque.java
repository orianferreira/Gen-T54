package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class estoque {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList();

		estoque.add("Processador AMD Ryzen 5 3600");
		estoque.add("Placa-mãe Gigabyte GA B450M Gaming");
		estoque.add("Memoria-Ram 2X8GB Gloway 3200Mhz RGB");
		estoque.add("Placa de Video RTX 2060 Ultra Colorful Igame");
		estoque.add("Fonte Redragon RGPS 600W 80 Plus Bronze Full Modular");
		estoque.add("Fonte Gigabyte 650W 80 Plus Bronze - GP-P650B/BR");
		estoque.add("Adata Spectrix XPG S40G RGB 256GB");
		estoque.add("HD WD Caviar Blue 500GB 7200Rpm");
		estoque.add("Gabinete Galax Nebulosa GX700 Black");

		System.out.println("---> Estoque da Loja <---\n");

		String n;
		int i;

		for (i = 0; i < estoque.size(); i++) {

			System.out.println("Pagina " + i + "°: " + estoque.get(i));
		}

		System.out.print("\nQual sera a página excluida:");
		i = entrada.nextInt();

		estoque.remove(i);

		System.out.println("\n");

		for (i = 0; i < estoque.size(); i++) {

			System.out.println("Pagina " + i + "°: " + estoque.get(i));
		}

		i = 0;

		System.out.println("\n---> Estoque da Loja <---\\n");

		for (String componente : estoque) {

			System.out.println("Página " + i + "°: " + componente);
			i++;
		}

		System.out.println("\n<--- atualizando dados --->");

		/*
		 * System.out.print("\nQual sera a página atualizada:"); i = entrada.nextInt();
		 * System.out.print("Qual sera o Novo conteudo da página:");
		 */
		
		estoque.set(7, "Gabinete Galax Nebulosa GX700");

		System.out.println("\n");

		i = 0;

		Iterator<String> iterator = estoque.iterator();

		while (iterator.hasNext()) {

			System.out.println("Página " + i + "°: " + iterator.next());
			i++;
		}
	}

}
