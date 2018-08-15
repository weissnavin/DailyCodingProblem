public class DCP4 {

    /*
    Given an array of integers, find the first missing positive integer in linear time and constant space.
    In other words, find the lowest positive integer that does not exist in the array.
    The array can contain duplicates and negative numbers as well.
    For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
     */


    //Assumption: Zero is not positive (I've heard too many math nerds get heated about this to want
    // to debate this. My assumption and I'm sticking too it)
    public static int missingNo(int[] arr) {
        int ans = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0 && arr[i]==ans){
                ans--;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
//        int[] data1 = {1,2,3,4,5};
//        System.out.println(missingNo(data1));
        int[] data = {3,2,1};
        System.out.println(missingNo(data));

    }

}
