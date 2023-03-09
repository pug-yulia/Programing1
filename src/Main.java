import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        for (int count2 = 1; count2 <= 9; count2++) {
            for (int count = 1; count <= 9; count++) {
                System.out.println(count2 + " x " + count + " = " + (count * count2));

            }
            System.out.println();
        }
    }
}

// до 60 в городе
// до 90 населенные пункты
// до 110 магистрали
// нарушения 1 2 4 8 16 32