import java.util.Scanner;
class Modul2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int l = sc.nextInt();
    int matriks1 [][] = new int[n][m];
    int matriks2 [][] = new int[m][l];
    int matriks [][] = new int[n][l];
    for(int i = 0 ; i < n ; i++){
      for(int j = 0 ; j < m ; j++){
        matriks1[i][j] = sc.nextInt();
      }
    }
    for(int i = 0 ; i < m ; i++){
      for(int j = 0 ; j < l ; j++){
        matriks2[i][j] = sc.nextInt();
      }
    }
    // Multiplication
    for(int i = 0, k = 0, x = 0 ; i < n ; i++){
      for(int j = 0 ; j < l ; j++){
        matriks[i][j] = matriks1[i][k] * matriks2[x][j] + matriks1[i][k+1] * matriks2[x+1][j];
      }
    }
    for(int i = 0 ; i < n ; i++){
      for(int j = 0 ; j < l ; j++){
        System.out.print(matriks[i][j] + " ");
      }
      System.out.println();
    }
  }
}