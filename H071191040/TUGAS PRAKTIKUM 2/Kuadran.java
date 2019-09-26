import java.util.Scanner;
class Kuadran
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int x = key.nextInt();
    int y = key.nextInt();
    if(x != 0 && y != 0)
    {
      if(x > 0 && y > 0)
      {
        if(x > y)
        {
          System.out.printf("%d dan %d di kuadran 4%n",x,y);
        }
        else if(x < y)
        {
          System.out.printf("%d dan %d di kuadran 3%n",x,y);
        }
        else
        {
            System.out.printf("%d dan %d berada di antara kuadran 3 dan 4",x,y);
        }
      }
      else if(x < 0 && y > 0)
      {
        if (Math.abs(x) > y)
        {
          System.out.printf("%d dan %d di kuadran 1%n",x,y);
        }
        else if(Math.abs(x) < y)
        {
          System.out.printf("%d dan %d di kuadran 2%n",x,y);
        }
        else
        {
          System.out.printf("%d dan %d berada diantara kuadran 1 dan 2",x,y);
        }
      }
      else if(x < 0 && x < 0)
      {
        if(Math.abs(x) > Math.abs(y))
        {
          System.out.printf("%d dan %d di kuadran 8%n",x,y);
        }
        else if(Math.abs(x) < Math.abs(y))
        {
          System.out.printf("%d dan %d di kuadran 7%n",x,y);
        }
        else
        {
          System.out.printf("%d dan %d berada diantara kuadran 8 dan 7",x,y);
        }
      }
      else if(x > 0 && y < 0)
      {
        if(x > Math.abs(y))
        {
          System.out.printf("%d dan %d di kuadran 5%n",x,y);
        }
        else if(x < Math.abs(y))
        {
          System.out.printf("%d dan %d di kuadran 6%n",x,y);
        }
        else
        {
          System.out.printf("%d dan %d berada diantara kuadran 5 dan 6",x,y);
        }
      }
    }
    else if(x == 0 && y != 0)
    {
      System.out.printf("%d dan %d berada di garis y",x,y);
    }
    else if(x != 0 && y == 0)
    {
      System.out.printf("%d dan %d berada di garis x",x,y);
    }
    else
    {
      System.out.printf("berada di titik pusat");
    }

  }
}
