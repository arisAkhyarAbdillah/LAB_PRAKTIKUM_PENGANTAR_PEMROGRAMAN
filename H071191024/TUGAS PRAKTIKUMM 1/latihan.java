import java.util.Scanner;
class latihan{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan detik");
        int detik = sc.nextInt();
        int jam = detik/3600;
        detik = detik-(3600*jam);
        int menit = detik/60;
        detik = detik-(60*menit);


        
        

        System.out.printf("%02d: %02d: %02d", jam , menit, detik );


        
        
    }
}