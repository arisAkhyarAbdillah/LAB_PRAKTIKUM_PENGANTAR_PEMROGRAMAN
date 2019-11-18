import java.util.Scanner;

class ChangeCase
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		String sentence = read.nextLine();
		String s = "";
		for(int i = 0; i < sentence.length(); i++)
		{
			if(sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z')
			{
				char c = sentence.charAt(i);
				int cast = (int) c + 32;
				s += (char) cast;
			}
			else if(sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z')
			{
				char c = sentence.charAt(i);
				int cast = (int) c - 32;
				s += (char) cast;
			}
			else
			{
				s += sentence.charAt(i);
			}
		}		

		System.out.print(s);
	}
}