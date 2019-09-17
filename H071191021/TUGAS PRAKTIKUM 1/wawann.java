import java.util.Scanner;
class wawann {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kecepatan = sc.nextInt();
        int waktu = sc.nextInt();
        double bensin = kecepatan*waktu/14;
        System.out.printf("Efisiensi adalah %.3f L\n", bensin); 
    }
}