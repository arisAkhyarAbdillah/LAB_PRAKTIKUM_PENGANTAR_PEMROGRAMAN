import java.util.Scanner;
class TPraktikum3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float h = sc.nextFloat();
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    
        double sudut = Math.tan(Math.toRadians(a));
        double alas = sudut*h;
        double sudut2 = Math.tan(Math.toRadians(b));
        double alas2 = sudut2*h;
        double panjang = alas-alas2;

    System.out.printf("Panjang Kapal = %.1f m",panjang);
    }
}