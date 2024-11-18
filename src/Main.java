import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //MAX SPAN

        //public int maxSpan(int[] nums) {
        //
        //        if(nums.length>0 && nums[0] != nums[nums.length-1]){
        //            return nums.length-1;
        //        }else{
        //            return nums.length;
        //        }
        //}

        //FIX 34

        //public int[] fix34(int[] nums) {
        //        int temp = 0;
        //
        //        for(int i = 0; i < nums.length; i++ ){
        //            for(int j = 0; j < nums.length; j++){
        //
        //                if(nums[i] == 4 && nums[j] == 3){
        //
        //                    temp = nums[j+1];
        //                    nums[j+1] = nums[i];
        //                    nums[i] = temp;
        //                }
        //
        //            }
        //        }
        //        return nums;
        //}

        //FIX 45

        //public int[] fix45(int[] nums) {
        //        int temp = 0;
        //
        //        for(int i = 0; i < nums.length - 1; i++){
        //
        //            if(nums[i] == 4 && nums[i + 1] != 5){
        //
        //                while(nums[temp] != 5 || (temp != 0 && nums[temp - 1] == 4) ){
        //                    temp++;
        //                }
        //                nums[temp] = nums[i + 1];
        //                nums[i + 1] = 5;
        //
        //            }
        //
        //        }
        //        return nums;
        //}

        // CAN BALANCE

        //public boolean canBalance(int[] nums) {
        //        int left = 0;
        //        int right = 0;
        //
        //        for (int i = 0, j = nums.length - 1; i <= j;) {
        //            if (left < right) {
        //                left += nums[i++];
        //            } else {
        //                right += nums[j--];
        //            }
        //        }
        //        if(left == right){
        //          return true;
        //        }else{
        //          return false;
        //        }
        //}

        //LINEAR IN

        //public boolean linearIn(int[] outer, int[] inner) {
        //
        //    int i = 0;
        //    int j = 0;
        //    int count = 0;
        //
        //    while(i < outer.length && j < inner.length){
        //      if(outer[i] == inner[j]){
        //        count++;
        //        i++;
        //        j++;
        //      }
        //      else{
        //        i++;
        //      }
        //    }
        //    return count == inner.length;
        //}

        //SQUARE UP

        //public int[] squareUp(int n) {
        //        int[] nums = new int[n*n];
        //        int newN = n;
        //
        //        for (int i = 0; i < n; i++) {
        //            int pos = n*n - i - 1;
        //            for(int j = 0; j < newN; j++){
        //                nums[pos -n * j] = i+1;
        //            }
        //            newN--;
        //        }
        //
        //        return nums;
        //}

        // SERIES UP

        //public int[] seriesUp(int n) {
        //
        //        int[] nums = new int[n*(n + 1)/2];
        //        int index = 0;
        //
        //        for(int i = 1; i <= n; i++){
        //
        //            for(int j = 1; j <= i; j++){
        //                nums[index++] = j;
        //            }
        //        }
        //
        //        return nums;
        //}

        // MAX MIRROR

        //public int maxMirror(int[] nums) {
        //        int n = nums.length;
        //        int countMirror = 0;
        //        int max = 0;
        //
        //        for (int i = 0; i < n; i++){
        //            countMirror = 0;
        //            for(int j = n-1; i + countMirror < n &&  -1 < j; j--){
        //
        //                if(nums[i+countMirror] == nums[j]){
        //                    countMirror++;
        //                }
        //                else{
        //                    if(countMirror > 0){
        //                        max = Math.max(max, countMirror);
        //                        countMirror = 0;
        //                    }
        //                }
        //                max = Math.max(max, countMirror);
        //            }
        //        }
        //        return max;
        //}

        //COUNT CLUMPS

        //public int countClumps(int[] nums) {
        //
        //        int count = 0;
        //
        //        for(int i = 0; i < nums.length - 1; i++){
        //            if (nums[i] == nums[i+1] && (i == 0 || nums[i-1] != nums[i])){
        //                count++;
        //            }
        //        }
        //        return count;
        //}
    }
}