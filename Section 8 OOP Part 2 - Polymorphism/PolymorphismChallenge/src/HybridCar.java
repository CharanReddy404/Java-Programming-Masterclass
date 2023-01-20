public class HybridCar extends Car{

    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up, Ready!%n",cylinders);
        System.out.printf("Hybrid -> switch %d KWh battery on, Ready!%n",batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage under the average: %.2f %n", avgKmPerLiter);
//        System.out.printf("Hybrid -> usage exceeds the average: %.2f %n", batterySize);
    }
}
