
import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesapObjesi3) {
        
        Login loginReferansı = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz");
        
        System.out.println("**********************");
        System.out.println("Kullanıcı Girişi:");
        System.out.println("**********************");
        
        int giris_hakkı = 3;
        
        while (true) {
            if(loginReferansı.loginMetodu(hesapObjesi3))     {
                System.out.println("Giriş Başarılı...");
                break;
            }
            else{
                System.out.println("Giriş Başarısız...");
                giris_hakkı -= 1;
                System.out.println("Kalan Giriş Hakkı: " +giris_hakkı);
            }
            if(giris_hakkı == 0){
                System.out.println("Giriş Hakkınız Bitti");
            return;
            }
            
        }
         System.out.println("*************************");
        String islemler = "1. Bakiye Göster \n"
                         +"2. Para Yatırma \n"
                         +"3. Para Çekme \n"
                         +"Çıkış İçin q'ya Basın";
         System.out.println(islemler);
        System.out.println("*************************");
        
        while(true){
            System.out.println("Lütfen İşlem Seçiniz:");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz: "+hesapObjesi3.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("Para Yatırmak İstediğiniz Tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesapObjesi3.paraYatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Çekmek İstediğiniz Para Tutarı:");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesapObjesi3.paraCek(tutar);
            }
            else {
                System.out.println("Geçersiz İşlem");
            }
         
        
        
        
        
        
        
        }

    }
    
}
