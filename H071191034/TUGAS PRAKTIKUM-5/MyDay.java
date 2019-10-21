import java.util.Scanner;
class MyDay{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        myDay (day);
    }
    public static void myDay(int day) {
        System.out.println(tahun(day)+" tahun");
        System.out.println(bulan(day)+" bulan");
        System.out.println(hari(day)+ " hari");
    }

    public static int tahun(int day) {
        int tahun = day/365;
        return tahun;
    }

    public static int bulan(int day) {
        int bulan = (day%365)/30;
        return bulan;
    }

    public static int hari(int day) {
        int hari = (day%365)%30;
        return hari;
        
    }
}