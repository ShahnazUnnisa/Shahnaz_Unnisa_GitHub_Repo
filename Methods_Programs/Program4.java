package Methods_Programs;

public class Program4 {
	public static void staticMethod1() {
		System.out.println("This is first static method....");
		staticMethod2();
	}
	public static void staticMethod2() {
		System.out.println("This is second static method....");
	}
	public static void main(String[] args) {
		Program4.staticMethod1();
	}

}
