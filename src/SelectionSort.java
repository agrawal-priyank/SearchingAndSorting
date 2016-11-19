/**
 * Created by Priyank Agrawal on 11/17/2016.
 *
 * Time complexity is O(n^2)
 */
public class SelectionSort {

    public static void main(String[] args){
        int[] array = {86,9,8,6,5,4,85,65,23,4,5,1};
        sort(array);
        System.out.println("Sorted array:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static int[] sort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int min_index = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min_index])       //current element is lesser than the current minimum
                    min_index = j;                  //make current element as the current minimum
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;                        //put current minimum in the beginning of the sorted array
        }
    return array;
    }

}