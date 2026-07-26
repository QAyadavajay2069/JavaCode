package AssignmentBatch68;
//Q:-Write a program on Constructor overloading

public class Assignment7 {

	Assignment7(int a ,String b)
	{
		System.out.println("Constructor");
	}
	Assignment7(int a ,double b)
	{
		System.out.println("Second Constructor");
	}
	Assignment7(int a ,double b , boolean c)
	{
		System.out.println("Third Constructor");
	}
	
	
	public static void main(String[] args) {
		Assignment7 obj = new Assignment7(7,"Ajay");
		Assignment7 obj1 = new Assignment7(7,7.7);
		Assignment7 obj2 = new Assignment7(7,7.7,false);
		
	}

}
