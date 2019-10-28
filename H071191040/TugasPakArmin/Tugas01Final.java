import java.util.Scanner;
class Tugas01Final
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    int a[] = new int[n];
    double sum = 0;
    double error[] = new double[n];
    for(int i = 0; i < n; i++)
    {
      a[i] = read.nextInt();
      sum += a[i];
    }
    sum /= n;
    for(int i = 0; i < n; i++)
    {
      error[i] = Math.sqrt(Math.pow(sum - a[i], 2));
    }
    System.out.println("---------------------------------");
    System.out.printf("| No| Data\t| Error\t\t|\n");
    System.out.println("---------------------------------");
    for(int i = 0; i < n; i++)
    {
      System.out.printf("| %d|\t%d\t| %.3f\t\t|", a[i], i+1, error[i]);
      System.out.println();
    }
    System.out.println("---------------------------------");
  }
}
