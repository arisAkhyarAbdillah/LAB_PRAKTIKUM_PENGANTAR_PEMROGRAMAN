import java.util.Scanner;
class soallatihan{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        //di absolut digunakan agar dia tak tepat pada garis
        System.out.println("Masukkan nilai x: ");
        int x = pew.nextInt();
        System.out.println("Masukkan nilai y: ");
        int y = pew.nextInt();

        if(x < 0 && y > 0 && -x > y){
                System.out.println("Koordinat berada pada Quadran 1");
        }
        else if(x < 0 && y > 0 && -x == y){
                System.out.println("Koordinat berada pada garis");
        }
        else if(x < 0 && y >= 0 && y > -x){
                System.out.println("Koordinat berada pada Quadran 2");
        }
        else if(x > 0 && y > 0 && x < y){
            System.out.println("Koordinat berada pada Quadran 3");
        }
        else if(x > 0 && y > 0 && x == y){
            System.out.println("Koordinat berada pada garis");
        }
        else if(x > 0 && y > 0 && x > y){
            System.out.println("Koordinat berada pada Quadran 4");
        }
        else if(x > 0 && y < 0 && x > -y){
            System.out.println("Koordinat berada pada Quadran 5");
        }
        else if(x > 0 && y < 0 && x == -y){
            System.out.println("Koordinat berada pada garis");
        }
        else if(x > 0 && y < 0 && x < -y){
            System.out.println("Koordinat berada pada Quadran 6");
        }
        else if(x < 0 && y < 0 && -x < -y){
            System.out.println("Koordinat berada pada Quadran 7");

        }
        else if(x < 0 && y < 0 && -x == -y){
            System.out.println("Koordinat berada pada garis");
        }
        else if(x < 0 && y < 0 && -x > -y ){
            System.out.println("Koordinat berada pada Quadran 8");
        }
        else if(x < 0 && y ==0){
            System.out.println("Koordinat berada pada garis x minus");
        }
        else if(x == 0 && y > 0){
            System.out.println("Koordinat berada pada garis y positif");
        }
        else if(x > 0 && y == 0){
            System.out.println("Koordinat berada pada garis x positif");
        }
        else if(x == 0 && y < 0){
            System.out.println("Koordinat berada pada garis y minus");
        }
        else{
            System.out.println("Koordinat titik pusat (0,0)");
        }
        
    }



}