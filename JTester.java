/**
* JTester provides a simple extendable Unit Testing class
* @author Rushy Panchal
* @version 0.1 (Alpha)
*/

public class JTester {
	// Private instance fields and methods
	private static int numberTests = 0;
	private static int failedTests = 0;

	/**
	* Assertion failed
	* @param message Message to include with the error
	*/
	private static void error(String message) {
		try {
			throw new AssertionError("");
			}
		catch (AssertionError error) {
			failedTests++;
			StackTraceElement[] errorStack = error.getStackTrace();
			StackTraceElement caller = errorStack[errorStack.length - 1];
			String errorMessage = String.format("Assertion %d failed: %s\n\tFile:\n\t\t%s\n\tLine:\n\t\t%d\n\tClass:\n\t\t%s\n", 
				numberTests, message, caller.getFileName(), caller.getLineNumber(), caller.getClassName());
			System.out.println(errorMessage);
			}
		}

	// Get numeric values

	/**
	* Gets the number of performed tests
	* @return number of tests performed so far
	*/
	public static int getNumberTests() {
		return numberTests;
		}

	/**
	* Gets the number of failed tests
	* @return number of tests failed so far
	*/
	public static int getNumberFailedTests() {
		return failedTests;
		}

	// Assertion Functions

	/**
	* Assert that two objects are equal
	* @param a First object to compare
	* @param b Second object to compare
	*/
	public static void assertEquals(Comparable a, Comparable b) {
		numberTests++;
		if (a.compareTo(b) != 0) {
			error(String.format("%s != %s", a, b));
			}
		}

	/**
	* Assert that two objects are not equal
	* @param a First object to compare
	* @param b Second object to compare
	*/
	public static void assertNotEqual(Comparable a, Comparable b) {
		numberTests++;
		if (a.compareTo(b) == 0) {
			error(String.format("%s == %s", a, b));
			}
		}

	/**
	* Test if an object is greater than another
	* @param a First object to compare
	* @param b Second object to compare
	*/
	public static void assertGreaterThan(Comparable a, Comparable b) {
		numberTests++;
		if (a.compareTo(b) <= 0) {
			error(String.format("%s <= %s", a , b));
			}
		}

	/**
	* Test if an object is less than another
	* @param a First object to compare
	* @param b Second object to compare
	*/
	public static void assertLessThan(Comparable a, Comparable b) {
		numberTests++;
		if (a.compareTo(b) >= 0) {
			error(String.format("%s >= %s", a , b));
			}
		}

	/**
	* Assert than an object is greater than or equal to another
	* @param a First object to compare
	* @param b Second object to compare
	*/
	public static void assertGeq(Comparable a, Comparable b) {
		numberTests++;
		if (a.compareTo(b) < 0) {
			error(String.format("%s < %s", a , b));
			}
		}

	/**
	* Assert than an object is less than or equal to another
	* @param a First object to compare
	* @param b Second object to compare
	*/
	public static void assertLeq(Comparable a, Comparable b) {
		numberTests++;
		if (a.compareTo(b) > 0) {
			error(String.format("%s > %s", a , b));
			}
		}
	}
