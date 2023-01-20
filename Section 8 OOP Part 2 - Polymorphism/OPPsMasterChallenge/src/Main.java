public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger("Custom",3);
        Drink drink = new Drink("coke","l");
        SideItem sideItem = new SideItem("cookies");

        FastFood order = new FastFood(burger,drink,sideItem);
        order.getBill();
    }
}