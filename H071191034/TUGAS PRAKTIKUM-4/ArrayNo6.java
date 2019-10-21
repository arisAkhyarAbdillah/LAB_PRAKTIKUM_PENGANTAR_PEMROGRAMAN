import java.util.Scanner;
class ArrayNo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] arr = new  int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i=1; i<arr.length-1; i++){
            for (int j=1; j<arr.length-1; j++){
                if(arr[i][j]==0){
                    if (arr[i][j]!= arr[i][j-1] && arr[i][j] != arr[i][j+1] && arr[i][j] != arr[i-1][j] && arr[i][j] != arr[i+1][j]){
                        System.out.println(i+","+j);
                    }

                }
            }
        }
    }
}