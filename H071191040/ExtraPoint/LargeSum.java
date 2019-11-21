import java.util.Scanner;

class LargeSum
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		String num1 = read.next();
		String num2 = read.next();
		num1 = reverse(num1);
		num2 = reverse(num2);
		int max = num1.length() > num2.length() ? num1.length():num2.length();
		int temp = 0;
		String s = "";
		for(int i = 0; i < max; i++)
		{
			int number1 = i < num1.length() ? (int)num1.charAt(i) % '0':0;
			int number2 = i < num2.length() ? (int)num2.charAt(i) % '0':0;
			if(i != max-1)
			{
				int sum = number1 + number2 + temp;
				System.out.println(sum);
				temp = sum >= 10 ? 1:0;
				sum %= 10;
				s = String.valueOf(sum) + s;
			}
			else
			{
				int sum = number1 + number2 + temp;
				s = String.valueOf(sum) + s;
			}
		} 
		System.out.println(s);	
	}

	static String reverse(String s)
	{
		String s1 = "";
		for(int i = 0; i < s.length(); i++)
		{
			s1 = s.charAt(i) + s1;
		}
		return s1;
	}
}