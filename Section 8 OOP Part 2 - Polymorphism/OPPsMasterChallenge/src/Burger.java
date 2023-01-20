public class Burger {
    private String type;
    private double price;
    private int toppings;

    public Burger(String type) {
        this(type,1);
    }

    public Burger(String type, int toppings) {
        this.type = type;
        switch (type.toUpperCase().charAt(0)){
            case 'N'->{
                this.toppings = 1;
                this.price = 20 + (this.toppings*2);
            }
            case 'C'->{
                this.toppings = toppings <= 3 && toppings>=1 ? toppings : 1;
                this.price = 20 + (this.toppings*2);
            }
            case 'D'->{
                this.toppings = toppings <= 5 && toppings>=1 ? toppings : 3;
                this.price = 50;
            }
            default -> {
                this.toppings = 0;
                this.price= 0;
            }
        }
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getToppings() {
        return toppings;
    }
}
