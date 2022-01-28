package classesandobjects;

public class Bank {
	String userName;
	double balance;
	double amountToWithdraw;
	
	// create an account
	String createNewAccount() {
		return "Congratulations " + userName + " a new account has been created";
	}
	
	// check balance
	double checkBalance() {
		return balance;
	}

	// withdraw money
	double withdraw() {
		// reassign balance
		balance -= amountToWithdraw;
		
		// create new variable to return
		double newBalance = balance;
		
		return newBalance;

	}
}
