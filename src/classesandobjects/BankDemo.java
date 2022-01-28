package classesandobjects;

public class BankDemo {

	public static void main(String[] args) {
		// create a new bank object
		Bank myBank = new Bank();
		
		// assign attributes
		myBank.userName = "Mario Sanchez";
		myBank.balance = 5000;
		myBank.amountToWithdraw = 200;
		
		// call methods
		String newAccount = myBank.createNewAccount();
		double myBalance = myBank.checkBalance();
		double newWithdraw = myBank.withdraw();
		
		// output
		System.out.println(newAccount);
		
		System.out.println("Your current balance is " + myBalance);
		
		System.out.println("You have withdrawn " + myBank.amountToWithdraw);
		
		// check balance one more time to see change
		
		System.out.println("Your new balance is " + newWithdraw);
		
		System.out.println("------------------------------------");

		// create a new bank object
		Bank myBank2 = new Bank();
		
		// assign attributes
		myBank2.userName = "Jane Doe";
		myBank2.balance = 15000;
		myBank2.amountToWithdraw = 796;
		
		// call methods
		String newAccount2 = myBank2.createNewAccount();
		double myBalance2 = myBank2.checkBalance();
		double newWithdraw2 = myBank2.withdraw();
		
		// output
		System.out.println(newAccount2);
		
		System.out.println("Your current balance is " + myBalance2);
		
		System.out.println("You have withdrawn " + myBank2.amountToWithdraw);
		
		// check balance one more time to see change
		
		System.out.println("Your new balance is " + newWithdraw2);

	}

}
