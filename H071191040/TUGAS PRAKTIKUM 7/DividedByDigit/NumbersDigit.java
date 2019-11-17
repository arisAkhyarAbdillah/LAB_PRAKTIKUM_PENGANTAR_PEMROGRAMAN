import java.util.Scanner;
import java.util.ArrayList;
class NumbersDigit
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		int begin = read.nextInt();
		int end = read.nextInt();
		System.out.println(getSelfDividedNums(begin, end));
	}

	static ArrayList getSelfDividedNums(int a, int b)
	{
		ArrayList <Integer> miracle_nums  = new ArrayList<>();
		for(int i = a; i <= b; i++)
		{
			boolean cek = true;
			int temp = Math.abs(i), pangkat = 1, base = 1;
			if(temp % 10 == 0 || temp % (temp % 10) != 0)
			{
				continue;
			}
			while(temp > Math.pow(10, pangkat))
			{
				base *= 10;
				temp /= base;
				temp %= 10;
				if(temp == 0 || i % temp != 0)
				{
					cek = false;
					break;
				}
				pangkat++;
			}
			if(cek)
			{
				miracle_nums.add(i);
			}
		}
		return miracle_nums;
	}
}
