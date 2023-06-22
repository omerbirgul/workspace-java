import java.util.Scanner;


public class KullanıcıGirişi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int girishakkı = 3;
        String sys_kullanıcı ="Omer ";
        String sys_parola ="1234";
        
        System.out.println("**************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz!");
        System.out.println("**************************");
        
        while(true){
            
            System.out.print("Kullanıcı adı:");
            String kullanıcı = scanner.nextLine();
            System.out.print("Parola: ");
            String parola = scanner.nextLine();
            
            
            if(kullanıcı.equals(sys_kullanıcı) && parola.equals(sys_parola)){
                System.out.println("Hoşgeldiniz "+ kullanıcı);
                break;
            }
            else if(kullanıcı.equals(sys_kullanıcı) && !parola.equals(sys_parola)){
                System.out.println("Parolanız Yanlış");
                girishakkı -= 1;
            }
            else if(!kullanıcı.equals(sys_kullanıcı) && parola.equals(sys_parola)){
                System.out.println("Kullanıcı Adınız Yanlış");
                girishakkı -=1;
            }
            else{
                System.out.println("Kullanıcı Adınız ve Parolanız Yanlış");
                girishakkı -=1;
            }
            if(girishakkı == 0){
                System.out.println("Giriş Hakkınız Bitti. Hoşçakalın...");
                break;
            }   
        }
      }
   }
