package jana60.bank;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome per generare un conto");
		
		String userName = sc.nextLine();
		
		Conto account1 = new Conto(userName);
		
		System.out.println("Ciao " + account1.getUserName() + ", benvenuto nel tuo conto n. " + account1.getAccountNumber());
		
		boolean isLogged = true;
		
		while(isLogged == true) {
			System.out.println("Saldo disponibile: " + account1.getBalance() + "€");
			System.out.println("Cosa vuoi fare?");
			System.out.println("[V]ersamento");
			System.out.println("[P]relievo");
			System.out.println("[E]sci");
			
			String userInput = sc.nextLine();
			
			switch(userInput.toLowerCase()) {
			case "v":
			case "versamento":
				System.out.println("Quanto vuoi versare?");
				float depositAmount = sc.nextFloat();
				sc.nextLine();
				if(depositAmount >= 0) {
					account1.deposit(depositAmount);
					System.out.println("Hai depositato " + depositAmount + "€");
					System.out.println("Il tuo saldo è " + account1.getBalance() + "€");
				} else {
					System.out.println("Valore del deposito non valido");
				}
				break;
			case "p":
			case "prelievo":
				System.out.println("Quanto vuoi prelevare?");
				float withdrawAmount = sc.nextFloat();
				sc.nextLine();
				boolean isSuccess = account1.withdraw(withdrawAmount);
				System.out.println(isSuccess ? "hai prelevato " + withdrawAmount + "€\nIl tuo saldo è " + account1.getBalance() + "€" : "Il tuo bilancio non è sufficiente" );
				break;
			case "e":
			case "esci":
				isLogged = false;
				break;
			default:
				System.out.println("Comando non valido");
			}
			
			
			
		}
		sc.close();
		

	}

}
