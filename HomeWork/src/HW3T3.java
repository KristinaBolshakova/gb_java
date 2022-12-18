import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class HW3T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int num = input.nextInt();
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            array.add(randomNum.nextInt(0, 10));
        }
        int Sum = 0;

        for (int i = 0; i < num; i++) {
            Sum += i;
        }
        double ArithMean = (double) Sum / num;
        System.out.println("Целочисленный список: " + array);
        System.out.println("Максимальное число: " + Collections.max(array));
        System.out.println("Минимальное число: " + Collections.min(array));
        System.out.println("Среднее арифметическое: " + ArithMean);



    }

}
