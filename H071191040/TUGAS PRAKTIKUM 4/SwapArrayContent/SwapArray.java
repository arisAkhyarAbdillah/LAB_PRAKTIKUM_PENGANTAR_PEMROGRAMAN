class SwapArray
{
  public static void main(String[] args)
  {
    char a[] = {'F','I'};
    char b[] = {'R', 'A', 'H'};
    char save[] = new char[(a.length < b.length ? a.length:b.length)];
    for(int i = 0; i < save.length; i++)
    {
      save[i] = a[i];
      a[i] = b[i];
      b[i] = save[i];
    }
    System.out.print("ini yang a = ");
    for(int i = 0; i < a.length; i++)
    {
      System.out.print(a[i] + " ");
    }
    System.out.println();
    System.out.print("ini yang b = ");
    for(int i = 0; i < b.length; i++)
    {
      System.out.print(b[i] + " ");
    }
  }
}
