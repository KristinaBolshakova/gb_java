import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//К калькулятору из предыдущего дз добавить логирование.

public class HW2T4 {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(HW2Task4.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler file = new FileHandler("Task4log.txt", true);
        logger.addHandler(file);
        file.setFormatter(new SimpleFormatter());
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = input.nextInt();
        System.out.print("Введите действие: ");
        String op = input.next();
        System.out.print("Введите второе число: ");
        double num2 = input.nextInt();
        double result = 0;

        switch (op) {
            case "*" -> result = num1 * num2;

            case "/" -> {
                if (num2 != 0) {
                    result = num1 / num2;
                }
                else {
                    System.out.print("На ноль делить нельзя\n");
                }
            }
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            default -> System.out.print("Неверный ввод");
        }
        System.out.print(result + "\n");
        logger.log(Level.INFO,num1 + " " + op + " " + num2 + " = " + result  + "\n");
        file.close();
    }
}
