import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        int toplam = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=1; i<number; i++){

        if(number % i == 0){
            arrayList.add(i);
        }

        }

        for(int eleman: arrayList){
            toplam += eleman;
        }

        if(number == toplam){
            System.out.println("Sayi mukemmel sayidir");
        }else{
            System.out.println("Sayi mukemmel sayi degildir");
        }

    }
}