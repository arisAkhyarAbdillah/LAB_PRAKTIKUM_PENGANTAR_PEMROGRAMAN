import java.util.Scanner;
class pokemonComp
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    String nama = key.next().toLowerCase();
    String element = key.next().toLowerCase();
    String nama2 = key.next().toLowerCase();
    String element2 = key.next().toLowerCase();

    switch(element)
    {
      case "fire":
      switch(element2)
      {
        case "ice":
        System.out.println(nama);
        break;
        case "electric":
        System.out.println(nama);
        break;
        case "water":
        System.out.println(nama2);
        break;
        case "fire":
        System.out.println("draw");
        break;
      }
      break;
      case "ground":
      switch(element2)
      {
        case "electric":
        System.out.println(nama);
        break;
        case "fire":
        System.out.println(nama);
        break;
        case "water":
        System.out.println(nama2);
        break;
        case "ground":
        System.out.println("draw");
        break;
      }
      break;
      case "water":
      switch(element2)
      {
        case "fire":
        System.out.println(nama);
        break;
        case "ground":
        System.out.println(nama);
        break;
        case "electric":
        System.out.println(nama2);
        break;
        case "ice":
        System.out.println(nama2);
        break;
        case "water":
        System.out.println("draw");
        break;

      }
      break;
      case "electric":
      switch(element2)
      {
        case "ice":
        System.out.println(nama);
        break;
        case "water":
        System.out.println(nama);
        break;
        case "fire":
        System.out.println(nama2);
        break;
        case "ground":
        System.out.println(nama2);
        case "electric":
        System.out.println("draw");
        break;
      }
      break;
      case "ice":
      switch(element2)
      {
        case "water":
        System.out.println(nama);
        break;
        case "ground":
        System.out.println(nama);
        break;
        case "electric":
        System.out.println(nama2);
        break;
        case "fire":
        System.out.println(nama2);
        break;
        case "ice":
        System.out.println("draw");
        break;
      }
      break;
    }
  }
}
