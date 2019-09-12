import java.util.Scanner;
class tugaslembaranuang{
    public static void main(String[] args) {
        Scanner bew = new Scanner(System.in);
        System.out.println("masukkan uang");
        int uang = Math.max(bew.nextInt(), 0);
        
        
        int uang1 = uang / 100000;
        int sisa1 = uang % 100000;
        System.out.println("jumlah uang 100000 = " + uang1);
        
        int uang2 = sisa1 / 50000;
        int sisa2 = sisa1 % 50000;
        System.out.println("jumlah uang 50.000 = " + uang2);
        
        int uang3 = sisa2 / 20000;
        int sisa3 = sisa2 % 20000;
        System.out.println("jumlah uang 20.000 = " + uang3);
        
        int uang4 = sisa3 / 10000;
        int sisa4 = sisa3 % 10000;
        System.out.println("jumlah uang 10.000 = " + uang4);
        
        int uang5 = sisa4 / 5000;
        int sisa5 = sisa4 % 5000;
        System.out.println("jumlah uang 5.000 = " + uang5);
        
        int uang6 = sisa5 / 2000;
        int sisa6 = sisa5 % 2000;
        System.out.println("jumlah uang 2.000 =" + uang6);
        
        int uang7 = sisa6 / 1000;
        int sisa7 = sisa6 % 1000;
        System.out.println("jumlah uang 1.000 =" + uang7);


        


    }



}