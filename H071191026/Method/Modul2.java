import java.util.Scanner;
import java.util.Random;

class Modul2{
    public static void main(String[] args) {
        Scanner rm = new Scanner(System.in);
        int n = rm.nextInt();
        int m = rm.nextInt();
        String serialNumber = generateSerial (n,m);
        System.out.println(serialNumber);

    }
    public static String generateSerial (int n, int m) {
        Random angka = new Random();
        String ireneString = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int k = angka.nextInt(10);
                ireneString += k;


                
            }
            if(i<n-1){
                ireneString += '-';
            }
            
        }
        return ireneString;
    }
}