package Methods_Programs;

public class Program1 {
	public static void staticMethod1() {
		System.out.println("This is first static method ");
	}
	public static void staticMethod2() {
		System.out.println("This is second static method ");
	}
	public void nonStaticMethod1() {
		System.out.println("This is first non static method");
	}
	public void nonStaticMethod2() {
		System.out.println("This is second non static method");
	}
	public static void main(String[] args) {
		staticMethod1();
		staticMethod2();
		Program1 p1=new Program1();
		p1.nonStaticMethod1();
		p1.nonStaticMethod2();
	}
}
