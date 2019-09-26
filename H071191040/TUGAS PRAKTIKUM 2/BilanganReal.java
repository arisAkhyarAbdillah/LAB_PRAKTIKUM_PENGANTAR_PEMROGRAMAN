import java.util.Scanner;
import java.util.InputMismatchException;

class BilanganReal{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);


    int genap = 0;
    int ganjil = 0;
    int positif = 0;
    int negatif = 0;


    try{

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        if( a%2==0){
          if(a > 0){
            genap++;
            positif++;
      }
      else if(a < 0){
        genap++;
        negatif++;
      }
      else{
        genap++;
      }
    }
    else{
      if(a > 0){
        ganjil++;
        positif++;
      }
      else if (a < 0){
        ganjil++;
        negatif++;
      }
    }


    if( b%2==0){
      if(b > 0){
        genap++;
        positif++;
      }
      else if(b < 0){
        genap++;
        negatif++;
      }
      else{
        genap++;
      }
    }
    else{
      if(b > 0){
        ganjil++;
        positif++;
      }
      else if (b < 0){
        ganjil++;
        negatif++;
      }
    }

    if( c%2==0){
      if(c > 0){
        genap++;
        positif++;
      }
      else if(c < 0){
        genap++;
        negatif++;
      }
      else{
        genap++;
      }
    }
    else{
      if(c > 0){
        ganjil++;
        positif++;
      }
      else if (c < 0){
        ganjil++;
        negatif++;
      }
    }

    if( d%2==0){
      if(d > 0){
        genap++;
        positif++;
      }
      else if(d < 0){
        genap++;
        negatif++;
      }
      else{
        genap++;
      }
    }
    else{
      if(d > 0){
        ganjil++;
        positif++;
      }
      else if (d < 0){
        ganjil++;
        negatif++;
      }
    }

    if( e%2==0){
      if(e > 0){
        genap++;
        positif++;
      }
      else if(e < 0){
        genap++;
        negatif++;
      }
      else{
        genap++;
      }
    }
    else{
      if(e > 0){
        ganjil++;
        positif++;
      }
      else if (e < 0){
        ganjil++;
        negatif++;
      }
    }

    System.out.println(genap+" Angka Genap");
    System.out.println(ganjil+" Angka Ganjil");
    System.out.println(positif+" Angka Positif");
    System.out.println(negatif+" Angka Negatif");
  }catch(Exception ime){
    System.out.println("tidak valid");
  }




    }
  }
