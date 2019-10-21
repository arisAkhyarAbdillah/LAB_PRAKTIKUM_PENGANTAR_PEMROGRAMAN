import java.util.Scanner;
class Perulangan4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaBarang = sc.nextInt();
        int uangYangdibayar = sc.nextInt();
        int kembalian = uangYangdibayar - hargaBarang;
        int a = 0; 
        int b = 0;
        int c = 0;
        int d = 0; 
        int e = 0;
        int f = 0;
        int g = 0;
        
        while(kembalian>=1000){
            if(kembalian%100000==0){
                a++;
                kembalian = kembalian - 100000;
            } else if (kembalian%50000==0){
                b++;
                kembalian = kembalian - 50000;
            } else if (kembalian%20000==0){
                c++;
                kembalian = kembalian - 20000;
            } else if (kembalian%10000==0){
                d++;
                kembalian = kembalian - 10000;
            } else if (kembalian%5000==0){
                e++;
                kembalian = kembalian - 5000;
            } else if (kembalian%2000==0){
                f++;
                kembalian = kembalian - 2000;
            } else if (kembalian%1000==0){
                g++;
                kembalian = kembalian - 1000;

            }

        }
        System.out.println(a + " uang Rp. 100.000 ");
        System.out.println(b + " uang Rp. 50.000 ");
        System.out.println(c + " uang Rp. 20.000 ");
        System.out.println(d + " uang Rp. 10.000 ");
        System.out.println(e + " uang Rp. 5.000 ");
        System.out.println(f + " uang Rp. 2.000 ");
        System.out.println(g + " uang Rp. 1.000 ");

    }
}