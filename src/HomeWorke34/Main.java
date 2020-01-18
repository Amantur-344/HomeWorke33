package HomeWorke34;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String [] args) throws IOException {
        FileWriter fileWriter = new FileWriter("text.txt");
        fileWriter.write("1.Вид исключения у которого есть более мелкие ислкючения " +
                "а Exeption главный.");
        fileWriter.write("2.В своей практике я не обращал внимания на исключения " +
                "потому-что я не воспринимал это как важным.");
        fileWriter.write("3.Есть класс исключения Throwable и от него унаследуется Error" +
                "и Exaption " );
        fileWriter.write("4.Если не обработать исключения то код расположенная после него" +
                "не будет работать и в итоге вся программа не будет работать нормальна.");
        fileWriter.write("5.C пощью try cath мы ловим возможную ошибку и сообщаем об этом " +
                "и после этого последуещий код будет работать как будто нечего и не было.");
        fileWriter.close();

        FileWriter fileWriter1 = new FileWriter("text2.txt");
        fileWriter1.write("1.В подробности я не разобрался");
        fileWriter.write("2.Это чтобы исправить определенные ошибки.");
        fileWriter.write("3.Разница что англед не обезательно исправлять и она возникает " +
                "не ожиданно если чекед нужно исправить и она ожидаема то с ангед наоборот");
        fileWriter.write("4.Трю катрч и разказывал ранее а вот финал ставится в конце катч" +
                "и он сработает обезательно.");
        fileWriter.write("5.Потому что он смотрит с начала и если все сработает дальше он не станет " +
                "идти из за этого нужно уточнять более важные и точные ексептион ив конце просто ексептин чтоб поймал " +
                "другой ексептион  который мы не уточняли");
        fileWriter.close();
    }
}
