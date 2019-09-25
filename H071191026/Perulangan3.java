import java.util.Scanner;
class Perulangan3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;
        int x = sc.nextInt();
        System.out.print(a + " " + b + " ");

        for(int i=0; i<x-2; i++){
            System.out.print((a + b)+" ");
            d = a;
            a = b;
            b = d + b; 
        }
        System.out.println();
    }

}