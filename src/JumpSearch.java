/**
 * Created by Priyank Agrawal on 11/14/2016.
 *
 * Time complexity is O(√n)
 *
 * Jump search improves upon linear search (requires sorted array)
 */
public class JumpSearch {

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99};
        int target = 44;
        System.out.print("The index of the searched element is: "+search(array, target));
    }

    public static int search(int[] array, int target){
        int length = array.length;
        int jump = (int)Math.floor(Math.sqrt(length));
        int prev = 0;

        while(array[Math.min(jump,length)-1] < target){
            prev = jump;
            jump += Math.floor(Math.sqrt(length));
            if(prev >= length)
                return -1;
        }

        while(array[prev] < target){
            prev++;
            if(prev == Math.min(jump, length))
                return -1;
        }

        if(array[prev] == target)
            return prev;

        return -1;
    }

}
