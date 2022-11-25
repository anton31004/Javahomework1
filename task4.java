import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество точек: ");
        int countofdot = in.nextInt();
        System.out.print("Радиус окружности: ");
        int radius = in.nextInt();
        int result = 0;
        boolean flag = false;
        double x = 0;
        double y = 0;
        if (countofdot <= 0 || radius <= 0) {
            System.out.print("Некорректные данные");
        } else {
            for (int i = 0; i < countofdot; i++) {
                while (!flag) {
                    System.out.print("Введите x " + (i + 1) + " точку: ");
                    System.out.println();
                    if (!in.hasNextDouble()) {
                        System.out.println("Некорректные данные. Введите вещественное число: ");
                        in.next();
                        continue;
                    }
                    {
                        x = in.nextDouble();
                        break;
                    }
                }
                flag = false;
                while (!flag) {
                    System.out.print("Введите y " + (i + 1) + " точку: ");
                    System.out.println();
                    if (!in.hasNextDouble()) {
                        System.out.println("Некорректные данные. Введите вещественное число: ");
                        in.next();
                        continue;
                    }
                    {
                        y = in.nextDouble();
                        break;
                    }
                }
                if ((x * x) + (y * y) <= radius * radius) {
                    result += 1;
                }


                System.out.print(result);

            }
        }
    }
}

