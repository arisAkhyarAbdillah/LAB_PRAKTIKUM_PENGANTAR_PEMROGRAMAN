import java.util.Scanner;
class Tugas02Final {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        // Matriks A
        System.out.println("Masukkan ukuran matriks A:");
        int barisA = ui.nextInt();
        int kolomA = ui.nextInt();
        int matriksA [][] = new int [barisA][kolomA];

        System.out.println("Input matriks A :");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                matriksA[i][j] = ui.nextInt();
                
            }
        }
        // Matriks B
        System.out.println("\nMasukkan ukuran matriks B:");
        int barisB = ui.nextInt();
        int kolomB = ui.nextInt();
        int matriksB [][] = new int [barisB][kolomB];

        System.out.println("Input matriks B :");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                matriksB[i][j] = ui.nextInt();
                
            }
        }


// -------------------------------------------------------------------------------------------------------------------

        // Perkalian Matriks AB
        if (barisA == kolomB){
            System.out.println("\nHasil kali matriks A*B : ");
                int[][] hasil = new int[barisA][kolomB];
                for (int i = 0; i < barisA; i++) {
                    for (int j = 0; j < kolomB; j++) {
                        int x = 0;
                        for (int k = 0; k < barisB; k++) {
                            x += matriksA[i][k] * matriksB[k][j];
                        }
                        hasil[i][j] = x;
                    }
                }
            for (int i = 0; i < barisA; i++) {
                for (int j = 0; j < kolomB; j++) {
                    System.out.print(hasil[i][j] + " ");
                }   
            System.out.println();
            }
        
        } else if (barisB == kolomA){
            System.out.println("\nHasil kali matriks B*A");
            int hasil2 [][] = new int [barisB][kolomA];
            for (int i = 0; i < barisB; i++) {
                for (int j = 0; j < kolomA; j++) {
                    int x = 0;
                    for (int k = 0; k < barisA; k++) {
                        x += matriksB[i][k]*matriksA[k][j];
                        
                    }
                    hasil2[i][j] = x;
                } 
            }

            for (int i = 0; i < barisB; i++) {
                for (int j = 0; j < kolomA; j++) {
                    System.out.print(hasil2[i][j]+" ");
                    
                }
                System.out.println();
                
            } 

            } else {
                
            System.out.println("\nPerkalian matriks tidak bisa terjadi karena jumlah baris matriks awal tidak sama dengan jumlah kolom matriks kedua");

        
        }
    }
}