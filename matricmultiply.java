package myproject;
import java.util.*;

public class matricmultiply {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[][] a = new int[2][2];
	        int[][] b = new int[2][2];
	        int[][] product = new int[2][2];

	        System.out.println("Enter elements");
	        for (int i = 0; i < 2; i++)
	            for (int j = 0; j < 2; j++)
	                a[i][j] = sc.nextInt();

	        System.out.println("Enter elements");
	        for (int i = 0; i < 2; i++)
	            for (int j = 0; j < 2; j++)
	                b[i][j] = sc.nextInt();

	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                product[i][j] = 0;
	                for (int k = 0; k < 2; k++)
	                    product[i][j] += a[i][k] * b[k][j];
	            }
	        }

	        System.out.println("Result of Matrix Multiplication:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++)
	                System.out.print(product[i][j] + " ");
	            System.out.println();
	        }
	    }

}


