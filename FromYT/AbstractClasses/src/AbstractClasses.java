
abstract class Bus{
    String color="Blue";

    public void move(){
        System.out.println("Moving");
    }

    public abstract void brake();
}

class Charan extends Bus{
    public void brake(){
        System.out.println("Brake");
    }
}


public class AbstractClasses {
    public static void main(String[] args) {
        Charan bus = new Charan() ;
        bus.move();
        bus.brake();
        System.out.println(bus.color);
    }
}
