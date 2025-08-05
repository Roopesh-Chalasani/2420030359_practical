package myproject;

public class paymentgateway {
	void payment(double a) {
		System.out.println(a);
	}
	
	void payment(double a,double d) {
		System.out.println(a);
		System.out.println(d);
	}
	
	void payment(String a,double b) {
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void main(String args[]) {
		paymentgateway obj = new paymentgateway();
		System.out.println("paid through card");
		obj.payment(24200900,2999);
		System.out.println("payed through upi");
		obj.payment("swaraupi",2999);
		System.out.println("payed through cash");
		obj.payment(299);
		
		
		
		
		
		
		
		
		
	}

}