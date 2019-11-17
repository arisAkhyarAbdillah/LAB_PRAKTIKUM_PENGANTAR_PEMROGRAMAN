import java.util.*;
class MiracleNumber
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int a = read.nextInt();
    int b = read.nextInt();
    boolean simpan = true;
    ArrayList <Integer> miracleNums = new ArrayList<>();
    for(int i = a <= b ? a:b ; i <= (b < a ? a:b); i++)
    {
      simpan = true;
      String s = String.valueOf(Math.abs(i));
      char c[] = s.toCharArray();
      for(int j = 0; j < c.length; j++)
      {
        if(c[j] == '0')
        {
          simpan = false;
          break;
        }
        if(i % (c[j] % '0') != 0)
        {
          simpan = false;
          break;
        }
      }
      if(simpan)
      {
        miracleNums.add(i);
      }
    }
    System.out.print("[");
    for(int i = 0, n = miracleNums.size(); i < n; i++)
    {
      System.out.printf("%s %s", miracleNums.get(i), i == n-1 ? "]":",");
    }
  }
}
