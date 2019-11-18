import java.util.*;

class GetRank
{
  public static void main(String[] args) 
  {
      Scanner read = new Scanner(System.in);
      int n = read.nextInt();
      double first = 100, second = 100;
      String mhs[] = new String[n];
      double score[] = new double[n];

      for(int i = 0; i < n; i++)
      {
      	  mhs[i] = read.next();
      	  score[i] = read.nextDouble();
      }

      for(int i = 0; i < n; i++)
      {
          if(score[i] < first)
          {
          		second = first;
          		first = score[i];
          }
          else if(score[i] < second && score[i] != first)
          {
          		second = score[i];
          }
      }

      for(int i = 0; i < n; i++)
      {
      	  if(score[i] == second) System.out.println(mhs[i]);
      }

  }

}