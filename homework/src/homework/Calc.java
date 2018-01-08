package homework;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int result = 0;
		printManual();
		
		int select = in.nextInt();
		
		while(select != 4)
		{
			System.out.println("Input two numbers: ");
			int number1 = in.nextInt();
			int number2 = in.nextInt();
			
			if(select == 1)
				result = add(number1, number2);
			else if(select == 2)
				result = subtract(number1, number2);
<<<<<<< HEAD
			else
				result = multiply(number1, number2);
=======
>>>>>>> refs/heads/master
			
			System.out.println("x: " + number1);
			System.out.println("y: " + number2);
			break;
		}
		if(select == 4)
		{
			System.exit(0);
		}
		
		System.out.println("Result: " + result);
		
	}
	public static void printManual(){
		System.out.println("[ID: 1771504]");
		System.out.println("[Name: 이하용]\n");
		
		System.out.println("1. Add two numbers");
		System.out.println("2. Subtract two numbers");
		System.out.println("3. Multiply two numbers");
		System.out.println("4. Quit");
		System.out.println("\nchoose the number");
	}
	public static int add(int number1, int number2){
		return number1 + number2;
	}
	
	public static int subtract(int number1, int number2){
		return number1 - number2;
	}
<<<<<<< HEAD
	public static int multiply(int number1, int number2){
		return number1 * number2;
	}
=======
	
>>>>>>> refs/heads/master
}
