import java.util.Scanner;
public class Tugas005{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float derajat=obj.nextFloat();
        int sekon = Math.round((derajat/360)*(24*3600));
        int jam=0,menit=0;
        while(sekon>=3600){
            jam=jam+1;
            sekon-=60;

            while(sekon>=60){
                menit=menit+1;
                sekon-=60;
                jam = ( jam+6)%24;
                if(jam<12){
                    System.out.println("Selamat pagi");
                    System.out.printf("%02d:%02d:%02d",jam,menit,sekon);

             if(jam<15){
                 System.out.println("Selamat Siang");
                 System.out.printf("%02d:%02d:%02d",jam,menit,sekon);

             }else if(jam<18){
                 System.out.println("Selamat Sore");
                 System.out.printf("%02d:%02d:%02d",jam,menit,sekon);

             }else{
                 System.out.println("Selamat Malam");
                 System.out.printf("%02d:%02d:%02d",jam,menit,sekon);

             }
             }

                     }
                 }

                    }
                
            }
        
    
