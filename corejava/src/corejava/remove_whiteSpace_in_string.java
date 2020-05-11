package corejava;

public class remove_whiteSpace_in_string {

	public static void main(String[] args) {

		String s="selenium is a automation tool";
		
		System.out.println(s);
		
		 s=s.replaceAll("\\s", "");
		 System.out.println(s);
		 
		
	}
}