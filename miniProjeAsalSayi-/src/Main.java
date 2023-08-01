
public class Main {
    public static void main(String[] args) {
        int number = 27;
        boolean isPrime = true;



        for( int i = 2; i< number; i++){
                if(number % i == 0){
                    isPrime = false;
                }
        }

        if(isPrime){
            System.out.println("sayi asaldir");

        }else{
            System.out.println("sayi asal degildir.");
        }

    }
}