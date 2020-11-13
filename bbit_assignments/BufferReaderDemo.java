package bbit_assignments;

import java.io.*;

public class BufferReaderDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String name;
		
		InputStreamReader r=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(r);
		
		System.out.println("Enter the Name:");
		name=br.readLine();
		System.out.println("Name: "+name);

	}

}
