package myproject;
import java.util.*;
public class employee {
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter name ");
		String s= sc.next();
		System.out.println("Enter employee id");
		long l = sc.nextLong();
		System.out.println("Enter dept");
		String si= sc.next();
		System.out.println("Enter years of exp");
		float f= sc.nextFloat();
		System.out.println("Enter salary");
		double d = sc.nextDouble();
		System.out.println("Enter fulltime status");
		Boolean b= sc.nextBoolean();
		System.out.println("Employee details");
		System.out.println("Name : " +s);
		System.out.println("Emp ID : " +l);
		System.out.println("Dept : "+si);
		System.out.println("Years of exp : "+f);
		System.out.println("Salary : "+d);
		System.out.println("Full time status : "+b);
		
	}

}