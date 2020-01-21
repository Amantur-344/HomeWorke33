package Example;

import java.io.FileWriter;
import java.io.IOException;

public class MainFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("34-List.txt");
        fileWriter.write("1.Различные вещи (цифры) которых обьеденяет что либо" +
                "в основе это перечисление.");
        fileWriter.write("2.ArrayList это тоже самое что и массив только напичкаг он " +
                "различными функциями. Например массив это жигули а ArrayList это более современная" +
                "машина.");
        fileWriter.write("3.Я помойму ответил на этот вопрос ");
        fileWriter.write("4.Это обердки классов...");
        fileWriter.write("5.Ну я скорее роскожу по отдельности так как это почти две разные" +
                "вещи. сет земеняет один массив а это индекс массив которые должны заменить " +
                "а b это замена. А add он просто присваевает значение а это индекс а b это int и String и т.д");
    }
}
