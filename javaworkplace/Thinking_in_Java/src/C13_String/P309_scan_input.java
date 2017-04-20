package C13_String;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;

public class P309_scan_input {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader input=new BufferedReader(new StringReader("vero vnix\n223344"));
		String name=input.readLine();
		String name2=input.readLine();
		System.out.println(name);
		System.out.println(name2);
		
		Scanner scanner=new Scanner("vero vnix \n 22 112");
		String name3=scanner.next();
		String name4=scanner.next();
		int age1=scanner.nextInt();
		int age2=scanner.nextInt();
		
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(age1);
		System.out.println(age2);
	}

}
