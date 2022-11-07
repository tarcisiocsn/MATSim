// first program
//1. new project
//2. class
-----------------
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

// GUI - Graphical User Interface

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter you Name"); // first box
		JOptionPane.showConfirmDialog(null, "Hello "+ name); // second box with the output
			
		
	}

}

// other option
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter you Name"); 
		JOptionPane.showConfirmDialog(null, "Hello "+ name);
			
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); // this will return a string with a Interger.parseInt method, because of the showinputdialog we need to change the type
		JOptionPane.showConfirmDialog(null, "Your are "+ age + " years old"); 
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (cm)")); 
		JOptionPane.showConfirmDialog(null, "Your are "+ height + " cm tall"); 
		
		
		
		
		
	}

}

-----------------
// math methods
	
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y);
		
		double 
		
		System.out.println(z);
		
		
		
	}

}
//output
3.14
-------------
	// hipotenusa example
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// hipotenusa
		double x;
		double y;
		double z; 
		
		Scanner scanner = new Scanner(System.in);
		
		
		// we need a prompt to x, y assign
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x) + (y*y)); //square root function
		
		System.out.println("The hypotenuse is: " + z);
		
		scanner.close();
		
		
	
		
	}

}

// ---------------------
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random(); // generate a random number
		
		//int x = random.nextInt(); // variable x will generate a random number integer
		//double y = random.nextDouble(); 
		boolean z = random.nextBoolean();
		System.out.println(z);
		
		// integer is a number between -2 billion and 2 billion
		
		// random values from a dice 1 to 6
		
		Random random_1 = new Random(); // varible random_1 se não o codigo de cima dará merda, n podem ser a mesma variable
		
		int dice = random_1.nextInt(6)+1; // if I use only 6 will generate 0 to 6, so I increased +1
		
		System.out.println(dice);
	
			
		
	}

}

//-----------------
// if statements

public class Main {

	// if statements 
	public static void main(String[] args) {
		
		int age = 14;
		
		if(age >= 75) {
			
			System.out.println("Ok Boomer!");
			
		}
		
		else if(age >= 18) {
			
			System.out.println("You are an adult!");
			
		}
		
		else if(age >= 13) {
			System.out.println("You are a teenager!");
		}
		
		else {
			System.out.println("You are not an adult :(");
		}

		
	}

}

// -------------------
public class Main {

	public static void main(String[] args) {
		
		// switch = statement that allows a variable to be tested for equality against a list of value 
		
		String day = "Monday";
		
		switch(day) {
			case "Sunday": System.out.println("It is Sunday!");
			break;
			case "Monday": System.out.println("It is Monday!");
			break;
			case "Tuesday": System.out.println("It is Tuesday");
			break;
			case "Wednesday": System.out.println("It is Wednesday!");
			break;
			case "Thurday": System.out.println("It's Thursday!");
			break;
			case "Friday": System.out.println("It is Friday!");
			break;
			case "Saturday": System.out.println("It's Saturday!");
			break;	
		}
	}
	

		
	}
// output
// it is monday

// -----------------------
public class Main {

	public static void main(String[] args) {
		
		// switch = statement that allows a variable to be tested for equality against a list of value 
		
		String day = "ai dentro";
		
		switch(day) {
			case "Sunday": System.out.println("It is Sunday!");
			break;
			case "Monday": System.out.println("It is Monday!");
			break;
			case "Tuesday": System.out.println("It is Tuesday");
			break;
			case "Wednesday": System.out.println("It is Wednesday!");
			break;
			case "Thurday": System.out.println("It's Thursday!");
			break;
			case "Friday": System.out.println("It is Friday!");
			break;
			case "Saturday": System.out.println("It's Saturday!");
			break;	
			default: System.out.println("It is not a day!");
		}
	}
	

		
	}
// output
// It is not a day!

// -----------------------
public class Main {

	public static void main(String[] args) {
		
		// && = and
		// || = or
		// ! = not
		int temp = 18;
		
		if(temp>30) {
			System.out.println("It is hot outside");
		}
		else if(temp>=20 && temp <= 30) {
			System.out.println("It's nice outside");
		}
		else {
			System.out.println("it's cold outside");
		}

		
	}
	

		
	}




