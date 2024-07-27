package Oops;

public class SwitchHelper {
	
	public static Switch button(int i) {
		if(i==1) {
		return   new Tv();
		}
		else if(i==2) {
			return new AC();
		}
		return null;
	}
	

}
