import java.math.BigInteger;
import java.util.Scanner;
class praktikum3{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int a = pew.nextInt();
        BigInteger fn = BigInteger.valueOf(0);
        BigInteger fn1 = BigInteger.valueOf(1);
        BigInteger fn2 = BigInteger.valueOf(0);
        
        for (int i=0;i< a;i++){
            System.out.print(fn + " ");
            fn = fn1;
            fn1 = fn1.add(fn2);
            fn2 = fn;
            // if (fn > Integer.MAX_VALUE){
            //     break;
            // }

        }

        
        
    }
}