import java.util.Scanner;
class GetFPB
{
  public static void main(String[] args)
    {
      Scanner read = new Scanner(System.in);
      int a = read.nextInt();
      char c = read.nextChar();
      int b = read.nextInt();
      System.out.println(fpb(a,b));
    }
    static int fpb(int a, int b)
    {
      // do
      // {
      //   int mod = b;
      //   b = a % b;
      //   a = mod;
      // } while (b != 0);
      return b != 0 ? fpb(b,a%b):a ;
    }
}
