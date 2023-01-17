public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
             Student s = new Student("S92300"+i,
                     switch (i){
                         case 1 ->"charan";
                         case 2 ->"charan1";
                         case 3 ->"charan2";
                         case 4 ->"charan3";
                         case 5 ->"charan4";
                         default -> "Anonymous";
                         },
                     "17/01/2023",
             "Java Masterclass");
        }
    }
}