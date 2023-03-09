import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

//        for (int count = 1; count <= 9; count++) {
//            for (int count2 = 1; count2 <= 9; count2++) {
//                system.out.println(count + " x " + count2 + " = " + (count * count2));
//                if (count == 9) {
//                    system.out.println();
//                }
//
//            }
//            system.out.println();
//        }

        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= 9; i++) {
                int sum = j * i;
                System.out.print(i + " x " + j + " = " + sum + "   ");
                if (sum < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


// до 60 в городе
// до 90 населенные пункты
// до 110 магистрали
// нарушения 1 2 4 8 16 32