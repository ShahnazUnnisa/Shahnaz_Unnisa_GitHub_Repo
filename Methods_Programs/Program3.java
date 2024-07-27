package Methods_Programs;

public class Program3 {
	public static void staticMethod() {
		System.out.println("This is static method....");
	}
	public void nonStaticMethod() {
		staticMethod();
		System.out.println("This is non-static method....");
	}
	public static void main(String[] args) {
		Program3 p1=new Program3();
		p1.nonStaticMethod();
	}
}
