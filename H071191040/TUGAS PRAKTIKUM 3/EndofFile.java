import java.util.Scanner;
class EndofFile
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);

      while(true)
      {
        float M = key.nextFloat();
        if(M >= 0 && M < 360) // [0,360) 0 <= M , 360
        {
          double rand = 6 * 3600; // starting point nya jam 6 dikonversi ke detik = 21600 pada 0 derajat
          rand =  rand + (M*24*3600)/360; // jam 6 ditambah dengan hasil konversi derajat ke jam dalam satuan detik
          double hour = rand / 3600; // variabel hour dibulatkan ke bawah karena masih dalam tipe data double
          rand = rand % 3600;
          double minute = rand / 60; // variabel minute dibulatkan ke bawah karena masih
          rand = rand % 60;
          double sec = rand;
          int h = (int)hour; // konversi floating point data type menjadi integer secara paksa
          int m = (int)minute;
          int s = (int)sec;
          if(hour >= 12 && hour <= 17)
          {
            System.out.println("selamat siang");
          }
          else if(hour >= 18 && hour <= 24 || hour >= 0 && hour <= 5 && minute <= 59)
          {
            System.out.println("selamat malam");
          }
          else if(hour >= 6 && hour <= 11)
          {
            System.out.println("selamat pagi");
          }
          System.out.printf("%02d:%02d:%02d",h,m,s);
        }
        System.out.println("");

    }
  }
}
