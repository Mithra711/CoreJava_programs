package corejava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Read_Data_fFrom_Textfile {

	public static void main(String[] args) throws Exception {
		
		/*// using Filereader & bufferedreader
		
		FileReader fr=new FileReader("C:\\Users\\BhuvaneshWaran\\Documents\\test123.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
		
		
*/
	
	//	Approach 2 : using scanner & File
		
		/*File file =new File("C:\\Users\\BhuvaneshWaran\\Documents\\test123.txt");
		
		Scanner scan=new Scanner(file);
		
		String str;
		
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}*/
		
	// approach 3 : without using while loop
		
        File file =new File("C:\\Users\\BhuvaneshWaran\\Documents\\test123.txt");
		
		Scanner scan=new Scanner(file);
		
		scan.useDelimiter("\\z");
		
		System.out.println(scan.next());
		
		
		
		
		
	}

}
