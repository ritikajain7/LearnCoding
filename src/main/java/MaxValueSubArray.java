import java.util.Arrays;

/**
 * Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.
 *
 * For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:
 *
 * 10 = max(10, 5, 2)
 * 7 = max(5, 2, 7)
 * 8 = max(2, 7, 8)
 * 8 = max(7, 8, 7)
 */
public class MaxValueSubArray {
    public static void main(String a[]){
        int[] array = {10,5,2,7,8,7};
        int k = 3;
        System.out.println(Arrays.toString(maxValueSubArrays(array, k)));
        
    }

    private static int[] maxValueSubArrays(int[] array, int k) {
        int[] maxVal = new int[k+1];
        for(int i=0; i< array.length-k+1;i++){
            System.out.println("iteration:   "+i);
            int counter = 0;
            int maxValLocal = 0;
            while(counter < k){
                if(maxValLocal < array[i+counter]){
                    maxValLocal = array[i+counter];
                }
                counter++;
            }
            maxVal[i] = maxValLocal;

        }
        return maxVal;
    }

}
