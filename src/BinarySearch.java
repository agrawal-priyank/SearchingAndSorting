/**
 * Created by Priyank Agrawal on 11/10/2016.
 *
 * * Time complexity is O(log(n)) (requires sorted array)
 */
public class BinarySearch {

    public static void main(String[] args){
        int[] array = {2,3,4,5,6,7,8,9,10};
        int low = 0;
        int high = array.length-1;
        int element = 5;
        System.out.println("The index of the searched element is "+search(array, low, high, element));
    }

    static int search(int[] array, int low, int high, int element) {
        if (low > high)
            return -1;
        else {
            int mid = low+(high-1)/2;
            if (element == array[mid])
                return mid;
            else if (element > array[mid])
                return search(array, mid + 1, high, element);
            else
                return search(array, low, mid - 1, element);
        }
    }

}