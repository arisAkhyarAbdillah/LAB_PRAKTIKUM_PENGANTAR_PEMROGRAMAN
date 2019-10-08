import java.util.Scanner;
class praktikum2{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int x = pew.nextInt();
        int y = pew.nextInt();
       
        for (int i = 1;i<=y;i++){
            System.out.print(i + "\t");
            if (i%x==0){
                System.out.println();
            }
        }
    }
}