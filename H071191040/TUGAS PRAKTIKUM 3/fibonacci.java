import java.util.Scanner;
class fibonacci
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int n = key.nextInt();
    long x = 0, y = 1;
    long z;
    System.out.print(x + " " + y);
    for(int i = 0 ; i < n-2 ; i++)
    {
      z = x+y;
      x = y;
      y = z;

      System.out.print(" "+z);
    }
  }
}
