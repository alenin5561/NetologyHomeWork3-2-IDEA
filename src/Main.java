public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 1100;

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int accountBalance = bonus + replenishment + balance;

        System.out.println("Ваш баланс:" + accountBalance);
        System.out.println("Ваши бонусы:" + bonus);
    }
}
