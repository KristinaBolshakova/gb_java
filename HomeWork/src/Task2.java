import java.util.ArrayList;
import java.util.Arrays;

//Вывести все простые числа от 1 до 1000
public class Task2 {
    public static void main(String[] args) {
        int num = 1000;
        ArrayList<Integer> NumList = new ArrayList<>();
        for (int i = 2; i < num; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                NumList.add(i);
            }
        }
        System.out.println(NumList);
    }

}

