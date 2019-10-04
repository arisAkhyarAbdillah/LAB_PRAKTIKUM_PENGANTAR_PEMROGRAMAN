import java.util.Scanner;
class praktikum4{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int harga = pew.nextInt();
        int nilai = pew.nextInt();
        int kembalian;
        kembalian = nilai - harga;

        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;

        if(harga > nilai){
            System.out.println("uang kurang = " + (nilai - harga));
        }else if( harga <= nilai){
            while (kembalian >= 100000){
                kembalian -= 100000;
                a++;
            }
            while (kembalian >= 50000){
                kembalian -=50000;
                b++;
            }while(kembalian >=20000){
                kembalian -=20000;
                c++;
            }while (kembalian >= 10000){
                kembalian -= 10000;
                d++;
            }while (kembalian >= 5000){
                kembalian -=5000;
                e++;
            }while (kembalian >= 2000){
                kembalian -= 2000;
                f++;
            }while (kembalian >= 1000){
                kembalian -= 1000;
                g++;
            }
        }System.out.println("uang Rp. 100.000 =" + a);
        System.out.println("uang Rp. 50.000 =" + b);
        System.out.println("uang Rp 20.000 = " + c);
        System.out.println("uang Rp. 10.000 = " + d);
        System.out.println("uang Rp. 5.000 = " + e);
        System.out.println("uang Rp.2.000 = " + f);
        System.out.println("uang Rp. 1.000 = " + g);
        
        
    }
}