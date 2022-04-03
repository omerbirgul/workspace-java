
import java.util.Scanner;

public class NewClass {
public static int toplama(int a,int b){
    return a+b;
}
public static int toplama(int a,int b,int c){
    return a+b+c;
}
public static int cikarma(int a,int b){
    return a-b;
}
public static int carpma(int a,int b){
    return a*b;
}
public static int carpma(int a,int b,int c){
    return a*b*c;
}
public static double bolme(int a,int b){
    return ((double) a/b);
}

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String islemler =     "1. Toplama Islemi \n"
                        + "2. Cikarma Islemi \n"
                        + "3. Carpma Islemi \n"
                        + "4. Bolme Islemi \n"
                        + "Cikis İcin q'ya Basiniz";
    
       System.out.println("**************************");
       System.out.println(islemler);
       System.out.println("**************************");
    
      while(true){
          System.out.print("Lutfen Islem Seciniz: ");
          String islem = scanner.nextLine();
          if(islem.equals("q")){
              System.out.println("Programdan Cikiliyor");
              break;
          }
          else if(islem.equals("1")){
              System.out.println("Kac Sayiyi Toplamak Istiyorsunuz? (2 veya 3)");
              int sayi = scanner.nextInt();
                if(sayi == 2){
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen Sayilarin Toplami = "+toplama(a, b));
                }
                else if(sayi == 3){
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen Sayilarin Toplami = "+toplama(a, b, c));
                }
                else{
                    System.out.println("Gecersiz Islem");
                }
          }
          else if(islem.equals("2")){
              System.out.print("a:");
              int a = scanner.nextInt();
              System.out.print("b:");
              int b = scanner.nextInt();
              scanner.nextLine();
              System.out.println("Girilen Sayilarin Farklari = "+cikarma(a, b));
          }
          else if(islem.equals("3")){
              System.out.println("Kac Sayiyi Carpmak Istiyorsunuz? (2 veya 3)");
              int sayi = scanner.nextInt();
                if(sayi == 2){
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen Sayilarin Carpimi = "+ carpma(a, b));
              }
                else if(sayi == 3){
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();   
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen Sayilarin Carpimi = "+carpma(a, b, c));
                }
                else{
                    System.out.println("Gecersiz Islem");
                }
          }
          else if(islem.equals("4")){
              System.out.print("a:");
              int a = scanner.nextInt();
              System.out.print("b:");
              int b = scanner.nextInt();
              scanner.nextLine();
              System.out.println("Girilen Sayilarin Bolumu = "+bolme(a, b));
              
          }
          else{
              System.out.println("Geçersiz Islem");
              
          }
     
      }
       
    }

}