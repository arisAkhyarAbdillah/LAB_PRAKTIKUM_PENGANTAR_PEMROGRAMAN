import java.util.Scanner;
class ArrayNo4{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int array [] = new int [a];
        
        boolean sama = false;

        for (int i=0; i<array.length; i++){
            array [i] = sc.nextInt();
        }

        boolean nilaiSama = false;
        int j, batas = a-1;
        for (int i=0; i<array.length; i++){
            j=1;
            j+=i;
            for (int b=0; b<batas; b++){
                if(array[i] == array[j] || array[j] == array[i]){
                    nilaiSama = true;
                    sama = true;
                    System.out.printf("Terdapat angka yang sama yaitu %d yang terletak di indeks %d,%d \n", array[i],i,j);
                    break;
                } else if(array[i] != array[j]){
                    sama = false;
                }j++;
            }batas--;
        }

        if(!nilaiSama){
            System.out.println("Tidak ada yang sama");
        
        }
    }
}