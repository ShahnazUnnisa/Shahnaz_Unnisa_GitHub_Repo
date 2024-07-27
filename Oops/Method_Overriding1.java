package Oops;

public class Method_Overriding1 extends Method_Overridig{
	
	@Override
	public void method1() {
		System.out.println("this is method 1 of class 2");
	}
	@Override  
	public void method2() {
		System.out.println("this is method 2 of class 2");
	}
	@Override
	public String toString() {
		return "Method_Overriding1 []";
	}

}
