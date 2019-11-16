import java.util.Scanner;
class pum{
    public static void main(String[] args) {
        Scanner rv = new Scanner(System.in);
        System.out.println("masukkan nilai N");
        int n= rv.nextInt();
        int v =1;
        for ( int i =1 ; i <= 30; i++){
            System.out.print(v +" " );
            v +=1;
            if ( i  % 3 ==0){
                System.out.println("pum \n");
            }
    
        }

    }
}