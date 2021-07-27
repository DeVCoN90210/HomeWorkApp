package lesson2;

public class HomeworkAppL2 {
    public static void main(String[] args) {
    }

    //Задание 1
    public static boolean sumCheck(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 2
    public static void checkInt(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        }
        if (a >= 0) {
            System.out.println("Число положительное");
        }
    }

    //Задание 3
    public static boolean checkInteger(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 4
    public static void cycle(String[] args) {
        for (int a = 0; a < 5; a++) {
            for (int b = 1; b == 1; b++) {
                System.out.println("Здесь должен быть текст");
            }
            System.out.println();
        }
    }
    //Задание 5
    public static boolean checkYear(int year) {
        return ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));
    }
}