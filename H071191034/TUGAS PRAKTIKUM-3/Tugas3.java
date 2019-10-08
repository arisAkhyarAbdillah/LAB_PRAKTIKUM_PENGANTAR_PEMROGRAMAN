import java.util.Scanner;
class Tugas3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        int c=0;
        int x=sc.nextInt();
        System.out.print(a+" "+b+" ");

        for(long i=0; i<x; i++){
            System.out.print((a+b)+" ");
            c=a;
            a=b;
            b=c+b;
        }
        System.out.println();
    }
}