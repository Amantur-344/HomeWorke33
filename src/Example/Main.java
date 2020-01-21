package Example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int rndIndex = 0;
        ArrayList<Integer> storeNums = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            storeNums.add(i);
        }
        for (int i = 0; i < 50; i++) {
            rndIndex = (int) (Math.random() * storeNums.size());


            System.out.println("Нечеттные " + nechetNumber(storeNums.get(rndIndex)));
            System.out.println("Четные " + chetNumber(storeNums.get(rndIndex)));
        }
    }

        static boolean nechetNumber ( int number1){
            if (number1 % 2 != 0) {
                System.out.println(number1);
            }
            return false;
        }
        static  boolean chetNumber (int number){
        if(number % 2 == 0){
            System.out.println(number);
        }
        return false;
        }



}