
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int number = scanner.nextInt();
        int total = 0;
        
        for(int i = 1; i < number; i++){
            
            if(number % i == 0){
                total += i;
            }    
        }
        if(total == number){
            System.out.println(" Number is perfect number");
        }
        else{
            System.out.println("Number is NOT perfect number");
        }
     
    }
    
}
