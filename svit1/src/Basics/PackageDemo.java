package Basics; // package keyword used

import org.tns.java.training.*; // import statement used

public class PackageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld H = new HelloWorld(); // HelloWorld is a class on a same package
		H.training();
		
		// Demo is a class of different package
		org.tns.java.training.Demo newpack = new org.tns.java.training.Demo();
		newpack.training();

	}

}
