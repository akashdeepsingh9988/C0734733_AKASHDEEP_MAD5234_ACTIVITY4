package c0734733_akashdeep_mad5234_activity4;
/**
 * This class represents a bank account whose current balance is a nonnegative
 * amount in US dollars.
 */
public class Account {
	
	/**
	 * Initialize an account with the given balance.
	 */
	public Account(int balance) {
		this.myBalance = balance;
	}

	/**
	 * Add the given amount to the account.
	 */
	public void deposit(int amount) {
		if (amount < 0) {
			System.out.println("Cannot deposit negative amount.");
		} else {
			this.myBalance = this.myBalance + amount;
		}
	}

	/**
	 * Subtract the given amount from the account if possible. If the amount
	 * would leave a negative balance, print an error message and leave the
	 * balance unchanged.
	 */
	public void withdraw(int amount) {
		if (amount < 0) {
			System.out.println("Cannot withdraw negative amount.");
		} else if (this.myBalance < amount) {
			System.out.println("Insufficient funds");
		} else {
			this.myBalance = this.myBalance - amount;
		}
	}

	/**
	 * Return the number of dollars in the account.
	 */
	public int balance() {
		return this.myBalance;
	}
	

	// instance variables
	private int myBalance;
	
}
