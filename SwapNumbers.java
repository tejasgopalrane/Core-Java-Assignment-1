/*11.	Write a program to swap two numbers without using third variable.*/

import java.util.Scanner;
class A
{
private float num1;
private float num2;

	public void acceptRecord()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First Number: ");
	     num1=sc.nextFloat(); 
	     System.out.print("Enter second number: ");
	     num2=sc.nextFloat();
	}
	
	public void printRecord()
	{
		num1=num1+num2; //6+2=8
		num2=num1-num2;	//8-2=6
		num1=num1-num2; //8-6=2
		System.out.println("After swapping num1 is: "+num1+" and num2 is "+num2);
	
	}
}

public class SwapNumbers {

	public static void main(String[] args) {
		A c1= new A();
		c1.acceptRecord();
		c1.printRecord();
	}

}
