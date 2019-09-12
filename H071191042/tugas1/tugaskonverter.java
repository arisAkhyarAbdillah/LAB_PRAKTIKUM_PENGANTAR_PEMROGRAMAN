import java.util.Scanner;
class tugaskonverter{
    public static void main(String[] args) {
        Scanner ehem = new Scanner(System.in);
        System.out.println("masukkan detik");
        int detik = ehem.nextInt();
        int menit;
        int jam;
        int jam1;
        int menit1;
        int detik1;
       
        jam = (detik / 3600);
        jam1 =  (detik % 3600);
        menit = (jam1 / 60);
        menit1 = (menit % 60);
        detik = ( detik % 3600);
        detik1 = (detik % 60);

        System.out.printf("%02d:%02d:%02d",jam,menit,detik);
        
        


    }



}