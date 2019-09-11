import java.util.Scanner;
class jam
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int detik = key.nextInt();
    int jam = detik/3600;
    int sisa = detik%3600;
    int menit = sisa/60;
    sisa = sisa % 60;
    System.out.printf("%02d:%02d:%02d",jam,menit,sisa);
  }
}
