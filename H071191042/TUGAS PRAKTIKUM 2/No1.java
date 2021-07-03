import java.util.Scanner;
public class No1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {

    int genap = 0;
    int ganjil = 0;
    int positif = 0;
    int negatif = 0;
    
    try{
        
        int myArray[] = new int[5];
    
        for(int i = 0; i < 5; i++){
            myArray[i] = sc.nextInt();
                    if(myArray[i] % 2 == 0){
                if(myArray[i] > 0){
                    genap++;
                    positif++;
                }else if(myArray[i] < 0){
                    negatif++;
                    genap++;
                }else{
                    genap++;
                }
            }else{
                if(myArray[i] > 0){
                    ganjil++;
                    positif++;
                }else{
                    ganjil++;
                    negatif++;
                }
            }
        }
    
        System.out.println(genap + " angka genap");
        System.out.println(ganjil + " angka ganjil");
        System.out.println(positif + " angka posfitif");
        System.out.println(negatif + " angka negatif");
        
    }catch(Exception ime){
        System.out.println("TIDAK VALID");
    }
    

    
    }
}