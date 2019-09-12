import java.util.Scanner;
class kapal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h = sc.nextFloat();
        float a = sc.nextFloat();
        float b = sc.nextFloat();
         
       // h = sudut ketinggian menara 
       // a = sudut evaluasi terhadap ujung depan kapal
       // b = sudut evaluasi terhadap ujung belakang kapal

       System.out.println("h = "+ h);
       System.out.println("a = "+ a);
       System.out.println("b = "+ b);

       double sudut = Math.tan(Math.toRadians(a));
       double alas = sudut*h;
       double sudut2 = Math.tan(Math.toRadians(b));
       double alas2 = sudut2*h;
       double panjang = alas-alas2;

       System.out.printf("panjang kapal = %.2f m", panjang);

    }
}