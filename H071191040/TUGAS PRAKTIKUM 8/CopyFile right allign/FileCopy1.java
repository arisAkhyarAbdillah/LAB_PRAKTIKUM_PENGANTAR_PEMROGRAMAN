import java.util.Scanner;
import java.io.*;
class FileCopy1
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		FileWriter file_write = null;
		PrintWriter writer = null;
		FileReader file_read= null;
		BufferedReader reader = null;
		String input = read.next();
		String output = read.next();
		
		try
		{
			file_read = new FileReader(String.format("%s.txt",input));
			reader = new BufferedReader(file_read);
			file_write = new FileWriter(String.format("%s.txt",output));
			writer = new PrintWriter(file_write);
			String s;
			while((s = reader.readLine()) != null)
			{
				writer.println(String.format("%18s",s));
			}
			System.out.print("Berhasil");
		}
		catch(IOException e)
		{
			System.out.print("Gagal");
		}
		finally
		{
			try
			{
				if(file_write != null)
				{
					file_write.close();
				}
				if(writer != null)
				{
					writer.close();
				}
				if(file_read != null)
				{
					file_read.close();
				}
				if(reader != null)
				{
					reader.close();
				}
			}
			catch(IOException e)
			{
				System.out.print("hahahah");
			}
		}
	}
}