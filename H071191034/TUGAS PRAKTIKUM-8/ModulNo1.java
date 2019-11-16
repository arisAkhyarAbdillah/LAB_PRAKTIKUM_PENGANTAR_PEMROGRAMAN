import java.util.Scanner;
import java.io.*;
class ModulNo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try {
            in = new FileInputStream(String.format("%s.txt", sc.next()));
            out = new FileOutputStream(String.format("%s.txt",sc.next()));
            int data;
            while ((data=in.read())!= -1){                                      //-1 ASCII dr 0
                out.write(data);
            }
        } catch (IOException ioe){
            System.out.println("Gagal");
        } finally {
            try {
                if (in != null){
                    System.out.println("Berhasil");
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            } catch (IOException ioe){
                System.out.println(ioe.getMessage());
            }
        }
    }
}