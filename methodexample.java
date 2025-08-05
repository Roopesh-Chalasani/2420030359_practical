package myproject;

public class methodexample {
			public int display(int a)
			{
				return a;
			}
			public static void main(String args[])
			{
				methodexample ob=new methodexample();
				int b=ob.display(10);
				System.out.println(b);
				System.out.println(ob.display(20));
				//ob.display();
			}
}
