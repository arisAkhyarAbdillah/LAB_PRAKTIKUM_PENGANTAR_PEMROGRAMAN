import java.util.Scanner;
class StringFormat
{
  public static void main(String[] args)
  {
    String kata = "Java Is Fun";
    char words[] = new char[kata.length()];
    String kata2 = "";
    for(int i = 0; i < kata.length(); i++)
    {
      // ubah ke huruf kecil
      words[i] = kata.charAt(i);
      int cast = words[i] >= 'A' && words[i] <= 'z' ? (int)words[i] + 32:(int)words[i];
      words[i] = (char)cast;
      kata2 += words[i];
    }
    System.out.println(kata2);
  }
}
