import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = in.nextInt();
        System.out.print("Введите месяц: ");
        int month = in.nextInt();
        if (day < 0 || month < 0) {
            System.out.print("Некорректные данные");
        }
        else if (day>29 && month==2){
            System.out.print("Некорректные данные");
        }
        else if (day>30 && month==4 || month==6 || month==9 || month==11){
            System.out.print("Некорректные данные");
        }
        else {

            if (month == 12 || month == 1 || month == 2) {
                System.out.print("Зима");
            }
            if (month == 3 || month == 4 || month == 5) {
                System.out.print("Весна");
            }
            if (month == 6 || month == 7 || month == 8) {
                System.out.print("Лето");
            }
            if (month == 9 || month == 10 || month == 11) {
                System.out.print("Осень");
            }

        }
    }

}

