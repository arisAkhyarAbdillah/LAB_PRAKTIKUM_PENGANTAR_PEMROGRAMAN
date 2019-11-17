import java.util.Scanner;
class Bensin
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int t = key.nextInt();
    int v = key.nextInt();
    double l = (v*t)/14D;
    System.out.printf("bensin yang digunakan adalah : %.2f L" ,l);
  }
}
