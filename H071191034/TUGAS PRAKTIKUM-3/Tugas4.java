import java.util.Scanner;
class Tugas4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaBarang = sc.nextInt();
        int uangBayar = sc.nextInt();
        int kembalian = uangBayar-hargaBarang;
        
            //Seratus Ribu
            int a=0;
            //Lima Puluh Ribu
            int b=0;
            //Dua Puluh Ribu
            int c=0;
            //Sepuluh Ribu
            int d=0;
            //Lima Ribu
            int e=0;
            //Dua Ribu
            int f=0;
            //Seribu
            int g=0;

        if (hargaBarang>uangBayar){
            System.out.println("Uang anda kurang " + (hargaBarang-uangBayar));
        } else {
        while(kembalian!=0 && kembalian >= 1000){
            if(kembalian%100000 != kembalian){
                a++;
                kembalian=kembalian-100000;
            }else if(kembalian%50000!= kembalian){
                b++;
                kembalian=kembalian-50000;
            }else if(kembalian%20000!= kembalian){
                c++;
                kembalian=kembalian-20000;
            }else if(kembalian%10000!= kembalian){
                d++;
                kembalian=kembalian-10000;
            }else if(kembalian%5000!= kembalian){
                e++;
                kembalian=kembalian-5000;
            }else if(kembalian%2000!= kembalian){
                f++;
                kembalian=kembalian-2000;
            }else if(kembalian%1000!= kembalian){
                g++;
                kembalian=kembalian-1000;
            }
        }
        System.out.printf("%d uang Rp100.000", a);
        System.out.printf("\n%d uang Rp50.000", b);
        System.out.printf("\n%d uang Rp20.000", c);
        System.out.printf("\n%d uang Rp10.000", d);
        System.out.printf("\n%d uang Rp5.000", e);
        System.out.printf("\n%d uang Rp2.000", f);
        System.out.printf("\n%d uang Rp1.000", g);
        }
    }
}