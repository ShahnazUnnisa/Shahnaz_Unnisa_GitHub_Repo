package Oops;

public class Main_class_Method_Overriding {

	public static void main(String[] args) {
//		Method_Overridig method_Overridig=new Method_Overriding1();
//		method_Overridig.method2();
		
		Method_Overriding1 method_Overriding1=new Method_Overriding1();
		
		Method_Overridig method_Overridig=method_Overriding1;
		method_Overridig.method1();
		
		System.out.println(method_Overridig.getClass().getDeclaredMethods());

	}

}
