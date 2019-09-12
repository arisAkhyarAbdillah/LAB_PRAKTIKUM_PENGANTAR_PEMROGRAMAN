import java.util.Scanner;
class Praktikum1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //a = waktu yang ditempuh
        //b = kecepatan rata-rata yang ditempuh
        //c = efisiensi penggunaan bensin
        //d = bensin yang digunakan

        System.out.println("waktu");
        int a = sc.nextInt();

        System.out.println("kecepatan");
        int b = sc.nextInt();
        
        float c = 14;
        float d = (a*b)/c;

        System.out.printf("bensin yang digunakan %.3f", d);
       


    }
    
}