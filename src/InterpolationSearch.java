/**
 * Created by Priyank Agrawal on 11/13/2016.
 *
 * Time complexity is O(log(log(n))) (if the elements are uniformly distributed)
 *
 * Interpolation search improves upon binary search (requires sorted array)
 */
public class InterpolationSearch {

    public static void main(String[] args){
        int[] array = {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377};
        int target = 89;
        System.out.print("The index of searched element is: "+search(array, target));
    }

    public static int search(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (array[high] != array[low] && array[low] < target && array[high] >= target) {
            mid = low + ((target - array[low]) * (high - low) / (array[high] - array[low]));
            if (target > array[mid])
                low = mid + 1;
            else if (target < array[mid])
                high = mid - 1;
            else
                return mid;
        }
        if (array[low] == target) {
            return low;
        } else {
            return -1;
        }
    }
}
