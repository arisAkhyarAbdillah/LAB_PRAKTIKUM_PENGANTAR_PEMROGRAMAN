import java.util.Scanner;
class praktikumliter{
    public static void main(String[] args) {
        Scanner ehem = new Scanner(System.in);
        System.out.println("waktu yang di tempuh");
        int waktu = ehem.nextInt();
        System.out.println("kecepatan rata-rata");
        double kecepatan = ehem.nextDouble();
        double total;
        total = (waktu * kecepatan) /  14;

        System.out.printf("%.3f",total);
        

    }



}