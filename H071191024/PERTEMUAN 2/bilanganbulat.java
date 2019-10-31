import java.util.InputMismatchException;
import java.util.Scanner;
class bilanganbulat{
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);        
        int a;
        int b; 
        int c;
        int d; 
        int e;
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;
 
        try{        
             a = key.nextInt();
             b = key.nextInt();
             c = key.nextInt();
             d = key.nextInt();
             e = key.nextInt();
              if ( a % 2 == 0){
            if ( a > 0){
                genap++;
                positif++;
            } else if( a < 0){
                genap ++;
                negatif ++;
            } else{
                genap++;
            }
        } else{
            if ( a > 0){
                ganjil++;
                positif++;
            } else if ( a < 0){
                ganjil++;
                negatif++;
            }
        }

        if ( b % 2 == 0){
            if ( b > 0){
                genap++;
                positif++;
            } else if ( b < 0){
                genap ++;
                negatif ++;
            } else{
                genap++;
            }
        } else{
            if ( b > 0){
                ganjil++;
                positif++;
            } else if ( b < 0){
                ganjil++;
                negatif++;
            }
        }

        if ( c % 2 == 0){
            if ( c > 0){
                genap++;
                positif++;
            } else if ( c <0){
                genap ++;
                negatif ++;
            } else{
                genap++;
            }
        } else{
            if ( c > 0){
                ganjil++;
                positif++;
            } else if( c < 0){
                ganjil++;
                negatif++;
            }
        }

        if ( d % 2 == 0){
            if ( d > 0){
                genap++;
                positif++;
            } else if ( d < 0){
                genap ++;
                negatif ++;
            } else{
                genap++;
            }
        } else{
            if ( d > 0){
                ganjil++;
                positif++;
            } else if ( d < 0) {
                ganjil++;
                negatif++;
            }
        }

        if ( e % 2 == 0){
            if ( e > 0){
                genap++;
                positif++;
            } else if ( e < 0){
                genap ++;
                negatif ++;
            } else{
                genap++;
            }
        } else{
            if ( e > 0){
                ganjil++;
                positif++;
            } else if ( e < 0){
                ganjil++;
                negatif++;
            }
        }
       
        System.out.printf("%d Angka genap\n", genap);
        System.out.printf("%d Angka ganjil\n", ganjil);
        System.out.printf("%d Angka positif\n", positif);
        System.out.printf("%d Angka negatif\n", negatif);
        } catch(InputMismatchException ime){
            System.out.println("Inputan tidak valid");
        } 
              
        
       


    }
}