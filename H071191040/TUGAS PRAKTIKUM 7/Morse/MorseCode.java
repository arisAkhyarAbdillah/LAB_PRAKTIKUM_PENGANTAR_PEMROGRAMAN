import java.util.Scanner;
import java.util.HashMap;

class MorseCode
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner read = new Scanner(System.in);
			System.out.println("Input morse code :");
			String s[] = read.nextLine().split(" ");
			System.out.println("Translated code : " + encryptCode(s));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	static String encryptCode(String s[]) throws Exception
	{
		String result = "";
		HashMap <String, String> code = new HashMap<>();

		code.put(".-", "a");
		code.put("-...", "b");
		code.put("-.-.", "c");
		code.put("-..", "d");
		code.put(".", "e");
		code.put("..-.", "f");
		code.put("--.", "g");
		code.put("....", "h");
		code.put("..", "i");
		code.put(".---", "j");
		code.put("-.-", "k");
		code.put(".-..", "l");
		code.put("--", "m");
		code.put("-.", "n");
		code.put("---", "o");
		code.put(".--.", "p");
		code.put("--.-", "q");
		code.put(".-.", "r");
		code.put("...", "s");
		code.put("-", "t");
		code.put("..-", "u");
		code.put("...-", "v");
		code.put(".--", "w");
		code.put("-..-", "x");
		code.put("-.--", "y");
		code.put("--..", "z");
		code.put(".----", "1");
		code.put("..---", "2");
		code.put("...--", "3");
		code.put("....-", "4");
		code.put(".....", "5");
		code.put("-....", "6");
		code.put("--...", "7");
		code.put("---..", "8");
		code.put("----.", "9");
		code.put("-----", "0");

		for(int i = 0, n = s.length; i < n; i++)
		{
			if(code.get(s[i]) == null)
			{
				throw new Exception("not a morse code");
			
			}
			else
			{
					result += code.get(s[i]);

			}
		}
		return result;

	}
}