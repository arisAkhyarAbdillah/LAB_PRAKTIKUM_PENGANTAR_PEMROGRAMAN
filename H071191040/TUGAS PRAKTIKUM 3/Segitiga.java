class Segitiga
{
  public static void main(String[] args)
  {

    int bintang = 17;
    int kosong = 1;
    for(int i = 1 ; i <= 9 ; i++)
    {
      for(int j = 0 ; j < bintang ; j++)
      {
        System.out.print(" ");
      }
      for(int j = 0 ; j < kosong ; j++)
      {
        System.out.print("*");
      }
      System.out.println("");
      kosong += 2;
      bintang -=2;
    }
  }
}
