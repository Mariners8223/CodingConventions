/*
	First, some basic terminology:
		- A class-level variable is a static variable.
		- A field is a non-static, member variable of a class or enum.
		- A constant is a final class-level variable. 

	Always use curly braces even for single line statements.
	Curly braces start on the same line.

	Tab size is 4.

	Function names should be descriptive
		- Name a function after the action it performs.
		- Getters/Setters should start with "get" and "set"
		- Functions that return a bool should be phrased as a question.
			 - Ex. isReady(), doesThingExist(), hasThing()

	Use comments and newlines to explain and organize code.
	Use asserts when possible.
        - When using asserts, always add a reason using the : syntax.
        - Ex. assert m_RobotConnection != null : "Connection is null";

	Avoid using public member variables. Prefer to use Getters/Setters.

	Do not use "this." to access member variables (Ex. this.m_MemberVariable)
    
    Avoid using nested classes. Prefer to use a seperate file for them. Enums are the only exception.
    
    Avoid using singletons for subsystems. Prefer to initialize each subsystem once in RobotContainer and require instances of said subsystems in Command constructors.
*/

public class ThisIsAClass { // Classes use UpperCamelCase

	public static final double THIS_IS_A_CONSTANT = 3.14; // Constants use UPPERCASE_WITH_UNDERSCORES

	private double m_MemberVariable = 2.71828; // All member variables are prefixed with 'm_' followed by UpperCamelCase

	public int getNumber() { // method names are lowerCamelCase
		int newVariable;		// Declare one variable per line
		int anotherVariable; 	// Declare one variable per line

		// Always use curly braces even for single-line statements
		if (foo.memberFunction()) { // Curly braces start on the same line
			return 0;
		}
		else { // Start related control blocks on a new line
			return 5;
		}
	}
}

public enum ThisIsAnEnum { // Enums use UpperCamelCase
	ENUM_VALUE, // Enum values use UPPERCASE_WITH_UNDERSCORES
	ANOTHER_VALUE
}

public interface IThisIsAnInterface { // Interfaces are prefixed with a 'I' and use UpperCamelCase
	void doAThing();
}
