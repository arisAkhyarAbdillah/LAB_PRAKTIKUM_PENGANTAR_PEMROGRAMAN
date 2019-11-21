import java.util.*; 
class lab7{ 
static Scanner pew = new Scanner(System.in);
// Function for finding sum of larger numbers 

public static void main(String[] args)  {  
    String numb1 = pew.next();  
    String numb2 = pew.next();  
    System.out.println(findSum(numb1, numb2));  
}  
static String findSum(String a, String b)  {  
    //cek panjang  
    if (a.length() > b.length()){  
        String t = a; 
        a = b; 
        b = t; 
    } 
  
    // simpan  
    String str = "";  
  
    // hitung panjang string 
    int n1 = a.length(), n2 = b.length();  
  
    // reverse
    a=new StringBuilder(a).reverse().toString(); 
    b=new StringBuilder(b).reverse().toString(); 
  
    int carry = 0;  
    for (int i = 0; i < n1; i++)  
    {  
        // penjumlahan 
        int sum = ((int)(a.charAt(i) - '0') +  (int)(b.charAt(i) - '0') + carry);  
        str += (char)(sum % 10 + '0');  
  
        carry = sum / 10;  
    }  
  
    // menambahkan sisa digitnya
    for (int i = n1; i < n2; i++)  
    {  
        int sum = ((int)(b.charAt(i) - '0') + carry);  
        str += (char)(sum % 10 + '0');  
        carry = sum / 10;  
    }  
  
    //masukkan  
    if (carry > 0)  
        str += (char)(carry + '0');  
  
    // reverse 
    str = new StringBuilder(str).reverse().toString(); 
  
    return str;  
    }  
    
} 