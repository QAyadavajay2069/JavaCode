package AssignmentBatch68;

public class Assignment3 {
	// Question:-" Call Static Methods inside the main method"
	static void add()
	{
		int a = 2;
		int b = 3;
		int c = a+b;
		System.out.println("Addition of a and b is " + c);
	}

	public static void main(String[] args)
	{
		System.out.println("Calling add method");
		add();
	}
}

