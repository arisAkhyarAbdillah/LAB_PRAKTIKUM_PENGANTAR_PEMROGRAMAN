import java.util.*;
class Praktikum1{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        String kalString = pew.nextLine();
        String remspaceString = kalString.replaceAll("\\s+", ""); //tanpa spasi
        String uppkalString = remspaceString.toUpperCase(); //kehuruf besar

        //bagi 2
        String splot = uppkalString.
        int split = uppkalString.length()/2;
        String separuhString = "";
        for (int i = 0; i < split; i++) {
            separuhString += uppkalString.charAt(i);
        }
        System.out.println(separuhString);
        //manipulasi palindrom
        String mString = "";
        char [] palindromChar = separuhString.toCharArray();
        for (int i = palindromChar.length-2; i >= 0; i--) {
            mString += palindromChar[i];
        }
        System.out.println(mString);
        //gabungan kata yang di potong dan palindrom
        String gabungString = separuhString + mString;
        //hexa (jumlah char*jumlah char)
        System.out.println(gabungString);
        int hexa = kalString.length() * kalString.length();
        String hxdec = String.format("%x", hexa);
        //simbol
        char simbol = hxdec.charAt(0);
        System.out.printf("#%s%s%o%c", hxdec, gabungString, kalString.length(), simbol >= 'A' && simbol <= 'z'? '?' : '!');

    }
}