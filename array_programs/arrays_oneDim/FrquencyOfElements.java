package arrays_oneDim;

public class FrquencyOfElements {
	
	public static int count(int num,int a[]) {
		int c=0;
		for (int i = 0; i <a.length; i++) {
			if(num==a[i]) {
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		
		
		int a[]= {1,2,5,5,6,6,6};
		
		for (int i = 0; i < a.length; i++) {
			int count=count(a[i], a);

			System.out.println("The no of "+a[i]+" occurs "+count);
			
		}
		
		

	}

}
