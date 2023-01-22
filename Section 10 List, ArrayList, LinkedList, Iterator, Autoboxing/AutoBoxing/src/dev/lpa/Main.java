package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15);
        Integer deprecatedBoxing = new Integer(15);
        int unboxed = boxedInt.intValue();

        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());
        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());

        Character[] charArray = {'a','b', 'c','d'};
        System.out.println(Arrays.toString(charArray));

        var outList = List.of(1,2,3,4,5,6);
        System.out.println(outList);
    }

    private static ArrayList<Integer> getList(Integer... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs){
            aList.add(i);
        }
        return aList;
    }

    private static int returnAnInt(Integer i){
        return i;
    }

    private static Integer returnAnInteger(int i){
        return i;
    }

    private static double getDoubleObject(){
        return Double.valueOf(100.0);
    }

    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }
}
