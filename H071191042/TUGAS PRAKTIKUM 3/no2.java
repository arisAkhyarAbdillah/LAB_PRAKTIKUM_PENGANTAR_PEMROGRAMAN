/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class no2
{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int x = pew.nextInt();
        int y = pew.nextInt();
       
        for (int i = 1;i<=y;i++){
            System.out.print(i + "\t");
            if (i%x==0){
                System.out.println();
            }
        }
    }
}
