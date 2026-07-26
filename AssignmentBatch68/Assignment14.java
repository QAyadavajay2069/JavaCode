package AssignmentBatch68;

import java.util.Scanner;

//Question:-Write a program to check whether a number is 
//even or odd using run time input and if else block.
public class Assignment14 {


	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int a = s1.nextInt();
		if(a%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd");
		}
	
	}

}
