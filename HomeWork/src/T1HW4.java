import java.util.LinkedList;
import java.util.Scanner;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class T1HW4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Введите элемент: ");
            int numElem = input.nextInt();
            list.add(numElem);
        }
        System.out.println(list);

        int temp = 0;
        while (temp != num - 1) {
            list.add(num - temp, list.getFirst());
            list.removeFirst();
            temp++;
        }
        System.out.println(list);

    }


}
