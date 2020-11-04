/*08.	Write a program to find the simple interest. 
 * Take the principle amount, rate of interest and 
 * time from user using Scanner class
 */
import java.util.Scanner;
class Data
{
private float principle;
private float rate;
private float time;
private float simpleinterest;
	public void acceptRecord()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Principle: ");
	     principle=sc.nextFloat(); 
	     System.out.print("Enter Rate: ");
	     rate=sc.nextFloat();
	     System.out.print("Enter time in Year: ");
	     time=sc.nextFloat();
	}
	public void calculateInterest()
	{
		simpleinterest=(principle*rate*time)/100;
	}
	
	public void printRecord()
	{
		System.out.println("Simple Interest is: "+simpleinterest);
	
	}
}

public class SimpleInterest {

	public static void main(String[] args) {
		Data c1= new Data();
		c1.acceptRecord();
		c1.calculateInterest();
		c1.printRecord();
	}

}
