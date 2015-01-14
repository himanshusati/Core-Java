package Threads;

public class Rock extends Atom {
	
	
	
	public static void parse(String str) {
		float f=1; 
		try 
		 {
		 f = Float.parseFloat(str);
		 } 
		 catch (NumberFormatException nfe) 
		 {
		 f = 0;
		 } finally {
		 System.out.println(f);
		 }
		 }

		 public static void main(String[] args) {
		 parse("2.3456");
		 }
	public Rock(String Str) {
	
		System.out.println("2nd. called from Str with rock name as :" + Str);
	}

}
