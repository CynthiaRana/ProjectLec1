package Package2;

import java.util.Scanner;

public class MathLec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
int num1 = 10;
int num2 = 25;
int sum = (num1 + num2);
System.out.println(sum);

System.out.println("i've done creating 2 variables ");


System.out.println(num1);
System.out.println(num2);



if(num1 % 2 == 0) 
	System.out.println ("This is an even number");

else 	
	System.out.println ("This is an odd number");
*/

		
int number = 6;

Scanner keyboard = new Scanner(System.in);
System.out.print("please enter a number:");
number = keyboard.nextInt();
keyboard.close();

if (number % 2 == 0)
	System.out.println ("it's even number");
else
	System.out.println("it's odd number");


		 
	}

}
// World war 3

