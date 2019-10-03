import java.util.Scanner;
class Tugas002{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("input nilai x : ");
    int x = scan.nextInt();
    System.out.print("input nilai y : ");
    int y = scan.nextInt();
    scan.close();

    if(x>y){
      System.out.print("inputan salah");
    }else if(x<y){
      for(int i=1; i<=y; i++){
        String s = i % x == 0? "\n" : " ";
        System.out.printf("%d%s",i, s);
      }
    }
  }
}
