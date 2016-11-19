/**
 * Created by Priyank Agrawal on 11/17/2016.
 *
 * Time complexity is O(n^2)
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {86, 9, 8, 6, 5, 4, 85, 65, 23, 4, 5, 1};
        sort(array);
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] sort(int[] array){
        for(int i=1;i<array.length;i++){
            int key = array[i];
            int j = i-1;
            while(j>=0 && array[j]>key){
                array[j+1] = array[j];          //previous element is greater than next element then inter change them
                j=j-1;
            }
            array[j+1]=key;
        }
        return array;
    }

}