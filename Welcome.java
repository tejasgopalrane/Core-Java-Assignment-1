import java.util.Scanner;

public class Welcome {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Input your first name: ");
    String fname = input.next();
    System.out.print("Input your last name: ");
    String lname = input.next();
    System.out.println();
    System.out.println("Welcome "+fname+" "+lname);
  }
}