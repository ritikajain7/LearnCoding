public class SmallestDistanceBetweenWords {
    public static void main(String a[]){
        String str = "dog cat hello cat dog dog hello cat world";
        String word1= "hello";
        String word2 = "world";
        System.out.println(getDistanceBetweenWords(str, word1, word2));

         str = "hello hello a b c d world hello d world";
         word1= "hello1";
         word2 = "world";

        System.out.println(getDistanceBetweenWords(str, word1, word2));

    }

    private static int getDistanceBetweenWords(String str, String word1, String word2) {
        int distance = Integer.MAX_VALUE;
        int word1Idx = -1;
        int word2Idx = -1;
        int distanceLocal = -1;
        String[] wordsArr = str.split(" ");
        for (int i = 0; i<wordsArr.length;i++){
            distanceLocal = -1;
            if(wordsArr[i].equalsIgnoreCase(word1)){
                word1Idx = i;
            }
            else if(wordsArr[i].equalsIgnoreCase(word2) && word1Idx !=-1){
                word2Idx = i;
                distanceLocal = word2Idx-word1Idx-1;
                word1Idx=-1;
                word2Idx=-1;
            }
//            System.out.println("dist:  "+distanceLocal);
            if(distance > distanceLocal && distanceLocal != -1){
                distance = distanceLocal;
            }
        }
        return distance;
    }
}
