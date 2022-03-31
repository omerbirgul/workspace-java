import java.util.Scanner;


public class JavaÇalışma {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Harf Giriniz: ");
        char harf = scanner.next().charAt(0);
      
        
        switch(harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
                default:
                    System.out.println("İnce Sesli Harf");
        }
    }
    
}
