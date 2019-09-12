import java.util.Scanner;
class Praktikum2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int detik = sc.nextInt();
        int jam = detik/3600;
        int menit = (detik%3600)/60;
        int detikk = ((detik%3600)%60)/1;

        System.out.print(jam + "." + menit + "." + detikk);
    } 
}