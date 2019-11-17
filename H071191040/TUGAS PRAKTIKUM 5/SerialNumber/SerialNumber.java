import java.util.Random;
import java.util.Scanner;

class SerialNumber
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int a = read.nextInt();
    int b = read.nextInt();
    System.out.println(generateSerial(a,b));
  }
  public static String generateSerial(int a, int b)
  {
    Random rand = new Random();
    String serial = "";
    for(int i = 1; i <= a; i++)
    {
      for(int j = 0; j < b; j++)
      {
        serial += rand.nextInt(9);
      }
      serial += i < a ? "-":"";
    }
    return serial;
  }
}
