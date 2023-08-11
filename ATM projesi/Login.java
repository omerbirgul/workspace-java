
import java.util.Scanner;


public class Login {
    public boolean  loginMetodu(Hesap hesapObjesi2){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kullanıcı Adınızı Girin: ");
        String Grln_Kllnc_adı = scanner.nextLine();
        System.out.println("Parolanızı Girin: ");
        String Grln_parola = scanner.nextLine();
        
        if(hesapObjesi2.getKullanici_adi().equals(Grln_Kllnc_adı) && hesapObjesi2.getParola().equals(Grln_parola)){
            return true;
        }
        else{
            return  false;
        }
        
    }
    
}