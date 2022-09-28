import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        homeWork1(2011);
        homeWork2(1);
        homeWork3(23);
    }
    public static void homeWork1(int year){
        System.out.println("Задача 1");
        if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
            System.out.println(year + " Год висакосный");
        } else {
            System.out.println(year + " Год не висакосный");
        }
        System.out.println();
            }

    public static int currentYear(){
        int year = LocalDate.now().getYear();
        return year;
    }

    public static void homeWork2 (int clientOS){
        System.out.println("Задача 2");
        int clientDeviceYear = currentYear();
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }

        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }

        System.out.println();
    }

    public static void homeWork3 ( int deliveryDistance ){
        System.out.println("Задача 3");
        var deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = deliveryDays + 1;
            System.out.println("Потребуеться дней : " + deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуеться дней : " + deliveryDays);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 3;
            System.out.println("Потребуеться дней : " + deliveryDays);
        }

        System.out.println();
    }


}
