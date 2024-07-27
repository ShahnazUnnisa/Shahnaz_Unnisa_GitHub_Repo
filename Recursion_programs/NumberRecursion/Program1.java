package NumberRecursion;

public class Program1 {

	public static void main(String[] args) {
		
		print(1, 3);

	}
	
	public static void print(int s,int e) {
		int n=s;
		if(n>e) {
			return;
		}
		else {
			System.out.println(n);
			s++;
		}
		print(s, e);
	}

}
