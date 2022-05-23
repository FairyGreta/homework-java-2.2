public class Main {
    public static void main(String[] args) {

        int account = 100; // начальный счёт
        int money = 2000; // сумма пополнения

        int bonus;
        if (money > 1_000) {
            bonus = money * 1 / 100; // бонус = по одному рублю за каждые 100 рублей
        } else {
            bonus = 0;
        }

        int totalAccount = account + money + bonus;
        System.out.println("Итоговая сумма: " + totalAccount + ", из них бонус " + bonus);
    }
}
