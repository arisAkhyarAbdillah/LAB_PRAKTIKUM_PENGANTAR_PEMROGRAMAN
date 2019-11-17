import java.util.Scanner;
import java.io.*;
class SimpleDatabase
{
	public static void main(String[] args) 
	{

		Scanner read = new Scanner(System.in);
		String title = read.next();
		int n = read.nextInt();
		String s[][] = new String[n][3];

		// FileWriter fileWrite = null;
		FileWriter fileWrite = null;
		PrintWriter writer = null;
		FileReader read_file = null;
		BufferedReader reader = null;
		try
		{	
			fileWrite = new FileWriter(String.format("%s.txt",title));
			writer = new PrintWriter(fileWrite);

			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					s[i][j] = read.next().replaceAll("_", " ");
				}
			}

			writer.println(table(s, n));

			
			System.out.println("Berhasil");
		}
		catch(IOException e)
		{
			System.out.println("Gagal");
		}
		finally
		{
			try
			{
				// if(fileWrite != null)
				// {
				// 	fileWrite.close();
				// }
				if(fileWrite != null)
				{
					fileWrite.close();
				}				
				if(writer != null)
				{
					writer.close();
				}
			}
			catch(IOException e)
			{
					System.out.println("kk");
			}
		}
	}

	static String table(String arr[][], int n)
	{
		String s = "";
		int max[] = {4, 3, 8};
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				max[j] = max[j] > arr[i][j].length() ? max[j]:arr[i][j].length();
			}
		}
		int sumLength = 16;
		for(int i = 0; i < 3; i++)
		{
			sumLength += max[i];
		}
		for(int i = 0; i < sumLength; i++)
		{
			// System.out.print(i == 0 || i == sumLength-1 ? "+":"-");
			s += String.format("%s", i == 0 || i == sumLength-1 ? "+":"-");
		}
			s += "\n";
		// System.out.println();
		for(int i = 0; i < max[0]; i++)
		{
			s += String.format("%s", i == 0 ? "| Nama":i == max[0]-1 ? "|":" ");
			// System.out.print(i == 0 ? "| Nama":i == max[0]-1 ? "|":" ");
		}
		
		for(int i = 0; i < max[1]; i++)
		{
			s += String.format("%s", i == 0 ? " NIM":i == max[1]-1 ? "|":" ");
			// System.out.print(i == 0 ? " NIM":i == max[1]-1 ? "|":" ");
		}
		
		for(int i = 0; i < max[2]; i++)
		{
			s += String.format("%s", i == 0 ? " Angkatan":i == max[2]-1 ? "|":" ");
			// System.out.print(i == 0 ? " Angkatan":i == max[2]-1 ? "|":" ");
		}
		s += "\n";
		for(int i = 0; i < sumLength; i++)
		{
			s += String.format("%s", i == 0 || i == sumLength-1 ? "+":"-");
			// System.out.print(i == 0 || i == sumLength-1 ? "+":"-");
		}
		s += "\n";
		for(int i = 0; i < n; i++)
		{
			for(int j = 0, index = 0; j < max[0]+4; j++)
			{
				int  x = arr[i][0].length();
				s += String.format("%s", j == 0 ? "| ":j <= x ? arr[i][0].charAt(index):j == max[0]+3 ? "|":" ");
				// System.out.print(j == 0 ? "| ":j <= x ? arr[i][0].charAt(index):j == max[0]+3 ? "|":" ");
				index += j == 0 ? 0:1;
			}
			for(int j = 0, index = 0; j < max[1]+3; j++)
			{
				int  x = arr[i][1].length();
				s += String.format("%s", j == 0 ? " ":j <= x ? arr[i][1].charAt(index):j == max[1]+2 ? "|":" ");
				// System.out.print(j == 0 ? " ":j <= x ? arr[i][1].charAt(index):j == max[1]+2 ? "|":" ");
				index += j == 0 ? 0:1;
			}
			for(int j = 0, index = 0; j < max[2]+8; j++)
			{
				int  x = arr[i][2].length();
				s += String.format("%s", j == 0 ? " ":j <= x ? arr[i][2].charAt(index):j == max[2]+7 ? "|":" ");
				// System.out.print(j == 0 ? " ":j <= x ? arr[i][2].charAt(index):j == max[2]+7 ? "|":" ");
				index += j == 0 ? 0:1;
			}
			s += "\n";
		}
		for(int i = 0; i < sumLength; i++)
		{
			s += String.format("%s", i == 0 || i == sumLength-1 ? "+":"-");
		}
		return s;
	}
}