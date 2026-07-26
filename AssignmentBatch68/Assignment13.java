package AssignmentBatch68;

import java.util.Scanner;

//Question:-Write a Program to check person can vote only if he/she is 18 or above and 
//should not vote if age is less using run time input.
public class Assignment13 {


	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the age:-");
		int a = s1.nextInt();
		if(a>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Not elligable for voting");
		}
	
	}

}
