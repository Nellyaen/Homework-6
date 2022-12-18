public class Main {
    public static void main(String[] args) {
        //task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //task 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //task 3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        //task 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //task 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " является високосным годом");

        }

        //task 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //task 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        //task 8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }

        //task 9
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений ровна  " + total);
        }
        System.out.println(total);
    }
}







