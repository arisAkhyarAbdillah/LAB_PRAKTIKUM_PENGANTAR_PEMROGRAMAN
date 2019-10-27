import java.util.Scanner;
class Tugas02Final
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    System.out.println("\t\tinput orde");
    System.out.print("input p :");
    int p = read.nextInt();
    System.out.print("input q :");
    int q = read.nextInt();
    System.out.print("input r :");
    int r = read.nextInt();
    System.out.print("input s :");
    int s = read.nextInt();
    int matriksA[][] = new int[p][q];
    int matriksB[][] = new int[r][s];
    int matriksHasil[][] = new int[p][s];
    int matriksHasil2[][] = new int[r][q];

      // input elemen matriks A
      for(int i = 0; i < p; i++)
      {
        for(int j = 0; j < q; j++)
        {
          System.out.printf("A[%d,%d] = ",i,j);
          matriksA[i][j] = read.nextInt();
        }
      }
      System.out.println();
      // input elemen matriks B
      for(int i = 0; i < r; i++)
      {
        for(int j = 0; j < s; j++)
        {
          System.out.printf("B[%d,%d] = ",i,j);
          matriksB[i][j] = read.nextInt();
        }
      }
      if(q != r)
      {
        System.out.println("tidak bisa dilakukan perkalian AB");
      }
      else
      {
        System.out.println("Matriks AB\n");
        // AB
        for(int i = 0; i < p; i++)
        {
          for(int j = 0; j < s; j++)
          {
            for(int k = 0; k < q; k++)
            {
              matriksHasil[i][j] += matriksA[i][k] * matriksB[k][j];
            }
            System.out.print(matriksHasil[i][j]+ " ");
          }
          System.out.println();
        }
      }
      if(s != p)
      {
        System.out.println("tidak bisa dilakukan perkalian BA");
      }
      else
      {
        // BA
        System.out.println("\nMatriks BA\n");
        for(int i = 0; i < r; i++)
        {
          for(int j = 0; j < q; j++)
          {
            for(int k = 0; k < p; k++)
            {
              matriksHasil2[i][j] += matriksB[i][k] * matriksA[k][j];
            }
            System.out.print(matriksHasil2[i][j]+ " ");
          }
          System.out.println();
        }
      }
  }
}
