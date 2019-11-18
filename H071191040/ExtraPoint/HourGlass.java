import java.util.Scanner;

class HourGlass
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int glass[][] = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				glass[i][j] = read.nextInt();
			}
		}

		int max = Integer.MIN_VALUE;
        int counter = 0;

        for(int i = 0; i < n-2; i++)
        {
            for(int j = 0; j < n-2; j++)
            {
               for(int l = j; l <= j+2; l++)
                {
                    counter+= glass[i][l] + glass[i+2][l];
                }
                counter+= glass[i+1][j+1];
                max = max < counter ? counter:max;
                counter = 0;
            }
        }
       	System.out.println(max);
	}
}