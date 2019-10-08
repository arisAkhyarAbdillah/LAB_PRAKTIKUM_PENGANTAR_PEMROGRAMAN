import java.util.Scanner;

class Tugas007{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("input nilai : ");
    int N = input.nextInt();
    input.close();
    int hasil = 1;
    for(int i=N; i>=1; i--){
      System.out.printf("%d%s", i, i==1 ? " = ":"*");
      hasil = hasil *i;
    }
    System.out.print(hasil);
  }
}
