import java.util.Scanner;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = input.nextInt();
        System.out.printf("Треугольное числа n = " + SumNum(n) + "\n");
        System.out.printf("Факториал числа n = " + ProdNum(n));

    }

    private static int SumNum(int num) {
        int Triang = 0;
        for (int i = 0; i <= num; i++) {
            Triang += i;
        }
        return Triang;
    }
    private static int ProdNum(int nums) {
        int Prod = 1;
        for (int i = 1; i <= nums; i++) {
            Prod *= i;
        }
        return Prod;
    }

}
