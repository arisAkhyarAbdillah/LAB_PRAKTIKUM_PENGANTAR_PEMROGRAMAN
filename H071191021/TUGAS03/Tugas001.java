import java.util.Scanner;
class Tugas001{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("input nilai x : ");
    int x = scan.nextInt();
    System.out.print("\ninput nilai y : ");
    int y = scan.nextInt();
    scan.close();

    for(int i=x; i<=y; i++){
      if(i%2==0 && i<0){
        System.out.println(i+" genap negatif");
      }
      else if(i%2==-1 && i<0){
        System.out.println(i+" ganjil negatif");
      }
      else if(i%2==0 && i>0){
        System.out.println(i+" genap positif");
      }
      else if(i%2==1 && i>0){
        System.out.println(i+" ganjil positif");
      }
      else{
        System.out.println(i+" nol");
      }
    }
    for(int i=y; i<=x; i++){
      if(i%2==0 && i<0){
        System.out.println(i+" genap negatif");
      }
      else if(i%2==-1 && i<0){
        System.out.println(i+" ganjil negatif");
      }
      else if(i%2==0 && i>0){
        System.out.println(i+" genap positif");
      }
      else if(i%2==1 && i>0){
        System.out.println(i+" ganjil positif");
      }
      else{
        System.out.println(i+" nol");
      }
    }
  }
}
