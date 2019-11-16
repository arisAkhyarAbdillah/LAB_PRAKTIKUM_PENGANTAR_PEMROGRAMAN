import java.util.Arrays;
import java.util.Scanner;
class LatihanKakAris{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);

        String kata1String = pew.nextLine().toUpperCase().replace(" ", "");
        String kata2String = pew.nextLine().toUpperCase().replace(" ", "");

        char [] naruto = kata1String.toCharArray();
        char [] sasuke = kata2String.toCharArray();
        //untuk mengurutkan
        Arrays.sort(naruto);
        Arrays.sort(sasuke);
        boolean hasil = Arrays.equals(naruto, sasuke);
        if(hasil = true){
            System.out.println("nikmat");
        }else{
            System.out.println("tidak nikmat");
        }

    }
}