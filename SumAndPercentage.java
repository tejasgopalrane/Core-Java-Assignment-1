/*07.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
Take the obtained marks from user using Scanner class. Output should be in 
this format [ percentage marks = 99 % ]. Use concatenation operator here.
 */
import java.util.Scanner;

public class SumAndPercentage {
	static float sum;
	float percentage;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void acceptRecord( int[] marks ) {
		System.out.println("Enter Five Subject Marks:	");
			for(int i=0;i<marks.length;i++)
		{		
		marks[i] = sc.nextInt();
		sum= sum + marks[i];
		}
	}
	public static void printRecord( int[] marks ) {
		System.out.println("Total Marks are	=	"+sum);
		System.out.println("Percentage Marks=	"+((sum/500)*100)+"%");
	}

	public static void main(String[] args) {
		int[] marks = new int[5];
		SumAndPercentage.acceptRecord( marks );
		SumAndPercentage.printRecord( marks);

	}

}







