package myproject;
import java.util.*;
public class grosssal {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Employee ID: ");
	int empId = sc.nextInt();
	System.out.println("Enter your basic salary: ");
	Double basicsalary = sc.nextDouble();
    System.out.print("Enter HRA: ");
    double hra = sc.nextDouble();
    double actualhra = (basicsalary*hra) /100;
    System.out.print("Enter DA: ");
    double da = sc.nextDouble();
    double actualda = (basicsalary*da) /100;
    System.out.print("Enter PF: ");
    double pf = sc.nextDouble();
    double actualpf = (basicsalary*pf) /100;
 
    double grossSalary = basicsalary + actualhra + actualda - actualpf ;
    System.out.println("Employee ID: " + empId);
    System.out.println("Gross Salary: Rs. " + grossSalary);
    if (grossSalary > 20000 && pf > 1000) {
        System.out.println("Eligible");
    } else {
        System.out.println("Not Eligible");
    }
}
}