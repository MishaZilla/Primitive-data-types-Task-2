public class Main {
    public static void main(String[] args) {

        //Сумма на счету клиента
        int initialAccount = 124;

        //Сумма пополнения счета
        int deposit = 1420;

        //Расчет начисленных бонусов
        int bonus = deposit / 100;

        if (deposit > 1000) {
            System.out.println(initialAccount + deposit + bonus);
        } else {
            System.out.println(initialAccount + deposit);
        }
    }
}