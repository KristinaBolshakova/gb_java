import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//* В калькулятор добавьте возможность отменить последнюю операцию.
public class HW4T3 {
    public static void main(String[] args) {
        ArrayList<Object> arrayCalc = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        arrayCalc.add(input.nextLine());
        System.out.print("Введите действие: ");
        arrayCalc.add(input.nextLine());
        System.out.print("Введите второе число: ");
        arrayCalc.add(input.nextLine());


        System.out.print("Желаете изменить действие? y/n: ");
        String newOp = input.nextLine();
        if (Objects.equals(newOp, "y")){
            System.out.print("Введите другое действие: ");
            arrayCalc.set(1, input.nextLine());
            opCalc(arrayCalc);
        }
        else{
            opCalc(arrayCalc);
        }
    }
    private static void opCalc(ArrayList<Object> array) {
        int num1 = Integer.parseInt((String) array.get(0));
        int num2 = Integer.parseInt((String) array.get(2));
        switch ((String) array.get(1)) {
            case "*" -> {
                int result = num1 * num2;
                array.add(result);
                System.out.print(result);
            }

            case "/" -> {
                if (num2 != 0) {
                    int result = num1 / num2;
                    array.add(result);
                    System.out.print(result);
                }
                else {
                    System.out.print("На ноль делить нельзя\n");
                }
            }
            case "+" -> {
                int result = num1 + num2;
                array.add(result);
                System.out.print(result);
            }
            case "-" -> {
                int result = num1 - num2;
                array.add(result);
                System.out.print(result);
            }
            default -> System.out.print("Неверный ввод");
        }

    }
}

