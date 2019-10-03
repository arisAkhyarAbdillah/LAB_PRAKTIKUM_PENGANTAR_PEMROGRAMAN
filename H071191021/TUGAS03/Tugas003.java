import java.util.Scanner;
class Tugas003{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("input nilai : ");
    int x = scan.nextInt();
    int a = 0;
    int b = 1;
    int c;
    scan.close();

    for(int i=0; i<x; i++){
      System.out.printf(a+" ");
      c=a+b;
      a=b;
      b=c;
    }
  }
}
