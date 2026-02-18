package org.tns.java.training;

class Demo1{
	private int a = 10;
	protected void msg(){
		System.out.println("Hello, iam working in java basics");
		
		}
}


public class Demo extends Demo1{
//	public void msg(){
//			System.out.println("Hello, iam working in java basics");
//	 }
	 
	protected void training() {
		System.out.println("Iam very much intrested in java Progranmming");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo D = new Demo();
		D.msg();
//		training();
		
		

	}

}
