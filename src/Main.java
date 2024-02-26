public class Main {
    public static void main(String[] args) {

        // zadanie 1 + 2

        byte clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

        // zadanie 3

        int year = 2021;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        // zadanie 4

        byte deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуются сутки");
        }
        if (deliveryDistance >20 && deliveryDistance <=60) {
            System.out.println("Потребуется 2 дня");
        }
        if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Потребуеться 3 дня");
        }
        else if (deliveryDistance > 100) {
            System.out.println("Доставка невозможна");
        }

        // zadanie 5

        byte monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяцы не существует");
        }


    }
}