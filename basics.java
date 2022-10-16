// first program
1. new project
2. 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("I love Pizza\n");
		System.out.print("It's really good");
		
		// this is a comment
		/*This
		 * is 
		 * a
		 * comment
		 * 
		 * 
		 */
		

	}

}

----------------------
// variables
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 123; //initialization
		float y  = 3.14f;
		double z = 3.14;
		boolean w = false;
		String name = "Tarcisio";
		
		
		System.out.println("My name is "+ name);

	}

}

--------------------
// float vs double -> float 7 decimals digits double 15 digits | is better use double instead of use double

public class Main {

	public static void main(String[] args) {
		
		String x = "water";
		String y = "Kool-Aid";
		String temp;
		
		temp = x;
		x=y;
		temp=y;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);

	}

}
---------------------
  
// input values

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("What's your favorite food?");
		String food = scanner.nextLine();
		
		
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("You like "+ food);

	}

}
//output
What is your name? 
Tarcisio
How old are you? 
28
What's your favorite food?
sushi
Hello Tarcisio
You are 28 years old
You like sushi

-----------------
// operators
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// expression = operands & operators
		// operands = values, variables, numbers, quantity
		// operators = + - * / %
		
		int friends = 10; 
		friends = friends % 2; // remainder 
		
		int number = 10;
		number++; // gonna add one number se usar number-- vai tirar 1 num.
		
		int number_1 = 10;
		number_1 = 10/3; // it's a integer, so the result will be 3, not 3.33, we need to change  the inialization with double value
		
		System.out.println(friends); 
		System.out.println(number);
		System.out.println(number_1);
		
		
	}

}



