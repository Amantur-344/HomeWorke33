package Example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String [] args) {


                int border = 100;
                int rndIndex;
                List<Integer> storeNums = new ArrayList<>();
                for (int i = 1; i <= border; i++) {
                    storeNums.add(i);
                }
                for (int i = 0; i < 50; i++) {
                    rndIndex = (int) (Math.random() * storeNums.size());

                    //System.out.println("Четные "+chetNumber(storeNums.get(rndIndex)));
                    //System.out.println("Нечеттные "+nechetNumber(storeNums.get(rndIndex)));
                    //System.out.println(storeNums.get(rndIndex));
                    if(storeNums.get(rndIndex) % 2 == 0){
                        System.out.println();
//                        return;
                    }
                    if(storeNums.get(rndIndex) % 2 != 0){
//                        return;
                    }
                    //storeNums.remove(rndIndex);

                }

    }
    static boolean chetNumber (int number){
        return (number % 2) == 0;
    }
    static boolean nechetNumber (int number1){
        return (number1 % 2) != 0;
    }
}
