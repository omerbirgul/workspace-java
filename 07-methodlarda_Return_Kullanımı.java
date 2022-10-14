
import java.util.Scanner;

public class NewClass {
    
    public static int ikiekle(int a) {
        return a+2;
  }
    public static int dortilecarp(int a) {
        return a*4;
    }
    public static int bescıkar(int a) {
        return a-5;
    }
    
    public static void main(String[] args) {
     
       
        System.out.println("Sonuc = "+(bescıkar(dortilecarp(ikiekle(3)))));
        
    }
}
