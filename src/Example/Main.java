package Example;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        ArrayList<Integer> list = new ArrayList<>();


    }
    static boolean isSqrt(int number){
        int temp = (int)Math.sqrt(number);
        temp = temp * temp;
        if (temp == number){
            return true;
        }
        return false;
    }


}
