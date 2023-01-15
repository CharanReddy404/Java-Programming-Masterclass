public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(-2);
        checkNumber(0);
        checkNumber(2);
    }

    public static void checkNumber(int number){
        String result = number > 0 ? "positive" : number<0 ? "negative" : "zero";
        System.out.println(result);
    }
}
