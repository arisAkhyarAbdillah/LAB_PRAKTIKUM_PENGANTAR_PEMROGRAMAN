import java.util.Scanner;
class mencariFPB{
    public static void main(String[] args) {
        Scanner nama = new Scanner (System.in);
        int bilangan1 = nama.nextInt();
        int bilangan2 = nama.nextInt();

        do{
            int save = bilangan2;
            bilangan2 = bilangan1%bilangan2;
            bilangan1 = save;

        }while (bilangan2 != 0);
        int result = bilangan1;
        System.out.println(result);
        
    }
}