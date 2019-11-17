import java.util.Scanner;
class Anagram
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    String kata0 = read.nextLine().toLowerCase().replaceAll(" ","");
    String kata1 = read.nextLine().toLowerCase().replaceAll(" ","");
    int n = kata0.length();
    int n1 = kata1.length();
    char c1[] = kata0.toCharArray();
    char c2[] = kata1.toCharArray();
    boolean same = true;
    if(n != n1)
    {
      System.out.println("bukan anagram");
    }
    else
    {
      for(int i = 0; i < n; i++)
      {
        for(int j = 0; j < n; j++)
        {
          if(c1[j] != c2[i] && j == n-1)
          {
            same = false;
            break;
          }
          else if(c1[j] == c2[i])
          {
            c1[j] = ' ';
            c2[i] = ' ';
            break;
          }
        }
        if(!same)
        {
          System.out.println("bukan anagram");
          break;
        }
      }
      if(same)
      {
        System.out.println("anagram");
      }
    }
  }
}
