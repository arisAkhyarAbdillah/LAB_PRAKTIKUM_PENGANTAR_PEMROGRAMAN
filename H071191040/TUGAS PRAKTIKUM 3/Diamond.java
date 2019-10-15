import java.util.Scanner;
class Diamond
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    int bintang = 1;
    int kosong = 1 + (n-1)*2;
    int empty = n;
    int bintang2 = 1 + (n-1)*2;
    for(int i = n ; i > 0 ; i--)
    {
      for(int j = kosong ; j > 0 ; j--)
      {
        System.out.print("-");
      }
      for(int l = 0 ; l < bintang ; l++)
      {
        System.out.print(".");
      }
      for(int k = 0 ; k < kosong ; k++)
      {
        System.out.print("-");
      }
      bintang +=2;
      kosong --;
      System.out.println("");
    }

    for(int i = n ; i > 0 ; i--)
    {
      for(int j = empty ; j > 0 ; j--)
      {
        System.out.print("-");
      }
      for(int k = bintang2 ; k > 0 ; k-- )
      {
        System.out.print(".");
      }
      for(int k = 0 ; k < kosong ; k++)
      {
        System.out.print("-");
      }
      bintang2 -= 2;
      empty ++;
      System.out.println("");
    }

  }
}
