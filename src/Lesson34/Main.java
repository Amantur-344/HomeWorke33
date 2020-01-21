package Lesson34;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
         ArrayList<Cat> cats = new ArrayList<>();
         cats.add(new Cat("tom",3));
         cats.add(new Cat("tuh",2));
         cats.add(new Cat("vtu",1));
         cats.add(new Cat("tg76",6));
         cats.add(new Cat("tuy",8));

         Cat c1 = new Cat("tom",3);

        System.out.println(cats.contains(c1));
    }
}
