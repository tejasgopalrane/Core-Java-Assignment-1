/* 12.	In a company an employee is paid as under: If his basic salary is less than 
 * Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If
 * his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA 
 * = 98% of basic salary. If the employee's salary is input by the user write a program
 * to find his gross salary. [ formula : GS= Basic + DA + HRA ]
 */
import java.util.Scanner;
class B
{
private double salary;
private double hra;
private double da;
private double gs;
	public void acceptRecord()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Salary Rs ");
	     salary =sc.nextDouble(); 
	     
	}
	public void calculateGrossSalary()
	{
		if (salary<10000)
		{   hra=0.10*salary;
			da=0.90*salary;
			gs=salary+hra+da;
		}
		else
		{ 
			hra=2000;
			da=0.98*salary;
			gs=salary+hra+da;
		}
	}
	
	public void printRecord()
	{
		System.out.println("Gross Salary of Employee is: "+gs);
	
	}
}

public class GrossSalary {

	public static void main(String[] args) {
		B c1= new B();
		c1.acceptRecord();
		c1.calculateGrossSalary();
		c1.printRecord();

	}

}
