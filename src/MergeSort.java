import java.util.Arrays;

/**
 * Created by Priyank Agrawal on 5/11/2017.
 *
 * Time complexity is O(nlogn)
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }

    public void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);            //sort first half
            sort(arr, m + 1, r);      //sort second half
            merge(arr, l, m, r);        //merge both halves
        }
    }

    public void merge(int[] arr, int l, int m, int r) {

        //sizes of both the subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        //temp arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        //copy data to both temp arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArr[i] = arr[m + 1 + i];
        }

        //merge two subarrays
        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        //copy remaining elements into the array
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

}