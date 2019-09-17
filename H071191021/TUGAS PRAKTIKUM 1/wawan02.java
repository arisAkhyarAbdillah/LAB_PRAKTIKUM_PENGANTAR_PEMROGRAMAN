import java.util.Scanner;
public class wawan02 {
    public static void main(String[] args) {
        Scanner wawan = new Scanner(System.in);
        int h = wawan.nextInt();
        int a = wawan.nextInt();
        int b = wawan.nextInt();
        double jarak1 = Math.tan(Math.toRadians(a))*h;
        double jarak2 = Math.tan(Math.toRadians(b))*h;
        double jarak = jarak1 - jarak2;
        System.out.printf("panjang kapal = %.1f m\n",jarak);
    }
}