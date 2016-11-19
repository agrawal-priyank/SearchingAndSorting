/**
 * Created by Priyank Agrawal on 11/14/2016.
 *
 * Time complexity is O(n^2)
 */
public class BubbleSort {

    public static void main(String[] args){
        int[] array = {1,9,8,6,5,4,85,65,23,4,5,86};
        sort(array);
        System.out.println("Sorted array:");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
    }

    public static int[] sort(int[] array){
        int length = array.length;
        for(int i=0;i<length-1;i++){
            boolean swapped =false;
            for(int j=0;j<length-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)        //if no two elements were swapped by the inner loop means the array is already sorted
                break;
        }
        return array;
    }

}