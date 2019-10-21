import java.util.Scanner;
public class CariFPB{
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
        // Masukkan Nilai A
        int a=sc.nextInt();
        // Masukkan Nilai B
        int b=sc.nextInt();
        hitung (a,b);
    }
    public static void hitung(int a,int b) {
    System.out.println(fpb(a,b));
    }

    public static int fpb(int a, int b) {
    System.out.print("FPB dari " +a+ " dan " +b+ " = ");
        int c = a%b;
        do {
            a=b;
            b=c;
            c=a%b;
            } while (c != 0);
            return b;
                
    }
}