import java.util.Scanner;
class Latihan1{
    public static void main(String[] args) {
        Scanner nn = new Scanner(System.in);

        int a [] = new int [10];
        int jumlah = 0;

        for (int i = 0; i < 10; i++) {
            a[i] = nn.nextInt();
            jumlah += a[i];


        }
        double rata2 = jumlah/10;
        double error [] = new double[10];
        

        
        System.out.println("_________________________________________________");
        System.out.println("\tNo\t|\tData\t|\tEror\t");
        System.out.println("_________________________________________________");
        for (int i = 0; i < 10; i++) {
            error[i] = Math.sqrt(Math.pow(rata2 - a[i], 2));
    
            System.err.printf( "\t%d\t|\t%d\t|\t%.2f\t|\n" ,i+1, a[i],error[i] );

            
        }

    }

}
