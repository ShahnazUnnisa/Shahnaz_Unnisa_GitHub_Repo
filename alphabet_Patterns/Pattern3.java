package alphabet_Patterns;

public class Pattern3 {

	public static void main(String[] args) {

		int num=5;
		char ch=65;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if(i+j>num) {
					System.out.print(ch+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	

	}

}
