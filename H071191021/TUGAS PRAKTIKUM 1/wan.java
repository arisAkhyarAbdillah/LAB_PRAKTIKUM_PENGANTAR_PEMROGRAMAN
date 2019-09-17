import java.util.Scanner;
public class wan {
    public static void main(String[] args) {
        Scanner lab = new Scanner(System.in);
        int detik = lab.nextInt();
        int jam = detik/3600;
        detik = detik%3600;
        int menit = detik/60;
        detik = detik%60;
        int detik1 = detik/1;
        System.out.printf("%02d : %02d : %02d", jam,menit,detik1);
    }
}