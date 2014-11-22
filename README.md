JTester
=======

####Basic Java Unit Testing package

###Goal
`JTester`'s goal is to make Java Unit Testing as *simple* and *quick* as possible.

###Usage
Make sure that `JTester.java` is placed in the same folder as your testing suite.
To use `JTester`, create a class that `extends` the `JTester` class:
```java
public class StringTester extends JTester
```

The `JTester` class solely uses `public` and `static` methods. As a result, you **must** `extend` the class.

###Assertions
Unit testing works through a series of assertions. Similar to common testing suites, `JTester` uses the popular naming convention of `assert` + `assertionType`.

There are currently 6 different types of assertions:
* [`assertEquals`](#assertequals)
* [`assertNotEquals`](#assertnotequals)
* [`assertGreaterThan`](#assertgreaterthan)
* [`assertLessThan`](#assertlessthan)
* [`assertGreaterThanOrEqualTo`](#assertgreaterthanorequalto)
* [`assertLessThanOrEqualTo`](#assertlessthanorequalto)

####assertEquals
Asserts if two objects are equal (`a == b`). The objects **must** have an `equals` method and/or implement the `Comparable` interface.

####assertNotEquals
Asserts if two objects are not equal (`a != b`). The objects **must** have an `equals` method and/or implement the `Comparable` interface.

####assertGreaterThan
Asserts if one object is greather than another (`a > b`). Both objects **must** implement the `Comparable` interface.

####assertLessThan
Asserts if one object is less than another (`a < b`). Both objects **must** implement the `Comparable` interface.

####assertGreaterThanOrEqualTo
Asserts if one object is greater than or equal to another (`a >= b`). Both objects **must** implement the `Comparable` interface.

####assertLessThanOrEqualTo
Asserts if one object is less than or equal to another (`a <= b`). Both objects **must** implement the `Comparable` interface.

### Failed Assertions
When an assertion fails, `JTester` outputs information on the failed test, in this format:
```plaintext
Assertion {number} failed: {message}
    File:   {fileName}
    Line:   {lineNumber}
    Class:  {className}
```

&copy; Rushy Panchal 2014.<br/>
JTester is licensed under the General Public License (GPL) v2.0.
    





