package methods;

public class CurrencyConverter {

    public static void main(String[] args) {

        currenceConverter("euro", 100);

        currenceConverter("yen", 50);

        currenceConverter("rupee", 1000);

    }

/*   create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type
1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee
 */

    public static void currenceConverter(String currency, double total ) {

        double amount = 0;
        switch (currency) {
            case "dollar" : amount = total;
                break;
            case  "euro" : amount = total * 0.91;
                break;
            case "yen" : amount = total * 121.03;
                break;
            case "lira" : amount = total * 14.85;
                break;
            case "won" : amount = total * 1217.52;
                break;
            case "rupee" : amount = total * 181.45;
                break;
            default: amount = -1;
        }
        System.out.println(amount != -1 ? amount : "Invalid currency");

    }
}
