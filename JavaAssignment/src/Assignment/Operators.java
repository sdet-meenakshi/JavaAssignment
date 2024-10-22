package Assignment;

public class Operators {
	public void sum() {
		int a=4;
		int b=6;
		int c= a+b;
		System.out.println("Result of sum is=" +c);
	}
	public void sub() {
		int a=4;
		int b=6;
		int c= a-b;
		System.out.println("Result of sub is="+c);
	}
	public void mul() {
		int a=4;
		int b=6;
		int c= a*b;
		System.out.println("Result of mul is="+c);
	}
	public void div() {
		int a=6;
		int b=6;
		int c= a/b;
		System.out.println("Result of div is="+c);
	}
	

	public static void main(String[] args) {
		Operators ob= new Operators();
		ob.sum();
		ob.sub();
		ob.mul();
		ob.div();

	}

}
