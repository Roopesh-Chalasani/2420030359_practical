package myproject;
import java.util.Scanner;
public class scanner {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter a bool value");
		boolean b=sc.nextBoolean();
		System.out.println("enter a long number");
		Long l = sc.nextLong();
		System.out.println("enter a srting");
		String s=sc.next();
		sc.nextLine();
		System.out.println("enter a line");
		String nl= sc.nextLine();
		System.out.println("enter a double no");
		Double d=sc.nextDouble();
		System.out.println("enter a float no");
		float f=sc.nextFloat();
		System.out.println("Integer" +a);
		System.out.println("Boolean" +b);
		System.out.printf("Long %d String %s %n",l,s);
	}
	
}