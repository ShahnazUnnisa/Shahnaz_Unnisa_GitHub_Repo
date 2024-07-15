package string_programs;

public class EvenIndexCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Shahnaz unnisa";
		for (int i = 0; i < str.length(); i++) {
			if(i%2==0) {//even index
				//if(i%2==1) {//odd index
			System.out.println(str.charAt(i));
			}
			
		}
	}

}
