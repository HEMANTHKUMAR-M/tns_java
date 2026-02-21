package org.tnsif.acc.c2tc.packageDemo; // package keyword used
 // import statement used
import org.tnsif.acc.c2tc.firsthelloworldprogram.*;


public class PackageDemo extends HelloWorld{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HelloWorld H = new HelloWorld(); // HelloWorld is a class on a same package
//		H.training();
//		
		// Demo is a class of different package
		
		PackageDemo dd = new PackageDemo();
		dd.training(); // training is a method that defined in super class HelloWorld
		
;	}

}
