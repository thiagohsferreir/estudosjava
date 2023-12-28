package fixacaodois;

import java.util.Locale;
import java.util.Scanner;

import utilfixdois.BankServer;

public class BankProgram {

	public static void main(String[] args) {

		BankServer bk = new BankServer();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double deposito;
		double saque;
		System.out.println("Olá! Seja bem-vindo ao Banco do Inferno.\n"
				+ "Primeiro, vamos cadastrar você no nosso banco de dados.");
		System.out.print("Nos diga o seu nome: ");
		bk.nome = sc.nextLine();
		System.out.println("Perfeito. Seja bem-vindo " + bk.nome + "!");
		System.out.print(
				"Agora, digite o número da sua conta: (Lembrando que ela não poderá ser alterada posteriormente.)");
		bk.setnumeroConta(sc.nextInt());
		System.out.println();
		System.out.println("Você é " + bk.nome + ", dono da conta: "
				+ bk.getnumeroConta());

		System.out.println("Você deseja realizar um depósito inicial? [s/n]");
		char escolha = sc.next().charAt(0);
		if (escolha == 's') {
			System.out.println(
					"Por favor, informe o valor do depósito inicial: ");
			deposito = sc.nextDouble();
			bk.setDeposito(deposito);
			System.out.println("CLIENTE " + bk.nome + " CONTA: "
					+ bk.getnumeroConta() + " SALDO: R$ " + String.format("%.2f",  bk.getSaldo()));
		} else {
			System.out.println("Ok.");
			System.out.println("CLIENTE " + bk.nome + " CONTA: "
					+ bk.getnumeroConta() + " SALDO: R$ " + String.format("%.2f",  bk.getSaldo()));
		}

		System.out.println("Vamos realizar um depósito: ");
		deposito = sc.nextDouble();
		bk.setDeposito(deposito);
		System.out.println("CLIENTE " + bk.nome + " CONTA: "
				+ bk.getnumeroConta() + " SALDO: R$ " + String.format("%.2f",  bk.getSaldo()));
		System.out.println("Vamos realizar um saque: [TAXA DE SAQUE: 5.00] ");
		saque = sc.nextDouble();
		bk.setSaque(saque);
		System.out.println("CLIENTE " + bk.nome + " CONTA: "
				+ bk.getnumeroConta() + " SALDO: R$ " + String.format("%.2f",  bk.getSaldo()));
	}

}
