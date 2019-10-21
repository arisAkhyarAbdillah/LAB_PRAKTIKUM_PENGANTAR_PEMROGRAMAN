import java.util.Scanner;
import java.util.Random;
class PotonganProgram {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String serialNumber = generateSerial(n,m);
        System.out.println(serialNumber);
    }

    public static String generateSerial(int n, int m) {
        String str = "";
        Random no = new Random();
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                int a = no.nextInt(10);
                str += a;
            }
            if (i<(n-1)){
                str += "-";
            }
        }
        return str;


    }
}