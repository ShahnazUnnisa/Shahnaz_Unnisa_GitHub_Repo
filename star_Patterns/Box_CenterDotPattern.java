package star_Patterns;

public class Box_CenterDotPattern {

	public static void main(String[] args) {
		int num=7;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if(i==1||i==num||j==1||j==num||(i==(num/2)+1&&j==(num/2)+1)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
