import java.util.Scanner ;
class Bintang {
    public static void main(String[] args) {
        // LATIHAN KELAS A NOMOR 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                                  //jumlah baris
        
        for (int i = 1; i <= n; i++) {                         //tinggi piramida
            for (int j = i; j <= n; j++) {                  
                System.out.print(" ");
                
            }
            for (int k = 0; k <=(i*2)-2; k++) {               //cetak bintang
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        sc.close();
    }
}