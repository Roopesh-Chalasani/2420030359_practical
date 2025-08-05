package myproject;
//import java.util.*;
public class autobox {
	public static void main(String[] args) {
		int a =10;
		float b = 2.3f;
		Integer obj = a;
		Float obj1= b;
		System.out.println("Autoboxed Integer: " + obj);
		System.out.println("Autoboxed Integer: " + obj1);
		
		Integer obj3= 50;
		int c = obj3;
		System.out.println("Unboxed int:"+c);
	}

}
