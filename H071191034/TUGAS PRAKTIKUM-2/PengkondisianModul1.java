import java.util.Scanner;
class PengkondisianModul1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int bilGenap = 0;
            int bilGanjil = 0;
            int bilNegatif = 0;
            int bilPositif = 0;

            int a = sc.nextInt();
            if (a==0){
                bilGenap++;
            } else if (a%2==0){
                bilGenap++;
                if (a>0){
                    bilPositif++;
                } else {
                    bilNegatif++;
                }
            }else{
                bilGanjil++;
                if (a>0){
                    bilPositif++;
                } else {
                    bilNegatif++;
                }
            }

            int b = sc.nextInt();
            if (b==0){
                bilGenap++;
            } else if (b%2==0){
                bilGenap++;
                if (b>0){
                    bilPositif++;
                } else {
                    bilNegatif++;
                }
            }else{
                bilGanjil++;
                if (b>0){
                    bilPositif++;
                } else {
                    bilNegatif++;
                }
            }
            
            int c = sc.nextInt();
            if (c==0){
                bilGenap++;
            } else if (c%2==0){
                bilGenap++;
                if (c>0){
                    bilPositif++;
                } else {
                    bilNegatif++;
                }
            }else{
                bilGanjil++;
                if (c>0){
                    bilPositif++;
                } else {
                    bilNegatif++;
                }
            }
            
            int d = sc.nextInt();
            if (d==0){
                bilGenap++;
            } else if (d%2==0){
                bilGenap++;
                if (d>0){
                    bilPositif++;
                } else {
                    bilNegatif++;
                }
            }else{
                bilGanjil++;
                if (d>0){
                    bilPositif++;
                } else {
                    bilNegatif++;
                }
            }
            
            int e = sc.nextInt();
            if (e==0){
                bilGenap++;
            } else if (e%2==0){
                bilGenap++;
                if (e>0){
                    bilPositif++;
                } else {
                    bilNegatif++;
                }
            }else{
                bilGanjil++;
                if (e>0){
                    bilPositif++;
                } else {
                    bilNegatif++;
                }
            }
            System.out.println(bilPositif+" bilangan positif");
            System.out.println(bilNegatif+" bilangan negatif");
            System.out.println(bilGanjil+" bilangan ganjil");
            System.out.println(bilGenap+" bilangan genap");
        } catch (Exception e) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}