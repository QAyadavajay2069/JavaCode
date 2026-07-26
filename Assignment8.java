package AssignmentBatch68;
//Q:-Write a program on Method overloading


public class Assignment8 {

	
	 void add(double a)
	{
		System.out.println("Method overloading");
	}
	void add (int a)
	{
		System.out.println("Method overloading");
		
	}
	
	public static void main(String[] args) {
		Assignment8 d1 = new Assignment8();
	d1.add(2);
	d1.add(2.2);
		
	}

}
