/*15.	Accept person’s gender (character m for male and f for female), age (integer),
 * as input and then check whether person is eligible for marriage or not.
 */
import java.util.Scanner;
class Age
{
private int age;
private char gender;

	public void acceptRecord()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Gender M/F:	");
		gender=sc.next().charAt(0);
		System.out.print("Enter Age:	");
	    age=sc.nextInt(); 	
	    
	}
	
	public void printRecord()
	{
		if(gender=='M' && age>=21)
			System.out.println("Eligible for Marraige");
		else if (gender=='F' && age>=18)
			System.out.println("Eligible for Marraige");
		else
			System.out.println("Not Eligible for Marraige");
	
	}
}
public class Eligibility {

	public static void main(String[] args) {
		Age c1= new Age();
		c1.acceptRecord();
		c1.printRecord();

	}

}
