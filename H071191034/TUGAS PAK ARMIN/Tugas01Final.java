import java.util.Scanner;
class Tugas01Final {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int arr [] = new int [10];
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            // System.out.println();
            arr [i] = ui.nextInt();
            sum = sum+arr[i];
        }

        System.out.println("_________________________________");
        System.out.println("No \t | Data \t| Error");
        System.out.println("---------------------------------");

        int average = sum / 10;                                                                 //rata-rata data
        double [] error = new double[10];
        for (int i = 0; i < error.length; i++) {
            error[i] = Math.sqrt(Math.pow(average-arr[i],2));                                   //mencari nilai error
            System.out.printf("%d \t | %d \t\t| %.3f \t \n", i+1, arr[i], error[i]);
        }
        System.out.println("---------------------------------");
        
        ui.close();
    }
}