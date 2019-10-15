import java.util.Scanner;
class DeretBilanganPrima
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int p = key.nextInt();
    int count = 0;
    boolean prima = true;
      for(int i = 2 ;  ; i++)
      {
        for(int j = 2 ; j <= Math.sqrt(i) ; j++)
        {
          if(i % j == 0)
          {
            prima= false;
          }
        }
        if(prima == true || i == 2)
        {
          count++;
          System.out.printf("%d ",i);
        }
        prima = true;
        if(count == p)
        {
          break;
        }

      }
  }
}
