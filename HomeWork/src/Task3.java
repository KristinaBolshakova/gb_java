import java.util.Scanner;

//Реализовать простой калькулятор
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = input.nextInt();
        System.out.print("Введите действие: ");
        String op = input.next();
        System.out.print("Введите второе число: ");
        int num2 = input.nextInt();
        int result = 0;
        switch (op) {
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            default -> System.out.print("Неверный ввод");
        }
        System.out.print(result);

    }
}
