import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class HW3T2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int num = input.nextInt();
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            array.add(randomNum.nextInt(0, 10));
        }
        System.out.println("Произвольный список целых чисел: " + array);
        array.removeIf(number -> number % 2 == 0);
        System.out.println("Список нечетных чисел: " + array);
    }

}
