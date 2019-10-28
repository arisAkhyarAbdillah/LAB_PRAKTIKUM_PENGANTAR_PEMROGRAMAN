import java.util.Scanner;
class Split2 {
    public static void main(String[] args) {
        // LATIHAN KELAS A NOMOR 1
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int oddEven = text.length()%2;
        int tengah = text.length()/2;
        String part1 = "";
        String part2 = "";

        //kelompokkan jadi 2 bagian
        if (oddEven==0){
            String str []= {text.substring(0, tengah),text.substring(tengah)};
            part1 = str[0];
            part2 = str[1];
        } else if (oddEven==1){
            String str [] = {text.substring(0, tengah+1), text.substring(tengah+1)};
            part1 = str[0];
            part2 = str[1];
        }

        //bagian kedua dibalik
        String balik = "";
        for (int i = part2.length()-1; i >= 0; i--) {
            balik += part2.charAt(i);
        }

        // bagian pertama digeser ke kanan 3 kali
        String replace = "";
        for (int i = 0; i < part1.length(); i++) {
            int nilai = part1.charAt(i);
            if  (nilai+3 >126){
                nilai = nilai%126;
                nilai += 3;
                replace += (char) nilai;
            }else{
                replace += (char) (nilai+3);
            }

        }
        // bagian kedua + bagian pertama
        String hasil = (balik+replace);

        // diubah jadi kapital
        String kapital = hasil.toUpperCase();

        System.out.println(kapital);


    }
}