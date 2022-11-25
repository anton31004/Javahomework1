import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        int dayresult,  monthresult,  yearresult;
        dayresult = 0;
        monthresult = 0;
        yearresult = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день рождения: ");
        int day = in.nextInt();
        System.out.print("Введите месяц рождения: ");
        int month = in.nextInt();
        System.out.print("Введите год рождения: ");
        int year = in.nextInt();
        if (day>31 || month>12 || year>2022) {
            System.out.print("Некорректные данные");
        } else {
            yearresult = 2022 - year;
            dayresult = 25 - day;
            if (dayresult < 0) {
                month = month - 1;
                dayresult = dayresult + 31;
            }
            monthresult = 11 - month;
            if (monthresult <= 0) {
                year = year - 1;
                monthresult = monthresult + 12;
            }

            System.out.print(yearresult + " лет " + monthresult + " месяцев " + dayresult + " день");

        }



    }}
