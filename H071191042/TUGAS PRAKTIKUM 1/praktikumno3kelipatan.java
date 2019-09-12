import java.util.Scanner;
class praktikumno3kelipatan{
    public static void main(String[] args) {
       Scanner p = new Scanner(System.in);
        System.out.println("masukkan a ");
        int a = p.nextInt();
        System.out.println("masukkan b ");
        int b = p.nextInt();
        boolean kelipatan = ((a%b == 0 || b%a == 0) &&  a !=0 && b !=0);

        System.out.println("apakah " + a + " kelipatan dari " + b + kelipatan);


    }


}