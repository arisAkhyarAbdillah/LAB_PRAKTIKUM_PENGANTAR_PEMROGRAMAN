import java.util.Scanner;
public class praktikum2v5{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input x dan y : ");
        int x = input.nextInt();
        int y = input.nextInt();
        //double a = Math.sqrt(25), b = Math.sqrt(144), c = Math.sqrt(400);
        double r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println(" ");

        if (r < 25){
            System.out.println("Titk berada di dalam lingkaran a");
        }else if (r == 25){
            System.out.println("Titik pada lingkaran a");
        }else if (r > 25 && r < 144){
            System.out.println("Titik berada di dalam lingkaran b");
        }else if (r == 144){
            System.out.println("Titik pada lingkaran b");
        }else if (r > 144 && r < 400){
            System.out.println("Titik berada di dalam lingkaran c");
        }else if (r == 400){
            System.out.println("Titik pada lingkaran c");
        }else {
            System.out.println("Titik berada di luar lingkaran a, b, dan c");

        }
    }
}
    
