import java.util.Scanner;
class Modus2
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    int data[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      data[i] = read.nextInt();
    }
    int modus = 0;
    int bigNum = data[0];
    for(int i = 0; i < n; i++)
    {
      int counter = 0;
      for(int j = 0; j < n; j++)
      {
        if(data[i] == data[j])
        {
          counter++;
        }
      }
      if(counter > modus)
      {
        bigNum = data[i];
        modus = counter;
      }
      else if(counter == modus)
      {
        if(bigNum <= data[i])
        {
          bigNum = data[i];
        }
      }
    }
    System.out.println("Modusnya adalah : " + bigNum);
  }
}
