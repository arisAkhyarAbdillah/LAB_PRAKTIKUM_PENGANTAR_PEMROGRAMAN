import java.util.Scanner;
class Nomor1{
    public static void main(String[] args) {
        //LATIHAN NOMOR 1 k'Aris - pengganti modul no 2 
        Scanner sc =  new Scanner(System.in);
        String word = sc.nextLine();
        int n = sc.nextInt();

        int hitungA = 0;                                                    //hitung huruf a
        for(int i = 0; i < n; i++) {                                        //dimodulo supaya indeks ke []+1 % length == 0. 
                                                                            // kembali ke indeks 0
          char c = word.charAt(i%word.length());                            //ulang inputan sebanyak n
        //   System.out.print(c);                                           //cetak perulangan inputan sampai sebanyak n
          hitungA += c == 'a' || c == 'A' ? 1:0;                            //bertambah 1 setiap ada huruf a
          
        }
        
        System.out.println(hitungA);
    }
}