package AssignmentBatch68;

import java.util.Scanner;

//Question:-"WAP to calculate  area & cicumferance using scanner class for Circle"
public class Assignment16 {


	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter radius");
		int r = s1.nextInt();
		System.out.println("Area of circle is " +Math.PI*r*r);
		System.out.println("Area of circumfrence is " + 2*Math.PI*r);
		
		
	
	}

}
