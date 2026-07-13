package AssignmentBatch68;
//Q:-How can you access the non-static method of your own class and of a different class?

public class Assignment6 {

	void add() {
		int a =5;
		int b= 6;
		int c = a+b;
		System.out.println("addition is:-" + c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment6 obj = new Assignment6();
		obj.add();
	}

}
