import java.util.Scanner;
class Anagram1
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    String kata1 = read.nextLine().toUpperCase().replaceAll(" ","");
    String kata2 = read.nextLine().toUpperCase().replaceAll(" ","");
    char c1[] = kata1.toCharArray();
    char c2[] = kata2.toCharArray();
    kata1 = "";
    kata2 = "";
    if(c1.length != c2.length)
    {
      System.out.print("Bukan Anagram");
    }
    else
    {
      for(int i = 0, n = c1.length; i < c1.length-1; i++)
      {
        for(int j = 0; j < n-1; j++)
        {
          if(c1[j] > c1[j+1])
          {
            char temp = c1[j];
            c1[j] = c1[j+1];
            c1[j+1] = temp;
          }
          if(c2[j] > c2[j+1])
          {
            char temp = c2[j];
            c2[j] = c2[j+1];
            c2[j+1] = temp;
          }
        }
        kata1 += c1[n-1];
        kata2 += c2[n-1];
        n--;
      }
      System.out.println(kata1.equals(kata2) ? "Anagram":"Bukan Anagram");
    }
  }
}
