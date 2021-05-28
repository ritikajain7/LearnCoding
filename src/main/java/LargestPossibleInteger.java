import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Given a list of numbers, create an algorithm that arranges them in order to form the largest possible integer. For example, given [10, 7, 76, 415], you should return 77641510.
 */
public class LargestPossibleInteger {


    public static void main(String a[]){
        List numbersList = new ArrayList<String>();
        numbersList.add("10");
        numbersList.add("7");
        numbersList.add("76");
        numbersList.add("415");
        System.out.println(getLargestPossibleInteger(numbersList));
    }

    private static String getLargestPossibleInteger(List<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s, String t) {
                String XY = s+t;
                String YX = t+s;
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
        String numberStr = "";
        for(String s:list){
            numberStr = numberStr+s;
        }
        return numberStr;
    }
}
