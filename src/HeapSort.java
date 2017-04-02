/**
 * Created by Priyank Agrawal on 11/17/2016.
 *
 * Time complexity is O(nlogn)
 */
public class HeapSort {

    public static void main(String[] args){
        int[] array = {5,4,8,1,2,7};
        sort(array);
        System.out.println("Sorted array:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void sort(int[] array){       //time complexity is O(n)
        int n = array.length;
        for(int i=(n/2)-1;i>=0;i--){
            heapify(array, n, i);               //build the heap
        }
        for(int i=n-1;i>=0;i--) {
            int temp = array[0];                //move current root node which is the max element to the end
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);               //call max heapify on the reduced tree
        }
    }

    public static void heapify(int[] array, int n, int i){      //time complexity is O(logn)
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;
        if(left<n && array[left]>array[largest])
            largest = left;
        if(right<n && array[right]>array[largest])
            largest = right;
        if(largest != i){                       //largest is not the root
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, n, largest);         //call max heapify on the affected subtree
        }
    }

}