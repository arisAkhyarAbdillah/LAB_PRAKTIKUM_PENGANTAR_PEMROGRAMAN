import java.util.Scanner;
class Matriks2
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int x = key.nextInt();
    int y = key.nextInt();
    for(int i = 1 ; i <= y ; i++)
    {
      System.out.printf("%d",i);
      System.out.printf("%s",i % x == 0? "\n":" ");

    }
  }
}
