import java.util.Scanner;
class Nomor1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();                   //jumlah nama dan nilai yang  ingin diinput

    double rank1 = 0;                       //untuk mengurutkan nilai
    double rank2 = 0;
    double rank3 = 0;
    String nama1 = null;                    //untuk mengurutkan nama
    String nama2 = null;
    String nama3 = null;

    for(double i = 0 ; i < n ; i++){        //perulangan untuk input nama dan nilai sebanyak jumlah  n
      String nama = sc.next();              //input nama
      double nilai = sc.nextDouble();
      if(nilai > rank3){
        rank3 = nilai;
        nama3 = nama;
        if(nilai > rank2){
          rank3 = rank2;
          nama3 = nama2;
          rank2 = nilai;
          nama2 = nama;
          if(nilai > rank1){
            rank2 = rank1;
            nama2 = nama1;
            rank1 = nilai;
            nama1 = nama;
          }
        }
      }
      }System.out.println();
      if (rank1==rank2){
        System.out.println(nama1+"\n"+nama2);
      }if (rank2==rank3){
        System.out.println(nama2+"\n"+nama3);
      } else {
        System.out.println(nama2);
      }

      // System.out.println();
      // System.out.println(rank1 + rank2 + rank3);
      // System.out.println(nama1 + " " );
      // System.out.println(nama2 + " " );
      // System.out.println(nama3 + " " );

  }
}