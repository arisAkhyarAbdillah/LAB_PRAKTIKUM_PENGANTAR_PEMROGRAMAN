import java.util.Scanner;
class Pangram
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    String sentence = read.nextLine().replaceAll(" ", "").toUpperCase();
    int alphabetCount = 0;
    for(char c = 'A'; c <= 'Z'; c++)
    {
      for(int i = 0; i < sentence.length(); i++)
      if(sentence.charAt(i) == c)
      {
        alphabetCount++;
        if(alphabetCount == 26)
        {
          System.out.println("pangram");
          return;
        }
        else
        {
          break;
        }
      }
      else if(i == sentence.length()-1 && sentence.charAt(i) != c)
      {
        System.out.println("bukan pangram");
        return;
      }
    }
  }
}
