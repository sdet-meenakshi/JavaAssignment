package Assignment;

public class StaticMethod {
	
	public static void sum() {
		int a=5;
		int b=6;
		int c= a+b;
		System.out.println(c);
	}
	public static void sub() {
		int a=5;
		int b=6;
		int c= a-b;
		System.out.println(c);
	}
	public static void mul() {
		int a=5;
		int b=6;
		int c= a*b;
		System.out.println(c);
	}
	public static void div() {
		int a=5;
		int b=6;
		int c= a/b;
		System.out.println(c);
	}
	public static void Text() {
		System.out.println("static method 5 times in the main method");
	}

	public static void main(String[] args) {
		StaticMethod.sum();
		StaticMethod.sub();
		StaticMethod.mul();
		StaticMethod.div();
		StaticMethod.Text();
		
// Call the static method 5 times in the main method
	}

}
