import java.util.*;
class OpenPage
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int currentPage = read.nextInt();
    int nextPage = read.nextInt();
    int front = 0, back = 0, current = 0;

    for(int i = 0; i <= nextPage;)
    {
      if(i == 0)
      {
        i++;
        front++;
      }
      else
      {
        i += 2;
        front++;
      }
    }

    for(int i = 101; i >= nextPage;)
    {
      if(i == 101)
      {
        i--;
        back++;
      }
      else
      {
        i -= 2;
        back++;
      }
    }

    if(currentPage < nextPage)
    {
      for(int i = currentPage; i < nextPage; i+=2)
      {
        current++;
      }
    }
    else if(currentPage > nextPage)
    {
      for(int i = currentPage; i > nextPage; i-=2)
      {
          current++;
      }
    }
    System.out.println(front < back && front < current ? front:back < front && back < current ? back:current);
  }
}
