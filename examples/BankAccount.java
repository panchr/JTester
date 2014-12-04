// The BankAccount class implements a basic bank account, allowing depositing, withdrawing, and checking of the balance.


public class BankAccount {
	// Models a Bank Account

	private double balance;

	public BankAccount() {
		// Initialize instance
		this(0);
		}
	public BankAccount(double starting_balance) {
		this.balance = starting_balance;
		}

	public BankAccount copy() {
		return new BankAccount(this.balance);
		}

	public String toString() {
		return String.format("%f", this.balance);
		}

	public double getBalance() {
		return this.balance;
		}

	public void deposit(double amount) {
		this.balance += amount;
		}

	public double withdraw(double amount) { // only allow withdrawal if the balance is greater than the amount
		if (this.getBalance() > amount) {
			this.balance -= amount;
			return amount;
			}
		else {
			return 0;
			}
		}
	}
