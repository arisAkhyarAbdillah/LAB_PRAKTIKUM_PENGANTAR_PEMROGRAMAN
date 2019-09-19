import java.util.Scanner;
class soallatihan3{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        String hewan, kelas, jenis, invertebrado, vertebrado, ave, mamifero, inseto, anelideo, carnivoro, herbivoro, onivoro, hematofago;
        
        System.out.println("vertebrado / invertebrado");
        hewan = pew.next();
        kelas = pew.next();
        jenis = pew.next();
        switch (hewan){
            case "vertebrado":
            switch (kelas){
                case "ave":
                    switch (jenis){
                        case "carnivoro":
                            System.out.println("agula");
                            break;
                        case "onivoro":
                            System.out.println("pomba");
                        break;
                    }break;
                    case "mamifero":
                        switch (jenis){
                            case "onivoro":
                                System.out.println("homem");
                            break;
                            case "herbivoro":
                                System.out.println("vaca");
                            break;
                        }break;
                    }
            }switch (hewan){
                case "invertebrado":
                switch (kelas){
                    case "inseto":
                        switch (jenis){
                            case "hematofago":
                                System.out.println("pulga");
                                break;
                            case "herbivoro":
                                System.out.println("lagarta");
                            break;
                        }break;
                        case "anelideo":
                            switch (jenis){
                                case "hematofago":
                                    System.out.println("sanguessuga");
                                break;
                                case "onivoro":
                                    System.out.println("minhoca");
                                break;
                            }break;
                        }
                }
        }
}