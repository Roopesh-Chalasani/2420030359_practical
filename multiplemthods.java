package myproject;

public class multiplemthods {
		public void A()
		{
			System.out.println("this is in A");
		}
		public void B()
		{
			System.out.println("this is in B");
		}
		public void C()
		{	B();
		System.out.println("this is in c");
		}
		public void D()
		{	A();
			B();
			System.out.println("this in in D");
		}
public static void main(String args[])
{
	multiplemthods ob=new multiplemthods();
	ob.D();
	ob.C();
}
}
