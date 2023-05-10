import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year) {


        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    public static void findVersion(int clientOS, int clientDeviceYear) {

        if (clientOS == 0) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        } else {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

    }

    public static int daysCalculation(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;

        }
    }


    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        checkYear(year);

    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        int clientOS = scanner.nextInt();
        int clientDeviceYear = scanner.nextInt();

        findVersion(clientOS, clientDeviceYear);


    }

    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        int deliveryDistance = scanner.nextInt();
        if (daysCalculation(deliveryDistance) > 0) {
            System.out.println("Потребуется дней: " + daysCalculation(deliveryDistance));
        } else {
            System.out.println("Доставка невозможна");


        }
    }
}