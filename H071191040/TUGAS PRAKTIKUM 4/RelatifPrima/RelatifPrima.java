import java.util.Scanner;
class RelatifPrima{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int length = sc.nextInt();
    int[] array = new int[length];

    for (int i = 0; i < length; i++){
      array[i] = sc.nextInt();
    }

    int i, j, n = length-1;
    for ( i = 0; i < array.length; i++){
      j = 1;
      j += i;
      for ( int a = 0; a < n; a++ ){
        if ( array[i] % array[j] != 0 && array[j] % array[i] != 0){
          System.out.println(array[i] + " " + array[j]);
        }
        j++;
      }
      n--;
    }
  }
}
