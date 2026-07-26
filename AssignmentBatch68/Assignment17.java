package AssignmentBatch68;

import java.util.Scanner;

//Question:-"WAP to calculate  area&cicumferance using scanner class for trianle"
public class Assignment17 {

static double side1,side2,side3,perimeter;
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter base ");
		double base = s1.nextDouble();
		System.out.println("Enter  height");
		double height = s1.nextDouble();
		double area = 0.5*base*height;
		System.out.println("Area of Triangle is " +area);
		System.out.println("Enter side1");
		side1 = s1.nextDouble();
		System.out.println("Enter side2");
		side2 = s1.nextDouble();
		System.out.println("Enter side3");
		side3 = s1.nextDouble();
		perimeter = side1+side2+side3;
		System.out.println("Perimeter is :-"+perimeter);
		
		
		
		
	
		
		
	
	}

}
