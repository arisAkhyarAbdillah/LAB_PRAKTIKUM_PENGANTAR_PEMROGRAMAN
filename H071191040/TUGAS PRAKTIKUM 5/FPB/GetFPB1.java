import java.util.*;
class GetFPB1
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int a[] = new int[5];
    for(int i = 0; i < 5; i++)
    {
      a[i] = read.nextInt();
    }
    System.out.println(getFPB(a));
  }

  static int getFPB(int a, int b, int c)
  {
    int least = a < b && a < c ? a: b < a && b < c ? b:c;
    for(int i = least; i > 1; i--)
    {
      if(a % i == 0 && b % i == 0 && c % i == 0)
      {
        return i;
      }
    }
    return 1;
  }

  static int getLeast(int a[])
  {
    int least = Integer.MAX_VALUE;
    for(int i = 0; i < a.length; i++)
    {
      least = a[i] < least ? a[i]:least;
    }
    return least;
  }

  static int getFPB(int a[])
  {
    int least =  getLeast(a);
    boolean greatestDivisor = false;
    for(int i = least ; i > 1; i--)
    {
      for(int j = 0; j < a.length; j++)
      {
        if(a[j] % i == 0)
        {
          greatestDivisor = true;
        }
        else
        {
          greatestDivisor = false;
          break;
        }
      }
      if(greatestDivisor)
      {
        return i;
      }
    }
    return 1;
  }
}
