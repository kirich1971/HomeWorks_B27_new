package inheritance;

public class Animal {

    private String name;
    private String breed;
    private double weight;
    private int  paws;


    public Animal(String name, String breed, double weight, int paws) {
        this.name = name;
        this.breed = breed;
        setWeight(weight);
        setPaws(paws);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        if (weight > 0)     {
            this.weight = weight;
        }
    }

    public double getWeight() {
        return weight;
    }


    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        }
    }

    public void  eat(){
        System.out.println("I ate the food");
    }

    public  void drink() {
        System.out.println("I drink water");
    }


    public static class Pizza {

        private String size;
        private int numberOfToppings;


        public void setSize(String size) {
            if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large") ) {
                this.size = size;
            } else {
                this.size = "";
            }
        }

        public void setNumberOfToppings(int numberOfToppings) {
            if (numberOfToppings >= 0 && numberOfToppings <= 20) {
                this.numberOfToppings = numberOfToppings;
            }
        }

        public String getSize() {
            return size;
        }

        public int getNumberOfToppings() {
            return numberOfToppings;
        }


        public Pizza(String size, int numberOfToppings)   {
            setSize(size);
            if (! this.size.equals("")) {
                setNumberOfToppings(numberOfToppings);
            }
        }


        public double calculatePrice() {
            double finalPrice = 0;
            switch (size) {
                case "small":
                    finalPrice +=4;
                    break;
                case "medium":
                    finalPrice +=6;
                    break;
                case "large":
                    finalPrice +=8;
                    break;
            }
            return finalPrice += numberOfToppings * 0.75;
        }

        @Override
        public String toString() {

            if (this.size.equals("")) {
                return "Not valid pizza size";
            }
            return "inheritance.Animal.Pizza {" +
                    "size='" + size + '\'' +
                    ", numberOfToppings=" + numberOfToppings +
                    ", price=" + calculatePrice() +
                    '}';
        }
    }
}
