package corejava;import javax.swing.text.AttributeSet.CharacterAttribute;

public class Reverse_each_word_inString {

	public static void main(String[] args) 
	{
		/*String st="welcome to selenium project";
		
		for(int i=st.length()-1;i>=0;i--)
		{
			
			System.out.print(st.charAt(i));
		}*/
		
		/*// approach : using for loop
		String st="welcome to selenium project";
		
		String[] words=st.split(" "); 
		
		String reverstring="";
		
		for (String w : words)    // w= welcome
		{
			String reversword="";
			for (int i=w.length()-1;i>=0;i--) 
			{
				reversword=reversword+w.charAt(i);
			}
			reverstring=reverstring+reversword+" ";
		}
		System.out.println(reverstring);
		
	}*/
		
		// Approach 2: using Stringbuilder
		
      String st="welcome to selenium project";
		
		String[] words=st.split("\\s"); 
		
		String reverstring="";
		
		for (String w : words)
		{
			  StringBuilder sb=new StringBuilder(w);
			  sb.reverse();
			  
			  reverstring=reverstring+sb.toString()+" ";
			  
			
		}
		
		System.out.println(reverstring);
		
		
		
		
	}
		
}
