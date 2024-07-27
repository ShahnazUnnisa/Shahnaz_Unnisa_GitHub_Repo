package loops_programs;

//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
public class Even_days {

	public static void main(String[] args) {
		
		int c=0;
		for (int i = 1; i <= 30; i++) {
			if(i%2==0) {
				c++;
			}
		}
		System.out.println("Kunal is allowed to go out "+c+" days in august with his friends");
	}

}
