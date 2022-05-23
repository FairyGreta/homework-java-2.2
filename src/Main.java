public class Main {
    public static void main(String[] args) {

        int account = 100; // начальный счёт
        int x = 2000; // сумма пополнения

        int bonus;
        if (x > 1_000) {
            bonus = x * 1 / 100; // бонус = по одному рублю за каждые 100 рублей
        } else {
            bonus = 0;
        }

        int totalAccount = account + x + bonus;
        System.out.println("Итоговая сумма: " + totalAccount + ", из них бонус " + bonus);
    }
}
