/**
* Test the BankAccount class
* @author Rushy Panchal
* @version 1.0
* @since December 3rd, 2014
*/

public class BankAccountTester extends JTester { 
	// extending the JTester class is vital
	public static void main(String[] args) {
		// Create needed variables
		BankAccount account = new BankAccount();
		BankAccount secondAccount = new BankAccount(500);

		// Run tests here
		assertEquals(account.getBalance(), 0);
		account.deposit(1000); // perform some action, and test it afterwards
		assertEquals(account.getBalance(), 1000);

		assertGreaterThan(secondAccount.getBalance(), 25);
		secondAccount.withdraw(200);
		assertNotEquals(secondAccount.getBalance(), 500);
		assertEquals(secondAccount.getBalance(), 300);

		}
	}
