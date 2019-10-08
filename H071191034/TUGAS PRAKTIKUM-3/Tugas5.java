import java.util.Scanner;
class Tugas5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float derajat = sc.nextFloat();
        // ((24*3600)/360)=240
        //1 derajat = 240 detik
        // int detik = 240;
            while (true){
                if (derajat >=0 && derajat <=360){
                    double pukul = 6*3600;
                    pukul = pukul + (derajat*240);
                    double jam = pukul/3600;
                    pukul = pukul%3600;
                    double menit = pukul/60;
                    pukul = pukul%60;
                    double detik = pukul;
                    int hour = (int)jam;
                    int minute = (int) menit;
                    int second = (int) detik;

                        if(hour >=12 && hour < 15){
                                System.out.println("Selamat Siang");
                            }else if(hour >=15 && hour <18){
                                System.out.println("Selamat Sore");
                            }else if(hour >= 18 && hour <=24){
                                System.out.println("Selamat Malam");
                            }else{
                                System.out.println("Selamat Pagi");
                            }
        // //}
            System.out.printf("%02d:%02d:%02d", hour, minute, second);
            System.out.printf(" ");                    
                }break;
            }
    }
}