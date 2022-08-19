package customs_classes;

public class DebitCard {

    // card number (long), holder name (String), card type (String), pin (int), and balance (double)

    static String accountType;

    long cardNumber;
    String holderName;
    String type;
    int pin;
    double balance;



    static {
        accountType = "debit";
    }


//    public static void info() {
//        cardNumber = 0;
//    }


    public DebitCard (long cardNumber, String holderName, double balance) {

        if (isValidCardNumber(cardNumber)) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid Card number");
        }
        this.holderName = holderName;
        this.balance = balance;
     }


    public DebitCard (long cardNumber, String holderName, String type, int pin, double balance) {

        this (cardNumber, holderName, balance);

        if (type.equalsIgnoreCase("visa") || type.equalsIgnoreCase("mastercard")) {
            this.type = type;
        } else {
            System.out.println("Invalid card type");
        }

        if (isPinValid(pin)) {
            this.pin = pin;
        } else {
            System.out.println("Invalid pin");
        }

        System.out.println("Pin-" + pin);
    }


    public boolean isPinValid(int pin) {

        String str = "" + pin;
        return str.length() == 4;
    }


    public boolean isValidCardNumber(long number) {

        String str = "" + number;
        return str.length() == 16;
    }


    @Override
    public String toString() {
        return "DebitCard {" +
                "cardNumber=" + cardNumber +
                ", holderName='" + holderName + '\'' +
                ((type == null) ? "" : ", cardType=" + type) +
                ", balance=" + balance +
                '}';
    }
}
