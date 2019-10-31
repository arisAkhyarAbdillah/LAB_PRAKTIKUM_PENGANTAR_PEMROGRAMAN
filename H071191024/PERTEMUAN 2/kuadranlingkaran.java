import java.util.Scanner;
class kuadranlingkaran{
    public static void main(String[] args) {
        Scanner rv= new Scanner(System.in);
        System.out.println("imput titk x");
        int x= rv.nextInt();
        System.out.println("imput titik y");
        int y = rv.nextInt();
        double hasil = Math.sqrt(Math.pow(x ,2)) + Math.pow(y, 2);
       

       
        if (hasil <= 25){
            System.out.println("berada di dalam lingkaran A");
        }else {
            System.out.println("berada di luar lingkaran dan di dalam lingkaran b dan c");
        }
         if(hasil <=144){
            System.out.println("berada di dalam lingkaran B");
        } else {
            System.out.println(" berada di luar lingkaran dan berada di dalam lingkaran C");
        }
        if(hasil <= 400){
            System.out.println("berada di dalam lingkaran c");
        } else {
            System.out.println("berada di luar lingkaran dan tdk berada di dalam lingkaran mana pun");
        }
    }
}