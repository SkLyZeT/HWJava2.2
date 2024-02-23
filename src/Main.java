public class Main {
    public static void main(String[] args) {

        int money = 1000;
        if (money >= 1000) {
            int balance = (money / 100);
            int bonus = (money + balance);
            System.out.println("Итоговый счет:" + bonus);
            System.out.println("Бонусные рубли:" + balance);
        } else {
            int balance = (0);
            System.out.println(money);
            System.out.println("Бонусные рубли:" + balance);
        }
    }
}
