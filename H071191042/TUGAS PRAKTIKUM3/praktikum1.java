import java.util.Scanner;
class praktikum1{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int x = pew.nextInt();
        int y = pew.nextInt();
        for (int i = x; i<=y;i++){
            if( i %2==0 && i<0){
                System.out.println(i + " negatif genap");   
            }else if (i%2== -1 && i<0){
                System.out.println(i + " negatif ganjil");
            }else if (i==0){
                System.out.println(i + " nol");
            }else if (i%2==0 && i >0){
                System.out.println(i + " positif genap");
            }else if (i %2==1 && i>0){
                System.out.println(i + " positif ganjil");
            }
        }
        for (int i = y; i<=x;i++){
            if( i %2==0 && i<0){
                System.out.println(i + " negatif genap");   
            }else if (i%2== -1 && i<0){
                System.out.println(i + " negatif ganjil");
            }else if (i==0){
                System.out.println(i + " nol");
            }else if (i%2==0 && i >0){
                System.out.println(i + " positif genap");
            }else if (i %2==1 && i>0){
                System.out.println(i + " positif ganjil");
            }
        }
    }
}