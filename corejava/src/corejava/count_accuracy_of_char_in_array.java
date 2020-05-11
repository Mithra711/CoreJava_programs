package corejava;

public class count_accuracy_of_char_in_array {

	public static void main(String[] args) {
		
		String s="selenium is a automation tool";
		int a=s.length();
		
		int replaced_a1=s.replaceAll("a", "").length();
		
		
		int find=a-replaced_a1;
		System.out.println(find);
		
			
		
		
	}
}
