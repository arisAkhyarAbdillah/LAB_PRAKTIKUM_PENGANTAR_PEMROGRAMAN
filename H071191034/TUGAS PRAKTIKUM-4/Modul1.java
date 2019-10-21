import java.util.Scanner;
class Modul1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];

        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int  i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                int a = arr[i]; //angka 1
                int b = arr[j]; // angka 2
                do {
                    int c = b;
                    b = a % b;
                    a = c;
                } while (b != 0);
                    if (a == 1){
                        System.out.printf("%d %d \n",arr[i],arr[j]);
                    }
                
            }
        }
    }
}
