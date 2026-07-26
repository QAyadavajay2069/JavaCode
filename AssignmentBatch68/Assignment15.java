package AssignmentBatch68;

import java.util.Scanner;

//Question:-WAP to Demonstrate Methods of the Scanner Class
public class Assignment15 {


	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your age:-");
		int a = s1.nextInt();
		System.out.println("Your age is  " +a);
		System.out.println("Are you student(True/False)");
		boolean b = s1.nextBoolean();
		 // s1.nextLine(); // Consume leftover newline
	        System.out.print("Enter your full address: ");
	        String address = s1.nextLine();
		
	
	}

}
