package arrays_oneDim;

public class BasicProgram {
	
	public static void main(String[] args) {
		int [] a=new int[5];
		
		a[0]=5;
		a[1]=15;
		a[2]=25;
		a[3]=35;
		a[4]=45;
		
		
		System.out.println(a.length);
		for (int i : a) {
			System.out.println(i);
		}
	}
		
		

}
