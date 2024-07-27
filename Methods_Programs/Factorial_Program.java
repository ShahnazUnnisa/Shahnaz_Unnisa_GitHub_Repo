package Methods_Programs;

public class Factorial_Program {
	public static void fact(int num) {
		int prod=1;
//		for(int i=1;i<=num;i++) {
//			prod=prod*i;
//		}
		while(num!=0) {
			prod=prod*num;
			num--;
		}
		System.out.println(prod);
	}

	public static void main(String[] args) {
		fact(4);

	}

}
