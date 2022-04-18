package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import servico.OperacoesDaCalc;

public class AppACalculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String nome;

		System.out.println("**********************************************************************");
		System.out.println();
		System.out.print("*********************** OLÁ, SEJA BEM-VINDO");
		System.out.print(" **************************\n");
		System.out.print("********** ESTE É O MAIS NOVO SISTEMA DE CÁLCULO INTERATIVO");
		System.out.print(" **********\n");
		System.out.println();
		System.out.println("**********************************************************************");

		System.out.println();

		System.out.print("Digite seu nome, por favor: ");
		nome = scan.next();

		OperacoesDaCalc operacoes = new OperacoesDaCalc(0, 0);

		System.out.println();

		boolean sair = false;

		try {
			do {

			System.out.println();

				System.out.print("Escolha uma das operações: \n");
				System.out.print("(1) - SOMAR \n");
				System.out.print("(2) - SUBTRAIR \n");
				System.out.print("(3) - MULTIPLICAR \n");
				System.out.print("(4) - DIVIDIR \n");
				System.out.print("(5) - SAIR \n");
				System.out.println();
				int opcao = scan.nextInt();

				if (opcao != 5 && opcao > 0 && opcao < 5) {

					System.out.print("Digite o primeiro número: ");
					operacoes.setNumA(scan.nextDouble());

					System.out.print("Digite o segundo número: ");
					operacoes.setNumB(scan.nextDouble());

				}
				System.out.println();
				switch (opcao) {
				case 1:
					System.out.println("Resultado: " + operacoes.Somar(operacoes.getNumA(), operacoes.getNumB()));
					break;
				case 2:
					System.out.println("Resultado: " + operacoes.Subtrair(operacoes.getNumA(), operacoes.getNumB()));
					break;
				case 3:
					System.out.println("Resultado: " + operacoes.Multiplicar(operacoes.getNumA(), operacoes.getNumB()));
					break;
				case 4:
					System.out.println("Resultado: " + operacoes.Dividir(operacoes.getNumA(), operacoes.getNumB()));
					break;
				case 5:
					sair = true;
					break;

				default:
					System.out.println("Esta opção não é válida, escolha as opções entre 1-5, obrigado(a).");
					break;
				}

		} while (!sair);

		} catch (InputMismatchException e) {
			System.out.println("Por favor, digite apenas números, reinicie a aplicação e volte a tentar.");
		} 
		
		System.out.println();
		System.out.println(" :) Obrigado por utilizar nossa aplicação, " + nome + ".");

		scan.close();
	}

}
