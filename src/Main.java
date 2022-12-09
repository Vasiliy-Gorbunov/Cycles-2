public class Main {
    public static void main(String[] args) {
        task1();
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
}