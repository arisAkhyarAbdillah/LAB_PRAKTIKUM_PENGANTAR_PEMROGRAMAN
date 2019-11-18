import java.util.Scanner;
public class Latihan2 {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Baris Matriks A");
        int p = sc.nextInt();
        System.out.println("Input Kolom Matriks A");
        int q = sc.nextInt();
        System.out.println("Input Baris Matriks B");
        int r = sc.nextInt();
        System.out.println("Input Kolom Matriks B");
        int s = sc.nextInt();
        int [][] A = new int[p][q];
        int [][] B = new int[r][s];
        int [][] C1 = new int [p][s];
        int [][] C2 = new int [r][q];
        
        if(q!=r){
            System.out.println("Kedua matriks ini tidak bisa dikalikan");
            return;
        }
        
        System.out.println("Masukkan matriks A");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Masukkan Matriks B");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Pilih perkalian yang diinginkan : \n"  + "1. A x B \n2. B x A"  );
        System.out.println();
        int pilih = sc.nextInt();
        if (pilih==1){
            for (int i = 0; i < p; i++) {
                 for (int j = 0; j < s; j++) {
                     for (int k = 0; k < q; k++) {
                         C1[i][j] += A[i][k] * B[k][j];
                     }
                }
            }

             System.out.println("Hasil :");
        
            for (int i = 0; i < C1.length; i++) {
                for (int j = 0; j < C1[i].length; j++) {
                        System.out.print(C1[i][j] + " ");
                
                }
                System.out.println();
            }
        }

        else if (pilih==2){
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < q; j++) {
                    for (int k = 0; k < s; k++) {
                        C2[i][j] += B[i][k] * A[k][j];
                    }
                }
            }

           System.out.println("Hasil :");
        
           for (int i = 0; i < C2.length; i++) {
               for (int j = 0; j < C2[i].length; j++) {
                       System.out.print(C2[i][j] + " ");
               
                }
                  System.out.println();
            }
        }
        
    }
     
}