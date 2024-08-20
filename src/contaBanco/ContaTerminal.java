package contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Preciso de algumas informacoes suas!");
		
		System.out.println("Por favor, digite o seu nome!");
		String accountHolderName = sc.next();
		
		System.out.println("Estamos quase la! agora so falta saber qual o valor do deposito inicial:");
		double accountFirstDeposit = sc.nextDouble();
		sc.nextLine();
		
		String agencyNumber = "067-8";
		int numberAccount = 1021;
		
		
		
		System.out.println(String
				.format("Olá %s,"
						+ " obrigado por criar uma conta em nosso banco, sua agência é %s,"
						+ " conta %d e seu saldo %.2f já está disponível para saque",
						accountHolderName,
						agencyNumber,
						numberAccount,
						accountFirstDeposit));
		
		
		sc.close();
	}

}
