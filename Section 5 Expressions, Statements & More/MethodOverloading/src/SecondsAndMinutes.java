public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(3634));
        System.out.println(getDurationString(65,45));
    }

    public static String getDurationString(int seconds){
        int hour = (seconds/60)/60;
        int min = (seconds/60)%60;
        int sec = seconds%60;

        return hour+"h "+min+"m "+sec+"s";
    }

    public static String getDurationString(int minutes,int seconds){
        int hour = minutes/60;
        int min = minutes%60;

        return hour+"h "+min+"m "+seconds+"s";
    }
}
