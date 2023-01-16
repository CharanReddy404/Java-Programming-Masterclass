public class Car {
    public String make="Tesla";
    public String model="Model X";
    public String color="Gray";
    private int doors=2;
    private boolean convertible = true;

    public void describCar(){
        System.out.println(doors+"-Door "+color+" "+make+" "+model+" "+(convertible?"Convertible" : ""));
    }
}
