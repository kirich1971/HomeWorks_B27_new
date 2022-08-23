package incapsulation;

public class MyPizzeria {



        public static void main(String[] args) {

            Pizza pizza1 = new Pizza("small", 5);
            System.out.println(pizza1);

            Pizza pizza2 = new Pizza("large", 8);
            System.out.println(pizza2);

            Pizza pizza3 = new Pizza("large1", 8);
            System.out.println(pizza3);

            Pizza pizza4 = new Pizza("medium", 100);
            System.out.println(pizza4);

            Pizza [] pizzas = {pizza1, pizza2, pizza3, pizza4};

            for (Pizza pizza : pizzas) {
                System.out.println(pizza.getSize());
            }

        }

}
