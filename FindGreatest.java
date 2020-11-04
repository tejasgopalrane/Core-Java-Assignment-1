/*13.	Program to find greatest in 3 numbers. [ once using if else statement and then 
 * using ternary operator ( logical operator) ]  
 */
import java.util.Scanner;

public class FindGreatest {
static Scanner sc = new Scanner(System.in);
	
	public static void acceptRecord( int[] num ) {
		System.out.println("Enter three numbers:	");
			for(int i=0;i<num.length;i++)
		{		
				num[i] = sc.nextInt();
		}
	}
	
	public static void ifElse( int[] num )
	{
		for (int i = 1; i < num.length; ++i) {
	        if (num[0] < num[i])
	            num[0] = num[i];
		}
		System.out.println("Greatest number is using If Else : "+num[0]);
	}
	
	public static void ternaryOperator( int[] num )
	{
		for (int i = 1; i < num.length; ++i) 
		{
			int x=(num[0] < num[i]) ? num[0]:num[i];
		}
		System.out.println("Greatest number is using ternary operator : "+num[0]);       
	}
	
	public static void main(String[] args) {
		int[] num = new int[3];
		FindGreatest.acceptRecord( num );
		FindGreatest.ifElse( num );
		FindGreatest.ternaryOperator( num );
	}

}
