package NumberRecursion;

public class Prime {
	
	public static void main(String[] args) {
		 
		int num=4;
		int count=div(num, 1, 0);
		
		System.out.println(count);
		   
		if(count==2) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
	}
	
	public static int div(int num,int i,int c) {
		
		if(i>num) {
			return c; 
		}else {
			if(num%i==0) {
				c++;
			}
			i++;
		}
		return div(num, i, c);
	}

}
