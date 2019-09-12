import java.util.Scanner;
class bensin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    double jam = sc.nextInt();
    double kecepatan= sc.nextInt();
    double  evesiensi=14;
    double  bensin =jam*kecepatan/evesiensi;

        System.out.printf("bensin yang di gunakan = %.3f L", bensin);
    }

    
}