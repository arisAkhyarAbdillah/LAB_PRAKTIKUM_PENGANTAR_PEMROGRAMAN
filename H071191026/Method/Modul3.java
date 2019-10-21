import java.util.Scanner;
class Modul3{
    public static void main(String[] args) {
        Scanner rn = new Scanner(System.in);
        int usia = rn.nextInt();

        myDay(usia);

    }
    public static void myDay(int a) {
        int tahun = a / 365;
        a = a % 365;
        int bulan = a / 30;
        a = a % 30;

        System.out.println(tahun + "tahun");
        System.out.println(bulan + "bulan");
        System.out.println(a + "hari");
    }
}

