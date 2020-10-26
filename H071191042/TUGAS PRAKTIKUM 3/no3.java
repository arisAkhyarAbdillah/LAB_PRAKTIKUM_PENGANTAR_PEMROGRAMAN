/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    //detik= ((24*3600)/360);
    //1 derajat=240 detik
    
    //1 derajat = 4 menit   

         
        while (true)
        {
            float derajat = sc.nextFloat();
            if(derajat < 360 && derajat >= 0)
            {

                float start = 6 * 3600; // konversi start point ke detik
                start = start + (derajat*24*3600)/360;
                float jam = start/3600;
                start = start%3600;
                float menit = start/60;
                start = start%60;
                float detik = start;
                int hour = (int)jam;
                int minute = (int) menit;
                int second = (int) detik;
                
                if(derajat >= 0 && derajat < 90){
                    System.out.println("selamat pagi");
                }else if(derajat >= 90 && derajat < 180){
                    System.out.println("selamat siang");
                }else if (derajat >= 180 && derajat <= 270){
                    System.out.println("selamat malam");
                }
                System.out.printf("%02d:%02d:%02d",hour, minute, second);

            }else{
                derajat = derajat % 360;
                float start = 6 * 3600; // konversi start point ke detik
                start = start + (derajat*24*3600)/360;
                float jam = start/3600;
                start = start%3600;
                float menit = start/60;
                start = start%60;
                float detik = start;
                int hour = (int)jam;
                int minute = (int) menit;
                int second = (int) detik;
                
                if(derajat >= 0 && derajat < 90){
                    System.out.println("selamat pagi");
                }else if(derajat >= 90 && derajat < 180){
                    System.out.println("selamat siang");
                }else if (derajat >= 180 && derajat <= 270){
                    System.out.println("selamat malam");
                }
                System.out.printf("%02d:%02d:%02d",hour, minute, second);
            }
        }

    }
}
