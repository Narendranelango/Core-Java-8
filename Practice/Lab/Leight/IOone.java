package Leight;

import java.io.*;
public class IOone{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=null;
		BufferedReader br=null;
		BufferedWriter fw=null;
		StringBuilder sb=null;
		String line=null;
		try {
			br=new BufferedReader(new FileReader("C:\\Java8\\abc.txt"));
			fw=new BufferedWriter(new FileWriter("C:\\Java8\\abcd.txt"));
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("FileNotFound");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while((line=br.readLine())!=null) {
			sb=new StringBuilder(line).reverse();
			String res=sb.toString();
			fw.write(res);
		}
		try {
		br.close();
		fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
