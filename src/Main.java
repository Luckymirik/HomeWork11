import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void checkYear(int year){


        if ((year%4==0&&year%100!=0)||year%400==0)
        {
            System.out.println(year+" год является високосным");
        }else{
            System.out.println(year+" год не является високосным");
        }

    }
    public static void findVersion(int clientOS,int clientDeviceYear){

        if (clientOS==0) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }
        else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }if(clientDeviceYear < 2015){ System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

    }
    public static void daysCalculation(int deliveryDistance){
        int deliveryTime;
        if(deliveryDistance<=20){
            deliveryTime=1;
            System.out.println( "Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance<=60) {
            deliveryTime=2;
            System.out.println( "Потребуется дней: " +deliveryTime);
        } else if (deliveryDistance<=100) {
            deliveryTime=3;
            System.out.println( "Потребуется дней: " + deliveryTime);
        }else{
            System.out.println( "Доставки нет. " );

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
        int clientOS= scanner.nextInt();
        int clientDeviceYear = scanner.nextInt();

        findVersion(clientOS,clientDeviceYear);


    }
    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        daysCalculation(distance);
    }
}