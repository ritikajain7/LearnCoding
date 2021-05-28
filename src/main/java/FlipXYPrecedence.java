/**
 *
 * You are given a string consisting of the letters x and y, such as xyxxxyxyy. In addition, you have an operation called flip, which changes a single x to y or vice versa.
 *
 * Determine how many times you would need to apply this operation to ensure that all x's come before all y's. In the preceding example, it suffices to flip the second and sixth characters, so you should return 2.
 */
public class FlipXYPrecedence {
    public static void main(String a[]){
        FlipXYPrecedence flip = new FlipXYPrecedence();
        String s = "xyxxxyxyy";
        System.out.println(flipCount(s));
    }
    private static int flipCount(String s){
        int countOfYInFirstHalf = 0;
        int countOfXInSecondHalf= 0;
        for (int i=0;i<s.length();i++){
            if(i<=s.length()/2 && s.charAt(i)=='y'){
                countOfYInFirstHalf++;
            }else if(i>s.length()/2 && s.charAt(i)=='x') {
                countOfXInSecondHalf++;
            }
        }

        return countOfXInSecondHalf+countOfYInFirstHalf;
    }
}
