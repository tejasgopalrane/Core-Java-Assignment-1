/*10.	Write a program to convert temperature from Fahrenheit to Celsius. Take 
 * Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
 */
import java.util.Scanner;
public class temperature {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Input a degree in Fahrenheit: ");
	        double f = sc.nextDouble();

	        double  c =(( 5 *(f- 32.0)) / 9.0);
	        System.out.println(f + " degree Fahrenheit is equal to " + c + " in Celsius");
	}

}
