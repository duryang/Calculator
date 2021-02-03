package ps.exalt.training.gor;

import java.util.Scanner;

public class Repl {

    public static void run() {
        while (true) {
            System.out.print("-> ");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();

            try {
                MathExpression expression = MathExpression.parse(line);
                System.out.printf("result: %.7f \n", expression.calculate());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
