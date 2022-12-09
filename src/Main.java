public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задание 1:");
        int deposit = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + deposit;
            i++;
            System.out.println("Месяц " + i + ". Сумма накоплений равна: " + total + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("\nЗадание 2:");
        int i = 0;
        while (i<10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for (; i > 0 ; i--) {
            System.out.print(i+" ");
        }
    }
}