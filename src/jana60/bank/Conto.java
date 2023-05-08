package jana60.bank;

import java.util.Random;

public class Conto {
	
	private String accountNumber;
	private String userName;
	private float balance;
	
	public Conto(String userName) {
		Random rnd = new Random();
		accountNumber = "" + rnd.nextInt(1, 1001);
		balance = 0;
		this.userName = userName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void deposit(float amount) {
		balance += amount;
	}
	
	public boolean withdraw(float amount) {
		if (getBalance() > 0 && amount > 0 && amount <= getBalance()) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	

}
