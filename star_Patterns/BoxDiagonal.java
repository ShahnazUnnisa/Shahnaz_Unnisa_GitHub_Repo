package star_Patterns;

public class BoxDiagonal {

	public static void main(String[] args) {
		int num=6;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if(i==1||i==num||j==1||j==num||i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
