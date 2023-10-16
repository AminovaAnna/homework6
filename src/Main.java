public class Main {
    public static void main(String[] args) {
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            } // задача1
        }
        System.out.println();
        {
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
            } // задача2
        }
        System.out.println();
        {
            for (int i = 0; i <= 17; i = i + 2) {
                System.out.println(i);
            }   //задача3
        }
        System.out.println();

        {

            for (int i = 10; i >= -10; i--) {
                System.out.println(i);
            }   //задача4
        }
        System.out.println();
        {
            for (int i = 1904; i <= 2096; i = i + 4) {
                System.out.println(i + " год является високосным");
            }   //задача5
        }
        System.out.println();
        {
            for (int i = 7; i <= 98; i = i + 7) {
                System.out.println(i);
            }   //задача6
        }
        System.out.println();
        {
            for (int i = 1; i <= 512; i = i * 2) {
                System.out.println(i);
            }   //задача7
        }
        System.out.println();
        {
            int accumMoney = 0;
            int monthPay = 29000;
            for (int i = 1; i <= 12; i++) {     //или важно было начать с 0??
                accumMoney = accumMoney + monthPay;
                System.out.println("Месяц " + i + " сумма накоплений равна " + accumMoney + " рублей");
            }       //задача8
        }
        System.out.println();
        {
            int accumMoney = 0;
            int monthPay = 29000;
            for (int i = 1; i <= 12; i++) {     //или важно было начать с 0??
                accumMoney = accumMoney + accumMoney/100;
                accumMoney = accumMoney + monthPay;
                System.out.println("Месяц " + i + " сумма накоплений равна " + accumMoney + " рублей");
            }           //задача9
        }
        System.out.println( );

        {
            int i = 2;
            int result = 0;
            for (int j = 1; j <= 10; j++ ) {
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }           //задача10
        }
    }
}