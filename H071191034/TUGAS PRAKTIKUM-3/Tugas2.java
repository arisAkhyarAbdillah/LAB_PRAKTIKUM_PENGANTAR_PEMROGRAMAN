import java.util.Scanner;
class Tugas2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a =0;
        
        for(int i=1; i<=y; i++){
            a++;
            System.out.print(i + " ");
            if (a==x){
                System.out.println();
                a=0;
            }
        }
    }
}