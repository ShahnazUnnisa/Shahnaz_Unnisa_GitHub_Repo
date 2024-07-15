package string_programs;

public class Trim {
	public static void main(String[] args) {
		String str=" java";
		System.out.println(str);
		System.out.println(str.length());
		String res=str.trim();
		System.out.println(res);
		System.out.println(res.length());
		String str1="JAVA";
		System.out.println(res.equalsIgnoreCase(str1));
		String em="";
		System.out.println(em.isEmpty());
		System.out.println(res.isEmpty());
	}
}
