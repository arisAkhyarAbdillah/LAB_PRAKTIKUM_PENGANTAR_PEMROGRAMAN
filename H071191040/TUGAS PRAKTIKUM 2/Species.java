import java.util.Scanner;
class Species
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    String tulang = key.nextLine();
    String ordo = key.nextLine();
    String pemakan = key.nextLine();


    if(tulang.equalsIgnoreCase("vertebrado"))
    {
      if(ordo.equalsIgnoreCase("ave"))
      {
        if(pemakan.equalsIgnoreCase("carnivoro"))
        {
          System.out.println("agula");
        }
        else if(pemakan.equalsIgnoreCase("onivoro"))
        {
          System.out.println("pomba");
        }
        else
        {
          System.out.println("tidak valid");
        }
      }
      else if(ordo.equalsIgnoreCase("mamifero"))
      {
        if(pemakan.equalsIgnoreCase("onivoro"))
        {
          System.out.println("homem");
        }
        else if(pemakan.equalsIgnoreCase("herbivoro"))
        {
          System.out.println("vaca");
        }
        else
        {
          System.out.println("tidak valid");
        }
      }
      else
      {
        System.out.println("tidak valid");
      }

    }
    else if(tulang.equalsIgnoreCase("invertebrado"))
    {
      if(ordo.equalsIgnoreCase("inseto"))
      {
        if(pemakan.equalsIgnoreCase("hematofago"))
        {
          System.out.println("pulga");
        }
        else if(pemakan.equalsIgnoreCase("herbivoro"))
        {
          System.out.println("lagarta");
        }
        else
        {
          System.out.println("tidak valid");
        }
      }
      else if(ordo.equalsIgnoreCase("anelideo"))
      {
        if(pemakan.equalsIgnoreCase("hematofago"))
        {
          System.out.println("sanguessuga");
        }
        else if(pemakan.equalsIgnoreCase("onivoro"))
        {
          System.out.println("minhoca");
        }
        else
        {
          System.out.println("tidak valid");
        }
      }
      else
      {
        System.out.println("tidak valid");
      }
    }
    else
    {
      System.out.println("tidak valid");
    }

  }
}
