package Methods_Programs;

public class Demo_Program {
	public static void staticMethod() {
		System.out.println("This is static method");
	}
	public void nStaticMethod() {
		System.out.println("This is non static method");
	}
	public static void main(String[] args) {
		staticMethod();
		Demo_Program d1=new Demo_Program();
		d1.nStaticMethod();
		new Demo_Program().nStaticMethod();
	}
}
