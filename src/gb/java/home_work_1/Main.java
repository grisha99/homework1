package gb.java.home_work_1;

import java.util.Scanner;

public class Main {

    private final byte a = 5;
    private final short b = 15;
    private final int c = 24;
    private final long d = 47;

    private final float e = 3.5f;
    private final double f = 4.82;

    private final boolean isTrue = true;

    private final String myName = "Аноним";

    private static final Scanner scanner = new Scanner(System.in);

    private static void oneTask() {

        int a;
        int b;
        int c;
        int d;

        System.out.println("Подсчет значения по формуле 'a * (b + (c / d))'");
        System.out.println("Введите а:");
        a = scanner.nextInt();
        System.out.println("Введите b:");
        b = scanner.nextInt();
        System.out.println("Введите c:");
        c = scanner.nextInt();
        System.out.println("Введите d:");
        d = scanner.nextInt();
        System.out.println("Результат: " + calcNumber(a,b,c,d));
    }
    private static int calcNumber(int a, int b, int c, int d){

        return a * (b + (c / d));

    }

    private static void twoTask(){
        int a;
        int b;

        System.out.println("Сумма двух чисел должна входить в диапазон от 10 до 20(включительно)");
        System.out.println("Введите а:");
        a = scanner.nextInt();
        System.out.println("Введите b:");
        b = scanner.nextInt();

        System.out.println("Результат: " + calcRange(a,b));
    }

    private static boolean calcRange(int a, int b){
        if (((a + b) >= 10) && ((a + b) <= 20) ) {
            return true;
        } else {
            return false;
        }
    }

    private static void threeTask() {
        long a;

        System.out.println("Проверка знака числа");
        System.out.println("Введите любое число:");
        a = scanner.nextInt();
        printSing(a);
    }

    private static void printSing(long a) {
        String answer = "";

        if (isNegative(a)) {
            answer = "Число отрицательное";
        } else
            answer = "Число положительтное";
        System.out.println("Результат: " + answer);
    }

    private static boolean isNegative(long a){
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void fourTask(){
        String myName = "";

        System.out.println("Вывод привентствия");
        System.out.println("Введите ваше Имя:");
        myName = scanner.next();
        printName(myName);
    }

    private static void printName(String myName){
        System.out.println("Привет, " + myName + "!");
    }

    private static void fiveTask(){
        long myYear;

        System.out.println("Определение високосного года");
        System.out.println("Введите год:");
        myYear = scanner.nextInt();
        if ((myYear % 400) == 0) {
            System.out.println("Год високосный");
        } else if ((myYear % 100) == 0) {
            System.out.println("Год НЕ високосный");
        } else if ((myYear % 4) == 0){
            System.out.println("Год високосный");
        } else
            System.out.println("Год НЕ високосный");

    }


    public static void main(String[] args) {

        int myTask;
        while (true) {
            System.out.println("Введите номер задачи (или нажмите '0 (ноль)' для выхода):");
            System.out.println("1: Подсчет значения по формуле 'a * (b + (c / d))'");
            System.out.println("2: Сумма двух чисел должна входить в диапазон от 10 до 20(включительно)");
            System.out.println("3: Проверка знака числа");
            System.out.println("4: Вывод привентствия");
            System.out.println("5: Определение високосного года");

            myTask = scanner.nextInt();

            if (myTask == 1) {
                oneTask();
            } else if (myTask == 2) {
                twoTask();
            } else if (myTask == 3) {
                threeTask();
            } else if (myTask == 4) {
                fourTask();
            } else if (myTask == 5) {
                fiveTask();
            } else if (myTask == 0) {
                break;
            } else {
                System.out.println("Вы не правильно ввели номер задачи. \nПопробуйте еще раз.");
            }
        }

        scanner.close();
        System.out.println("До свидания.");
    }
}