public class SpeedConverter {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        long mph =(long) Math.round(kilometersPerHour/1.609);
        return mph;
    }

    public static void printConversion(double kilometersPerHour){
        long mph = toMilesPerHour(kilometersPerHour);
        if(mph==-1){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour+" km/h = "+mph+" mi/h");
        }
    }
}
