import java.util.Scanner ;
class TPraktikumkelipatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        boolean kelipatan = ((a%b == 0 || b%a == 0) && a !=0 && b !=0);

        System.out.println("Apakah " + a + " kelipatan dari " + b + "?" + " " + kelipatan);
    }
}