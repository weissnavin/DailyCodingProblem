public class Solution {
    /*
    Given an array of integers, return a new array such that each element at index i
    of the new array is the product of all the numbers in the original array except the one at i.
     */
    public static int[] arrMult(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int tempRes = 1;
            for (int j = 0; j < i; j++) {
                tempRes *= arr[j];
            }
            for (int j = arr.length - 1; j > i; j--) {
                tempRes *= arr[j];
            }
            ans[i] = tempRes;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        int[] res = arrMult(data);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
