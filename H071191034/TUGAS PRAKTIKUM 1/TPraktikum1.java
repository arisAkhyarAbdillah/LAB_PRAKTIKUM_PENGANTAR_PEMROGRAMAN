import java.util.Scanner ;
class TPraktikum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int waktutempuh = sc.nextInt();
        int percepatan = sc.nextInt();
        
        double efisiensi = 14;
        double hasil = (percepatan*waktutempuh)/efisiensi;

        System.out.printf("Bensin yang digunakan = %.3f L", hasil);
    }
}