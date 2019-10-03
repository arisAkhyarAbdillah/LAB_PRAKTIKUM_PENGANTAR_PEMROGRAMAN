import java.util.Scanner;
class Tugas006{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("input nilai : ");
    int N = input.nextInt();
    boolean prima;
    input.close();

    for(int i=2; i<=N; i++){
      prima=true;
      for(int j=2; j<i; j++){
        if(i%j==0){
          prima=false;
          break;
        }
      }
        if(prima==true){
          System.out.print(i+" ");
        }
    }
  }
}
