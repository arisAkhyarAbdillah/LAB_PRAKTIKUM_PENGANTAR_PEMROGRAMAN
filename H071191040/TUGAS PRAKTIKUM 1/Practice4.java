import java.util.Scanner;
class Practice4
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int uang = key.nextInt();
    uang = Math.max(uang,0);
    int seratus = uang/100000;
    uang %= 100000;
    int limapuluh = uang/50000;
    uang %= 50000;
    int duapuluh = uang/20000;
    uang %= 20000;
    int sepuluh = uang/10000;
    uang %= 10000;
    int limaribu = uang/5000;
    uang %= 5000;
    int duaribu = uang/2000;
    uang %= 2000;
    int seribu = uang / 1000;


    System.out.printf("uang 100.000 = %d lembar %n",seratus);
    System.out.printf("uang 50.000  = %d lembar %n",limapuluh);
    System.out.printf("uang 20.000  = %d lembar %n",duapuluh);
    System.out.printf("uang 10.000  = %d lembar %n",sepuluh);
    System.out.printf("uang 5.000   = %d lembar %n",limaribu);
    System.out.printf("uang 2.000   = %d lembar %n",duaribu);
    System.out.printf("uang 1.000   = %d lembar %n",seribu);
  }

}
