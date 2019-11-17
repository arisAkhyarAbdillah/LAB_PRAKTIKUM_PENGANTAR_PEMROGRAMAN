import java.util.Scanner;
class SelangSeling
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    String untaian[] = new String[n];
    int count[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      untaian[i] = read.next();
    }

    for(int i = 0; i < n; i++)
    {
      for(int j = 0; j < untaian[i].length()-1; j++)
      {
        char temp = untaian[i].charAt(j);
        if(temp == untaian[i].charAt(j+1))
        {
          count[i]++;
        }
      }
    }
    for(int i = 0; i < n; i++)
    {
      System.out.println(count[i]);
    }
  }
}
