import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите X: ");
        int x = in.nextInt();
        System.out.print("Введите n: ");
        int n = in.nextInt();
        double result = 1;
        if (x == 0 && n < 0) {
            System.out.println("Некорректные данные");
        }
        else {
            if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    result *= x;
                }
            }
            else {
                for (int i = 1; i <= -n; i++) {
                    result /= x;
                }
            }
            System.out.println(result);
        }
    }
}