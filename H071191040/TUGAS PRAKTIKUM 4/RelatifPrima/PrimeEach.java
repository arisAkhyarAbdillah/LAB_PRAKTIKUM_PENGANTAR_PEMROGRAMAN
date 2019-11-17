import java.util.Scanner;
class PrimeEach
{
  public static void main(String args[])
  {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    int value[] = new int[n];
    for(int i = 0 ; i < value.length ; i++)
    {
      value[i] = read.nextInt();
    }
    // mencari relatif prima
    for(int i = 0; i < value.length ; i++)
    {
      for(int j = i+1 ; j < n ; j++)
      {
        int a = value[i];
        int b = value[j];
        do
        {
          int c = b;
          b = a % b;
          a = c;
        } while (b != 0);
        if(a == 1)
        {
          System.out.println(value[i] + " " + value[j]);
        }
      }
    }
  }
}
