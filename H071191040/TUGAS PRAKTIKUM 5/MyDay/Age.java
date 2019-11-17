import java.util.Scanner;
class Age
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int ageInDay = 0;
    do
    {
      ageInDay = read.nextInt();
      System.out.println(ageInDay < 365 ? "belum satu tahun, input ulang!!!":"");
    } while(ageInDay < 365);
    myDay(ageInDay);
  }

  static void myDay(int a)
  {
    int year = a / 365;
    a %= 365;
    int month = a / 30;
    a %= 30;
    int day = a;
    System.out.println(year + " tahun");
    System.out.println(month + " bulan");
    System.out.println(day + " hari");
  }
}
