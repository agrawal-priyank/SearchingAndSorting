/**
 * Created by Priyank Agrawal on 11/10/2016.
 * <p>
 * * Time complexity is O(log(n)) (requires sorted array)
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9, 10};
        int low = 0;
        int high = array.length - 1;
        int element = 10;
        System.out.println("The index of the searched element is " + binarySearch(array, low, high, element));
    }

    static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

}