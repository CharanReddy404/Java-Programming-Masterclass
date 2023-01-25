import java.util.ArrayList;

interface IBag{
    ArrayList<String> inside = new ArrayList<>();
    void openZip();
    void closeZip();
    void setSize(String item);
}
public class InterfaceExample implements IBag{
    public static void main(String[] args) {
        System.out.println(inside);
        InterfaceExample ex = new InterfaceExample();
        ex.openZip();
        ex.closeZip();
        ex.setSize("pen");
        ex.setSize("book");
    }

    @Override
    public void openZip() {
        System.out.println("Zip opened");
    }

    @Override
    public void closeZip() {
        System.out.println("Zip closed");
    }

    @Override
    public void setSize(String item) {
        inside.add(item);
        System.out.println(inside.toString());
    }

}
