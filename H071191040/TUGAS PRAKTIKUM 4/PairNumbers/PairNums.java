import java.util.*;
class PairNums
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    int nums[] = new int[n];

    for(int i = 0; i < n; i++)
    {
      nums[i] = read.nextInt();
    }

    for(int i = 0; i < nums.length-1; i++)
    {
      for(int j = 0; j < n-1; j++)
      {
        if(nums[j] > nums[j+1])
        {
          nums[j] += nums[j+1];
          nums[j+1] = nums[j] - nums[j+1];
          nums[j] = nums[j] - nums[j+1];
        }
      }
      n--;
    }

    int countPairs = 0;
    n = nums.length;
    for(int i = 0; i < n-1;)
    {
      if(nums[i] == nums[i+1])
      {
        countPairs++;
        i += 2;
      }
      else if(nums[i] != nums[i+1])
      {
        i++;
      }
    }
    System.out.println(countPairs);
  }
}
