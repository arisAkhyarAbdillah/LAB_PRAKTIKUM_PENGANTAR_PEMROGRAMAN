import java.util.Scanner;

  public class praktikumkapal{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);

    Double h, a, b, xa, panjangKapal;

    System.out.print("h(tinggi menara) =  ");
    h = scan.nextDouble();
    System.out.print("a(sudut elevasi terhadap ujung depan) =  ");
    a = scan.nextDouble();
    System.out.print("b(sudut elevasi terhadap ujung belakang) =  ");
    b = scan.nextDouble();

    xa = h*(Math.tan(Math.toRadians(b)));
    panjangKapal = ((Math.tan(Math.toRadians(a)))*h)-xa;
    System.out.printf("x = " + "%.1fm", panjangKapal);

  }
}
