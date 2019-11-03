import java.util.Scanner;
class latihanPraktikum{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        String name = pew.nextLine();
        int tambah = pew.nextInt();

        char [] nama = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            
           // System.out.print(nama[i]);
            if (nama[i] >= 'A' && nama[i] <= 'Z'){
                nama[i] = (char) (Math.floorMod(nama[i]- 'A' + tambah , 26) + 'A');
            }else if(nama[i] >= 'a' && nama[i] <= 'z'){
                 nama[i] = (char) (Math.floorMod(nama[i]- 'a' + tambah , 26) + 'a');
            }
        }
        System.out.println(new String(nama)); 
        
    }
}