import java.util.Scanner;
class ManipulateString
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    String sentence = read.nextLine().toUpperCase();
    int n = sentence.length();
    sentence = sentence.replaceAll(" ","");
    int j = sentence.length();
    String halfSentence = sentence.substring(0,j/2);
    String palindrom = makePalindrom(halfSentence);

    String hexa = String.format("%x",n*n);
    System.out.printf("#%s%s%s%o%c",hexa, halfSentence, palindrom, n, hexa.charAt(0) >= 'A' && hexa.charAt(0) <= 'z' ? '?':'!');

  }

  // make String to be palindrom(reverse the char of string)
  static String makePalindrom(String s)
  {
    String baru = "";
    for(int i = s.length() - 2; i >= 0; i--)
    {
      baru += s.charAt(i);
    }
    return baru;
  }

}
