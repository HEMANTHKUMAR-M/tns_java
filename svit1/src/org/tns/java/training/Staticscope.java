package org.tns.java.training;

public class Staticscope {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int x,y;
		x = 10;
		y = 100;
		System.out.println(" y is " +y);
		
		if(x == 10) {
			 y = 20;
			 System.out.println(" X and y " +x +y);
			 x = y * 2;
			
		}
		
		System.out.println(" X and Y are "+x +":" +y);
	}

}
