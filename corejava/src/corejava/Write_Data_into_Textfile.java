package corejava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write_Data_into_Textfile {

	public static void main(String[] args) throws Exception {
		
       FileWriter fr=new FileWriter("C:\\Users\\BhuvaneshWaran\\Documents\\test123.txt");
		
		BufferedWriter br=new BufferedWriter(fr);
		
		br.write("selenium iis usbdg hssffgsu");
		br.write("selenium fgsshgf sghgfhgfhtfhfgh");
		br.write("selenium iis usbdg hssffgsu");
		
		System.out.println("finished");
		br.close();
	

	}

}
