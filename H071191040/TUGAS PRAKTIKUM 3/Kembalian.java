import java.util.Scanner;
class Kembalian
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int uang = key.nextInt();
    int harga = key.nextInt();
    int kembalian = uang - harga;
    int seratus = 0;
    int limapuluh = 0;
    int duapuluh = 0;
    int sepuluh = 0;
    int lima = 0;
    int dua = 0;
    int satu = 0;
    boolean cek = true;
    if(uang >= harga)
    {
      while(cek)
      {
        if(kembalian % 100000 != kembalian)
        {
          seratus++;
          kembalian = kembalian % 100000;
        }
        else if(kembalian % 50000 != kembalian)
        {
          limapuluh++;
          kembalian = kembalian % 50000;
        }
        else if(kembalian % 20000 != kembalian)
        {
          duapuluh++;
          kembalian = kembalian % 20000;
        }
        else if(kembalian % 10000 != kembalian)
        {
          sepuluh++;
          kembalian = kembalian % 10000;
        }
        else if(kembalian % 5000 != kembalian)
        {
          lima++;
          kembalian = kembalian % 5000;
        }
        else if(kembalian % 2000 != kembalian)
        {
          dua++;
          kembalian %= 2000;
        }
        else if(kembalian % 1000 != kembalian)
        {
          satu++;
          kembalian %= 1000;
        }
        if(kembalian == 0 || kembalian < 1000)
        {
          cek = false;
        }
      }
      System.out.printf("uang kembalian Rp.100.000 = %d lembar%n",seratus);
      System.out.printf("uang kembalian Rp.50.000 = %d lembar%n",limapuluh);
      System.out.printf("uang kembalian Rp.20.000 = %d lembar%n",duapuluh);
      System.out.printf("uang kembalian Rp.10.000 = %d lembar%n",sepuluh);
      System.out.printf("uang kembalian Rp.5000 = %d lembar%n",lima);
      System.out.printf("uang kembalian Rp.2000 = %d lembar%n",dua);
      System.out.printf("uang kembalian Rp.1000 = %d lembar%n",satu);
    }
    else
    {
      System.out.println("uang anda kurang "+ (-1*(uang - harga)));
    }
  }
}
