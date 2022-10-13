
import java.util.Scanner;

public class NewClass {
    
   public static void skorhesapla(String isim, int puan){
       System.out.println(isim + " Adlı Oyuncunun "+ puan + " Puana Sahip");
   }
   public static void skorhesapla(int puan){
       System.out.println("İsimsiz Oyuncunun "+ puan+ " Puana Sahip");    
   }
    public static void skorhesapla(String isim){
        System.out.println(isim + " Adlı Oyuncunun Puanı Yok");
    }
   
   public static void main(String[] args) {
     
       skorhesapla("Ömer");
       skorhesapla(95);
        skorhesapla("Egemen", 30);
    }
}
