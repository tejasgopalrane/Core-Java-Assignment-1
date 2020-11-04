/*14.	Program to check that entered year is a leap year or not.*/

import java.util.Scanner;
class Year
{
private int yr;

	public void acceptRecord()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Year: ");
	     yr=sc.nextInt(); 	     
	}
	
	public void printRecord()
	{
		if(yr%4==0 || yr%400==0)
			System.out.println("Entered year is leap year");
		else
			System.out.println("Entered year is not leap year");
	
	}
}
public class LeapYear {

	public static void main(String[] args) {
		Year c1= new Year();
		c1.acceptRecord();
		c1.printRecord();

	}

}
