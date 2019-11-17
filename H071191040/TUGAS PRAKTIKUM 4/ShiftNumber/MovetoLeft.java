import java.util.Scanner;
class MovetoLeft
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int x = read.nextInt();
    int array[] = new int[x];
    for(int i = 0; i < x; i++)
    {
      array[i] = read.nextInt();
    }
    int rotateArray[] = new int[x];
    int move = read.nextInt();
    for(int i = 0; i < x; i++)
    {
      if(i - move < 0)
      {
        rotateArray[i-move+x] = array[i];
      }
      else
      {
        rotateArray[i-move] = array[i];
      }
    }
    for(int i = 0; i < x; i++)
    {
      System.out.print(rotateArray[i] + " ");
    }
  }
}
