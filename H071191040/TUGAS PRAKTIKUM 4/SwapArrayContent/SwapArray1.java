class SwapArray1
{
  public static void main(String[] args)
  {
    char a[] = {'I', 'L', 'K', 'O', 'M'};
    char b[] = {'2', '0', '1', '9'};
    int data1;
    int data2;
    for(int i = 0; i < (a.length < b.length ? a.length:b.length); i++)
    {
      data1 = (int)a[i];
      data2 = (int)b[i];
      data1 = data1 + data2;
      data2 = data1 - data2;
      data1 = data1 - data2;
      a[i] = (char)data1;
      b[i] = (char)data2;
    }
    System.out.print("ini adalah a = ");
    for(int i = 0; i < a.length; i++)
    {
      System.out.print(a[i] + " ");
    }
    System.out.println();
    System.out.print("ini adalah b = ");
    for(int i = 0; i < b.length; i++)
    {
      System.out.print(b[i] + " ");
    }
  }
}
