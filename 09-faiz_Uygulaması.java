
import java.util.Scanner;


public class KullanıcıGirişi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz... Faiz Oranı: %6");
        int anapara, vade;
        System.out.print("Yatırmak İstediğiniz Tutar: ");
        anapara = scanner.nextInt();
        System.out.print("Kaç Yıl Vade ile Yatırmak İstiyorsunuz? ");
        vade = scanner.nextInt();
        double toplampara = anapara;
        double faiz_oranı = 0.06;
        
        for(int i = 1; i <=vade; i++){
            
            toplampara =(toplampara * faiz_oranı) + toplampara; 
            System.out.println(+i + ". Yılın Sonunda Toplam Para: " +(int)toplampara);
        }
    }
   }
