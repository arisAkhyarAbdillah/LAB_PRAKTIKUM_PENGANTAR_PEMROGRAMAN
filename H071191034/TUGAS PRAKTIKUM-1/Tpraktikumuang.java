import java.util.Scanner;
class Tpraktikumuang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uang = Math.max(sc.nextInt(), 0);

            int U1 = 100000;
            int U2 = 50000;
            int U3 = 20000;
            int U4 = 10000;
            int U5 = 5000;
            int U6 = 2000;
            int U7 = 1000;

            int uang1 = uang/U1;
            int sisa1 = uang%U1;

            int uang2 = sisa1/U2;
            int sisa2 = sisa1%U2;

            int uang3 = sisa2/U3;
            int sisa3 = sisa2%U3;

            int uang4 = sisa3/U4;
            int sisa4 = sisa3%U4;

            int uang5 = sisa4/U5;
            int sisa5 = sisa4%U5;

            int uang6 = sisa5/U6;
            int sisa6 = sisa5%U6;

            int uang7 = sisa6/U7;

        System.out.println( "Jumlah Uang 100000 : "+ uang1 );
        System.out.println( "Jumlah Uang 50000 : "+ uang2 );
        System.out.println( "Jumlah Uang 20000 : "+ uang3 );
        System.out.println( "Jumlah Uang 10000 : "+ uang4 );
        System.out.println( "Jumlah Uang 5000 : "+ uang5 );
        System.out.println( "Jumlah Uang 2000 : "+ uang6 );
        System.out.println( "Jumlah Uang 1000 : "+ uang7 );
    }
} 