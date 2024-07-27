package Methods_Programs;

public class Program2 {
	public static void static1() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public static void static2() {
		double a=10.5;
		double b=20.5;
		System.out.println(a+b);
	}
	public static void static3() {
		String a="hello ";
		String b="world";
		System.out.println(a+b);
	}
	public static void static4() {
		boolean a=true;
		boolean b=false;
		System.out.println(a+" & "+b);
	}
	public  void nonStatic1() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public  void nonStatic2() {
		double a=10.5;
		double b=20.5;
		System.out.println(a+b);
	}
	public  void nonStatic3() {
		String a="hello ";
		String b="world";
		System.out.println(a+b);
	}
	public  void nonStatic4() {
		boolean a=true;
		boolean b=false;
		System.out.println(a+" & "+b);
	}

	public static void main(String[] args) {
		static1();
		static2();
		static3();
		static4();
		Program2 p1=new Program2();
		p1.nonStatic1();
		p1.nonStatic2();
		p1.nonStatic3();
		p1.nonStatic4();

	}

}
