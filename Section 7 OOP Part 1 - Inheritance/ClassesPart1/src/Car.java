public class Car {
    private String make="Tesla";
    private String model="Model X";
    private String color="Gray";
    private int doors=2;
    private boolean convertible = true;

    public int getMake() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describCar(){
        System.out.println(doors+"-Door "+color+" "+make+" "+model+" "+(convertible?"Convertible" : ""));
    }
}
