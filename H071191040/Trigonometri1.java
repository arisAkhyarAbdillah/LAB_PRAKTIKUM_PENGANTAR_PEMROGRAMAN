import java.util.Scanner;
class Trigonometri1
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int h = key.nextInt();
    int a = key.nextInt();
    int b = key.nextInt();

    double hasil = h*(Math.tan(Math.toRadians(a)) - (Math.tan(Math.toRadians(b))));

    System.out.printf("%.2f",hasil);
  }
}
