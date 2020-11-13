package bbit_assignments;
import java.io.*;
public class UpperCaseLowerCase {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStreamReader r =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Enter the String : ");
		String str = br.readLine();
		System.out.println("The Original String : "+str);
		System.out.println("In Upper Case : "+str.toUpperCase());
		System.out.println("In Lower Case : "+str.toLowerCase());
	}

}
