import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class Modul3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter file = null;
        PrintWriter writer = null;

        try{
            System.out.print("Input nama file : ");
            String namaFile = sc.next();                                // nama file
            ArrayList<String> listName = new ArrayList<>();
            ArrayList<String> listNim = new ArrayList<>();
            ArrayList<String> listAngk = new ArrayList<>();

            System.out.print("Jumlah Asistensi : ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Nama : ");
                listName.add(sc.next());
                System.out.print("NIM : ");
                listNim.add(sc.next());
                System.out.print("Angkatan : ");
                listAngk.add(sc.next());
            }
            
            file = new FileWriter(namaFile + ".txt");
            writer = new PrintWriter(file);
            writer.printf("+----------------------+------------+-------------+\n");
            writer.printf("|         NAMA         |    NIM     |  ANGKATAN   |\n");
            writer.printf("+----------------------+------------+-------------+\n");
            for (int j = 0; j < n; j++) {    
                writer.printf("| %-20s | %-10s | %-10s  |\n", listName.get(j), listNim.get(j), listAngk.get(j));
            }
            writer.printf("+----------------------+------------+-------------+\n");

        } catch (IOException ioe){
            System.out.println("gagal");
        } finally {
            try {
                if (writer != null) {
                    System.out.println("Berhasil");
                    writer.close();
                } 
                if (file != null) {
                    file.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}