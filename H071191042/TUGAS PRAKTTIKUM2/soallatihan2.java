import java.util.Scanner;
class soallatihan2{
    public static void main(String[] args) {
        Scanner pew = new Scanner (System.in);
        String water, electric, fire, ground, pokemon1, pokemon2, element1, element2;
        
        System.out.println("summon pokemon =  ");
		pokemon1 = pew.next();
		System.out.println("element = ");
		element1 = pew.next();
		System.out.println("summon pokemon = ");
		pokemon2 = pew.next();
		System.out.println("element = ");
        element2 = pew.next();
        System.out.println("winner is = ");
        switch (element1){
            case "fire":
            switch (element2){
                case "fire":
                    System.out.println("draw");
                break;
                case "ice":
                    System.out.println(pokemon1);
                break;
                case "electric":
                    System.out.println(pokemon1);
                break;
                case "water":
                    System.out.println(pokemon2);
                break;
                case "ground":
                    System.out.println(pokemon2);
                break;                
            }break;
                case "ground":
                switch (element2){
                    case "ground":
                        System.out.println("draw");
                    break;
                    case "fire":
                        System.out.println(pokemon1);
                    break;
                    case "ice":
                        System.out.println(pokemon2);
                    break;
                    case "electric":
                        System.out.println(pokemon1);
                    break;
                    case "water":
                        System.out.println(pokemon2);
                    break;
                }break;
                    case "electric":
                    switch (element2){
                        case "electric":
                            System.out.println("draw");
                        break;
                        case "fire":
                            System.out.println(pokemon2);
                        break;
                        case "ground":
                            System.out.println(pokemon2);
                        break;
                        case "water":
                            System.out.println(pokemon1);
                        break;
                        case "ice":
                            System.out.println(pokemon1);
                        break;
                    }break;
                        case "water":
                        switch (element2){
                            case "water":
                                System.out.println("draw");
                            break;
                            case "fire":
                                System.out.println(pokemon1);
                            break;
                            case "ground":
                                System.out.println(pokemon1);
                            break;
                            case "electric":
                                System.out.println(pokemon2);
                            break;
                            case "ice":
                                System.out.println(pokemon2);
                            break;
                            
                        }break;
                            case "ice":
                            switch (element2){
                                case "ice":
                                    System.out.println("draw");
                                break;
                                case "fire":
                                    System.out.println(pokemon2);
                                break;
                                case "ground":
                                    System.out.println(pokemon1);
                                break;
                                case "electric":
                                    System.out.println(pokemon2);
                                break;
                                case "water":
                                    System.out.println(pokemon1);
                                break;
                            }default:
                            break;
                        } 
        



    }

}