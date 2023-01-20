public class Drink {
    private String type;
    private String Size;
    private double price;

    public Drink(String type, String size) {
        this.type = type;
        this.Size = size;
        switch (size.toUpperCase().charAt(0)){
            case 'S'->{
                this.price = 10;
            }
            case 'M'->{
                this.price=20;
            }
            case 'L'->{
                this.price=30;
            }
            default -> {
                this.price=0;
            }
        }
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return Size;
    }

    public double getPrice() {
        return price;
    }
}
