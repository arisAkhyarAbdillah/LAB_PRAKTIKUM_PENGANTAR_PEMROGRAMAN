import java.util.Scanner;
class StringMatriks
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    String kata = null;
    int n = 0;
    do
    {
      kata = read.nextLine();
      n = kata.length();
      System.out.println(n < 16 ? "minimal 16 karakter":"");
    } while(n < 16);
    String baru = "";
    for(int i = 0; i < n; i++)
    {
      if(i % 2 == 0)
      {
        baru += kata.charAt(i);
      }
      else
      {
        baru += Character.codePointAt(kata, i); // mengubah karakter dalam string kata pada indeks ganjil menjadi ascii
      }
    }
    for(int i = 1, j = 0; i <= 16; i++)
    {
      do
      {
        System.out.printf("%c", j < baru.length() ? baru.charAt(j):'?'); // tampilkan karakter dari string baru jika ada, kalo tidak maka tampilkan '?'
        j++; // j sebagai indeks untuk karakter yang akan di tampilkan dari string baru, jika j > karakter string baru maka print '?'
      } while (j % Math.ceil(baru.length()/16f) != 0); // menampilkan untaian sebanyak panjang string baru / 16 dibulatkan ke atas.
      System.out.printf("%c",i % 4 == 0 ? '\n':' '); // print new line jika i habis dibagi 4(karena matriks 4 x 4) jika tidak print blank space
    }
  }
}
