package customs_classes;



public class CardEmision {

    public static void main(String[] args) {


        DebitCard card1 = new DebitCard(1234_5678_9012_3456L, "James Bond", 100.99);
        System.out.println(card1);


        DebitCard card2 = new DebitCard(1234123412341234L, "Allan Poe", "visa", 1234, 1200.99);
        System.out.println(card2);

        DebitCard card3 = new DebitCard(1234L, "Kirill", "mastercard", 1099, 10.99 );
        System.out.println(card3);



        DebitCard card4 = new DebitCard(1111222233334444L, "Nargiz", "master", 99, 10000.99 );
        System.out.println(card4);



    }
}
