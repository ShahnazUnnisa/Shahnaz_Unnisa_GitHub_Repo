package star_Patterns;

public class Pattern5 {

	public static void main(String[] args) {
		int num = 5;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if(j==1||j==5||i==2||i==3) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
