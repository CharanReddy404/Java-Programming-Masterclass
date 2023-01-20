public class FastFood {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public FastFood(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    private double getTotalPrice(){
        return burger.getPrice() + drink.getPrice() + sideItem.getPrice();
    }
    public void getBill(){
        System.out.printf("%s burger with %d toppings price = %.2f%n",burger.getType(), burger.getToppings(),burger.getPrice());
        System.out.printf("%s price = %.2f%n",drink.getType(),drink.getPrice());
        System.out.printf("%s price = %.2f%n",sideItem.getType(),sideItem.getPrice());
        System.out.println("-----------------------------");
        System.out.printf("Total Price:- %.2f",getTotalPrice());
    }
}
