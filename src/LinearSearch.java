/**
 * Created by Priyank Agrawal on 11/10/2016.
 *
 * Time complexity is O(n)
 */
public class LinearSearch {

    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        System.out.println("The index of the searched element is "+search(array, 5));
    }

    static int search(int[] array, int element){
        for(int i=0;i<array.length;i++){
            if(element == array[i])
                return i;
        }
        return -1;
    }

}