package star_Patterns;

public class Pattern4 {

	public static void main(String[] args) {

		int num = 5;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 2 || i == 3 || j == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
