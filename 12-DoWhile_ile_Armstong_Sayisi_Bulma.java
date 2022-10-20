import java.util.Scanner;


public class Armstrong_Sayisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Sayiyi Girin: ");
        int sayi = scanner.nextInt();
        System.out.println("Basamak Sayisini Girin: ");
        int basamak_sayisi = scanner.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        
        do{
            int basamak_degeri = gecici_sayi %10;
            gecici_sayi /= 10;
            toplam += Math.pow(basamak_degeri, basamak_sayisi);
            
        } while(gecici_sayi > 0);
        
        if (toplam == sayi){
            System.out.println("Sayiniz bir Armstrong sayisidir.");
        }
        else{
            System.out.println("Sayiniz bir Armstrong sayisi degildir");
        }     
        
    }
}
