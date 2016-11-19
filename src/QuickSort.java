/**
 * Created by Priyank Agrawal on 11/18/2016.
 *
 * Time complexity is O(nlogn)
 */
public class QuickSort {

    public static void main(String[] args){
        int[] array = {8,5,7,1,10,9,2};
        sort(array, 0, array.length-1);
        System.out.println("Sorted array:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void sort(int[] array, int low, int high){
        if(low<high){                                       //base condition
            int pivot = partition(array, low, high);        //all array elements
            sort(array, low, pivot-1);                      //array elements to the left of pivot
            sort(array, pivot+1, high);                     //array elements to the right of pivot
        }
    }

    //this function places the pivot element at its correct position in the array
    //and places smaller elements to left of pivot and larger elements to the right of the pivot
    public static int partition(int[] array, int low, int high){
        int pivot = array[high];            //takes the last element of the array as the pivot element
        int i = low-1;                      //index of the smaller element
        for(int j=low;j<high;j++){
            if(array[j]<=pivot){            //current element is less than or equal to pivot
                i++;
                int temp = array[i];        //swapping the elements
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];              //swap the pivot element with the element in the array it is less than
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;                         //the pivot element is now at a sorted position
    }

}