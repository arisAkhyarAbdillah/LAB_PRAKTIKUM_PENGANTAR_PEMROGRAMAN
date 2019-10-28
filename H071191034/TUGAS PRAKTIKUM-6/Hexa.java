import java.util.Scanner;
class Hexa {
    public static void main(String[] args) {
        // TUGAS NOMOR 1 MODUL
        Scanner sc = new Scanner (System.in);
        String text = sc.nextLine();
        String teks = text.replace(" ", ""); //tanpa spasi

        // karakter dibagi 2
        int split = teks.length()/2;
        String stengah = "";
        for (int i = 0; i < split; i++) {
            stengah += teks.charAt(i);
            
        }
        // bikin karakter jadi palindrom
        String palindrom = "";
        for (int i = stengah.length()-2; i >= 0; i--) {
            palindrom += stengah.charAt(i);
        }
        
        // kata yang dipotong + kata yang dipotong lalu dipalindrom
        String gabung = stengah+palindrom;
        
        // konversi ke hexadesimal jumlah*jumlah
        int hexa = text.length()*text.length();
        String hexadecimal = String.format("%x", hexa);

        // cetak simbol
        char simbol = hexadecimal.charAt(0);

        System.out.printf("#%s%s%o%c", hexadecimal, gabung.toUpperCase(), text.length(), simbol >= 'A' && simbol <= 'z'? '?' : '!');


    }
}