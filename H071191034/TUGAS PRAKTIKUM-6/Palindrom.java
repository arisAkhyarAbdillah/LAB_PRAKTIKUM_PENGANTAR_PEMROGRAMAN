import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        // LATIHAN KELAS A NOMOR 2
        Scanner ka = new Scanner(System.in);
        int n = ka.nextInt();
        String word[] = new String[n];
        int count = 0;
        boolean found = false;
        String reverse = "";
        int i = 0;

        for (i = 0; i < word.length; i++) {
            word[i] = ka.next();  
        }
        
        for (i = 0; i < n; i++) {
            String convert =  (word[i]);
            for (int j = convert.length() - 1; j >= 0; j--) {
                reverse += convert.charAt(j);
            }
            if (convert.equals(reverse)) {
                found = true;
                count++;
            }
            reverse ="";
        }
        System.out.println(reverse);

        if (found == true) {
            System.out.println(count);
        }

    }
}