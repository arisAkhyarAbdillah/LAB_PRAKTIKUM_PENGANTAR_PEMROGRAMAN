import java.util.Scanner;
class TpraktikumBBideal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama = sc.next();
        double tinggi = sc.nextDouble();
        double berat = sc.nextDouble();
        double presentasi = sc.nextDouble();
        
            double bbideal = (tinggi-100)-((tinggi-100)*(presentasi/100));
            double target = bbideal - berat;

        System.out.println("Informasi");
        System.out.println("Nama : " + nama);
        System.out.println("Tinggi Badan : " + tinggi + "cm");
        System.out.println("Berat Badan : " + berat + "kg");
        System.out.println("Berat Badan Ideal Anda : " + bbideal + "kg" );
        System.out.printf("Target Berat Badan Ideal Anda : %.1f kg", target);
    }
}