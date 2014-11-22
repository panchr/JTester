/**
* JTester provides a simple extendable Unit Testing class
* @author Rushy Panchal
* @version 0.2 (Alpha)
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
			System.out.printf("Assertion %d failed: %s\n\tFile:\t%s\n\tLine:\t%d\n\tClass:\t%s\n", 
				numberTests, message, caller.getFileName(), caller.getLineNumber(), caller.getClassName());
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
	* Assert that two Comparable objects are equal
	* @param a First object to compare
	* @param b Second object to compare
	*/
	public static <T extends Comparable<T>> void assertEquals(T a, T b) {
		numberTests++;
		if (a.compareTo(b) != 0) {
			error(String.format("%s != %s", a, b));
			}
		}

	/**
	* Assert that two objects are equal
	* @param a First object to compare
	* @param b Second object to compare
	*/
	public static void assertEquals(Object a, Object b) {
		numberTests++;
		if (!a.equals(b)) {
			error(String.format("%s != %s", a, b));
			}
		}

	/**
	* Assert that two Comparable objects are not equal
	* @param a First object to compare
	* @param b Second object to compare
	*/
	public static <T extends Comparable<T>> void assertNotEqual(T a, T b) {
		numberTests++;
		if (a.compareTo(b) == 0) {
			error(String.format("%s == %s", a, b));
			}
		}

	/**
	* Assert that two objects are not equal
	* @param a First object to compare
	* @param b Second object to compare
	*/
	public static void assertNotEquals(Object a, Object b) {
		numberTests++;
		if (a.equals(b)) {
			error(String.format("%s != %s", a, b));
			}
		}

	/**
	* Test if an object is greater than another
	* @param a First object to compare
	* @param b Second object to compare
	*/
	public static <T extends Comparable<T>> void assertGreaterThan(T a, T b) {
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
	public static <T extends Comparable<T>> void assertLessThan(T a, T b) {
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
	public static <T extends Comparable<T>> void assertGeq(T a, T b) {
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
	public static <T extends Comparable<T>> void assertLeq(T a, T b) {
		numberTests++;
		if (a.compareTo(b) > 0) {
			error(String.format("%s > %s", a , b));
			}
		}
	}
