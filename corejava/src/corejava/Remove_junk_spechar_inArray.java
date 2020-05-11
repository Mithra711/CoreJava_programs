package corejava;

public class Remove_junk_spechar_inArray {

	public static void main(String[] args) {
		
		
		String s="@#$%^&*selenium@#$%^&*testing 12345@#$%^&*";
		System.out.println("before removing :  "+s);
		 s=s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println("After removing :  "+s);

	}

}
