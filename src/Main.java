public class Main {
    public static void main(String[] args) {

        //Сумма на счету клиента
        int Initial_Account = 124;

        //Сумма пополнения счета
        int Deposit = 1420;

        //Расчет начисленных бонусов
        int Bonus = Deposit / 100;

        if (Deposit > 1000) {
            System.out.println(Initial_Account + Deposit + Bonus);
        } else {
            System.out.println(Initial_Account + Deposit);
        }
    }
}