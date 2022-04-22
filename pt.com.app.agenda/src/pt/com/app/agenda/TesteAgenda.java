package pt.com.app.agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Contato> contatos = new ArrayList<>();
		boolean rodando = false;

		System.out.println("**********************************************************");
		System.out.println("*********************");
		System.out.println("                      BEM VINDO");
		System.out.println("                                  ************************");
		System.out.println("**********************************************************");

		while (!rodando) {

			System.out.println();
			System.out.println("Digite a opção que deseja realizar:\n");
			System.out.println("(1) Adicionar contato;");
			System.out.println("(2) Listar todos os Contatos;");
			System.out.println("(3) Procurar contato por nome;");
			System.out.println("(4) Atualizar contato;");
			System.out.println("(5) Remover Contato;");
			System.out.println("(6) Sair.");
			String opcao = scan.nextLine();

			switch (opcao) {

			case "1": {
				System.out.println("========== ADICIONANDO CONTATO ==========");
				System.out.print("Digite o nome: ");
				String nome = scan.nextLine();
				System.out.print("Digite o número do telemóvel: ");
				String numero = scan.nextLine();
				Contato u = new Contato();
				u.setNome(nome);
				u.setNumTelemovel(numero);

				contatos.add(u);
				System.out.println("=========================================");
				break;
			}
			case "2": {
				System.out.println("========== LISTA DE CONTATOS ==========");
				for (int i = 0; i < contatos.size(); i++) {
					Contato uTemp = contatos.get(i);

					System.out.println("Contato " + (i + 1));
					System.out.println("\tNome: " + contatos.get(i).getNome());
					System.out.println("\tNúmero: " + contatos.get(i).getNumTelemovel());

					System.out.println("=======================================");
				}
				break;
			}
			case "3": {
				System.out.println("Digite o nome do contato que deseja encontrar:");
				String nome = scan.nextLine();

				boolean encontrei = false;

				for (int i = 0; i < contatos.size(); i++) {

					Contato uTemp = contatos.get(i);

					if (nome.equals(uTemp.getNome())) {
						System.out.println("\tNome: " + uTemp.getNome());
						System.out.println("\tNúmero: " + uTemp.getNumTelemovel());
						encontrei = true;
						System.out.println("=======================================");
						break;
					}
				}
				System.out.println();
				if (!encontrei) {
					System.out.println("Contato não encontrado!");
					System.out.println("=======================");
				}

				break;
			}
			case "4": {
				System.out.println("========== ATUALIZANDO CONTATO ==========\n");
				for (int i = 0; i < contatos.size(); i++) {

					Contato uTemp = contatos.get(i);

					System.out.println("[" + i  + "]" + uTemp.getNome());
				}

				System.out.println("Digite o valor da referência:\n");
				int referencia = scan.nextInt();
				scan.nextLine();

				System.out.println("Digite o novo nome:");
				String novoNome = scan.nextLine();
				System.out.println("Digite o novo número:");
				String novoNumer = scan.nextLine();

				Contato cont = contatos.get(referencia);

				cont.setNome(novoNome);
				cont.setNumTelemovel(novoNumer);

				System.out.println("Contato atualizado com sucesso!");
				System.out.println("===============================");

				break;
			}
			case "5": {

				System.out.println("========== REMOVENDO CONTATO ==========");
				for (int i = 0; i < contatos.size(); i++) {

					Contato uTemp = contatos.get(i);

					System.out.println("[" + i + "]" + uTemp.getNome());
				}

				System.out.println("Digite o valor da referência: ");
				int referencia = scan.nextInt();
				scan.nextLine();

				contatos.remove(referencia);
				break;

			}
			case "6": {
				rodando = true;

			}

			}

		}

		System.out.println("Obrigado por utilizar minha aplicação! :)");

		scan.close();
	}

}
