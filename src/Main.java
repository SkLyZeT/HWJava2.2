public class Main {
    public static void main(String[] args) {

        int schet = 1000;
        if (schet >= 1000) {
            int balance = (schet / 100);
            int bonus = (schet + balance);
            System.out.println("Итоговый счет:" + bonus);
            System.out.println("Бонусные рубли:" + balance);
        } else {
            int balance = (0);
            System.out.println(schet);
            System.out.println("Бонусные рубли:" + balance);
        }
    }
}
