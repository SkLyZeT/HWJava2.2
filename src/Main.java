public class Main {
    public static void main(String[] args) {
        System.out.println("Итоговый счет:");

        int x = 1000;
        if ( x >= 1000 ) {
            int y = (x / 100);
            int z = (x + y);
            System.out.println(z);
            System.out.println("Бонусные рубли:");
            System.out.println(y);
        } else {
            int y = (0);
            System.out.println( x );
            System.out.println("Бонусные рубли:");
            System.out.println(y);
        }
    }
}
