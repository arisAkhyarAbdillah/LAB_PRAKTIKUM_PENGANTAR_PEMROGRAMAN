import java.util.Scanner;
class Tugas1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b<a){
            int c=a;
            a=b;
            b=c;
        }

        for (int i=0; i<=b; i++){
            if (i%2==0 && i>0){
                System.out.println(i+" Genap Positif");
            } else if (i%2==0 && i<0){
                System.out.println(i+" Genap Negatif");
            } else if (i%2==1 && i>0){
                System.out.println(i+" Ganjil Positif");
            } else if (i%2==1 && i<0){
                System.out.println(i+" Ganjil negatif");
            } else {
                System.out.println(i+" Nol");
            }
        }
    }
}