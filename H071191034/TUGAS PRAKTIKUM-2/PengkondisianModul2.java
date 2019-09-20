import java.util.Scanner;
class PengkondisianModul2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**Menu**");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("\nInput angka sesuai dengan menu yang diinginkan :");

        int angka = sc.nextInt();
        
        switch (angka){
            case 1:
                System.out.println("**Pilih Bangun Datar**");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang");
                System.out.println("6. Trapesium");
                System.out.println("7. Belah Ketupat");
                System.out.println("8. Layang-layang");
                System.out.println("\nInput angka sesuai nomor bangun datar yang diinginkan :");
                int bangun = sc.nextInt();
                    switch (bangun){
                        case 1:
                            System.out.println("Input Sisi 1");
                            int aha = sc.nextInt();
                            System.out.println("Input Sisi 2");
                            int ihi = sc.nextInt();
                            double luass = aha * ihi;
                            System.out.println("Luas Persegi = " + luass);
                            break;
                        case 2:
                            System.out.println("Input Panjang");
                            int panjang2 = sc.nextInt();
                            System.out.println("Input Lebar");
                            int lebar2 = sc.nextInt();
                            double luas2 = panjang2*lebar2;
                            System.out.println("Luas Persegi Panjang = " + luas2);
                            break;
                        case 3:
                            System.out.println("Input Alas");
                            int alas1 = sc.nextInt();
                            System.out.println("Input Tinggi");
                            int tinggi1 = sc.nextInt();
                            double luas3 = (alas1*tinggi1)/2;
                            System.out.println("Luas Segitiga = " + luas3);
                            break;
                        case 4:
                            System.out.println("Input Jari-jari");
                            int R = sc.nextInt();
                            double luas4 = Math.PI*Math.pow(R,2);
                            System.out.printf("Luas Lingkaran = %.2f" , luas4);
                            break;
                        case 5:
                            System.out.println("Input Alas");
                            int alas2 = sc.nextInt();
                            System.out.println("Input Tinggi");
                            int tinggi2 = sc.nextInt();
                            double luas5 = alas2*tinggi2;
                            System.out.println("Luas Jajar Genjang = " + luas5);
                            break;
                        case 6:
                            System.out.println("Input Sisi 1");
                            int sisi1 = sc.nextInt();
                            System.out.println("Input Sisi 2");
                            int sisi2 = sc.nextInt();
                            double luas6 = (sisi1*sisi2)/2;
                            System.out.println("Luas Trapesium = " + luas6);
                            break;
                        case 7:
                            System.out.println("Input Diagonal 1");
                            int d1 = sc.nextInt();
                            System.out.println("Input Diagonal 2");
                            int d2 = sc.nextInt();
                            double luas7 = (d1*d2)/2;
                            System.out.println("Luas Belah Ketupat = " + luas7);
                            break;
                        case 8:
                            System.out.println("Input Diagonal 1");
                            int di1 = sc.nextInt();
                            System.out.println("Input Diagonal 2");
                            int di2 = sc.nextInt();
                            double luas8 = (di1*di2)/2;
                            System.out.println("Luas Layang-Layang = " + luas8);
                            break;
                        default:
                            break;
                    }
                break;      
            case 2:
                System.out.println("**Pilih Bangun Ruang**");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Limas");
                System.out.println("4. Prisma");
                System.out.println("5. Tabung");
                System.out.println("6. Kerucut");
                System.out.println("7. Bola");
                System.out.println("\nInput angka sesuai nomor bangun datar yang diinginkan :");
                bangun = sc.nextInt();
                switch (bangun){
                        case 1:
                            System.out.println("Input Sisi 1");
                            int Sisi1 = sc.nextInt();
                            System.out.println("Input Sisi 2");
                            int Sisi2 = sc.nextInt();
                            System.out.println("Input Sisi 3");
                            int sisi3 = sc.nextInt();
                            double volume1 = Sisi1*Sisi2*sisi3;
                            System.out.println("Volume Kubus = " + volume1);
                            break;
                        case 2:
                            System.out.println("Input Panjang");
                            int panjangg = sc.nextInt();
                            System.out.println("Input Lebar");
                            int lebarr = sc.nextInt();
                            System.out.println("Input Tinggi");
                            int tinggii = sc.nextInt();
                            double volume2 = panjangg*lebarr*tinggii;
                            System.out.println("Volume Balok = " + volume2);
                            break;
                        case 3:
                            System.out.println("Input Panjang");
                            int panjangg1 = sc.nextInt();
                            System.out.println("Input Lebar");
                            int lebarr1 = sc.nextInt();
                            System.out.println("Input Tinggi");
                            int tinggii1 = sc.nextInt();
                            double volume3 = ((panjangg1*lebarr1)/3)*tinggii1;
                            System.out.println("Volume Limas = " + volume3);
                            break;
                        case 4:
                            System.out.println("Input Sisi A");
                            int sisiA = sc.nextInt();
                            System.out.println("Input Sisi B");
                            int sisiB = sc.nextInt();
                            System.out.println("Input Tinggi");
                            int tinggii2 = sc.nextInt();
                            double volume4 = (sisiA*sisiB*tinggii2)/2;
                            System.out.println("Volume Prisma  = " + volume4);
                            break;
                        case 5:
                            System.out.println("Input Jari-jari");
                            int r = sc.nextInt();
                            System.out.println("Input Tinggi");
                            int tinggii3 = sc.nextInt();
                            double volume5 = Math.PI*Math.pow(r,2)*tinggii3;
                            System.out.printf("Volume Tabung = %.2f", volume5);
                            break;
                        case 6:
                            System.out.println("Input Jari-jari");
                            int r2 = sc.nextInt();
                            System.out.println("Input Tinggi");
                            int tinggii4 = sc.nextInt();
                            double volume6 = (Math.PI*Math.pow(r2,2)*tinggii4)/3;
                            System.out.printf("Volume Kerucut = %.2f" + volume6);
                            break;
                        case 7:
                            System.out.println("Input Jari-jari");
                            int r3 = sc.nextInt();
                            double volume7 = (4/3)*Math.PI*Math.pow(r3,3);
                            System.out.printf("Volume Bola = %.2f", volume7);
                            break;
                        default:
                            break;
                    }
            default:
                break;
                
        }
    }
}
