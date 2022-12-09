public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("\nЗадание 3:");
        int population = 12_000_000;
        int bornPer1000 = 17;
        int deathPer1000 = 8;
        for (int i = 1; i <= 10; i++) {
            population = population + (bornPer1000 * population / 1000) - (deathPer1000 * population / 1000);
            System.out.println("Год " + i + " численность населения составляет " + population + " чел.");
        }
    }

    public static void task4() {
        System.out.println("\nЗадание 4:");
        int total = 15000;
        int i = 0;
        while (total < 12_000_000) {
            total = total + total * 7 / 100;
            i++;
            System.out.println("Месяц " + i + ". Сумма накоплений равна: " + total + " рублей.");
        }
    }
}