package Basics;

public class StaticDemo {
	
	static int num1 = 100; // static variable
	int num2=200;
	
	// default constructor
	public StaticDemo(){
		System.out.println("Constructor will also be run after the static block executes ");
	}
	
	public void add() {
		
		System.out.println(" Results of "+num1+ " and " +num2 + " will be  : " +(num1+num2));
	}
	
	//static block 
	static {
		System.out.println(" Adding two numbers which will be declared with a static keyword");
	}
	
	public void mul() {
		System.out.println(" Results of "+num1+ " and " +num2 + " will be  : " +(num1*num2));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticDemo obj = new StaticDemo(); // object creation
		obj.add();
		obj.mul();
		System.out.println(" the value of num1 is :" +num1);
	}

}
