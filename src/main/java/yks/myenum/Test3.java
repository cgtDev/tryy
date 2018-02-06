package yks.myenum;

/**
 * Created by cgt on 18-1-26.
 */

public class Test3 {
    public enum Weekday1 {
        SUN,MON,TUS,WED,THU,FRI,SAT;
    }
    public static void main(String[] args) {
        System.out.println(Weekday1.valueOf("mon".toUpperCase()));
        //System.out.println(Weekday1.valueOf("mon"));
        //MON

        for (Weekday1 w : Weekday1.values()){
            System.out.println(w + ".ordinal()  ====>" +w.ordinal());
        }
        //SUN.ordinal()  ====>0
        //MON.ordinal()  ====>1
        //TUS.ordinal()  ====>2
        //WED.ordinal()  ====>3
        //THU.ordinal()  ====>4
        //FRI.ordinal()  ====>5
        //SAT.ordinal()  ====>6

        System.out.println("Weekday.MON.compareTo(Weekday.FRI) ===> " + Weekday1.MON.compareTo(Weekday1.FRI));
        System.out.println("Weekday.MON.compareTo(Weekday.MON) ===> " + Weekday1.MON.compareTo(Weekday1.MON));
        System.out.println("Weekday.MON.compareTo(Weekday.SUM) ===> " + Weekday1.MON.compareTo(Weekday1.SUN));
        //Weekday.MON.compareTo(Weekday.FRI) ===> -4
        //Weekday.MON.compareTo(Weekday.MON) ===> 0
        //Weekday.MON.compareTo(Weekday.SUM) ===> 1

        System.out.println("Weekday.MON.name() ====> " + Weekday1.MON.name());
        //Weekday.MON.name() ====> MON

    }
}
