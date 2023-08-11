
public class Main {
    public static void main(String[] args) {
        
        ATM atmReferansı = new ATM();
        Hesap hesap = new Hesap("omer","1234", 1000);
        
        atmReferansı.calis(hesap);
        
        
        System.out.println("Programdan Cikiliyor...");
        
    }
    
}
