import java.util.*;

class BinarySearch {
    public static void main(String[] args) {
        int[] inputArray = new int[7];
        int key = 6, index = 0;
        for(int i=0; i<args.length;i++) {
            inputArray[i] = Integer.parseInt(args[i]);
//            if(i == args.length - 1) {
//                key = Integer.parseInt(args[i]);
//            }
        }
        Arrays.sort(inputArray);
        index = searchElement(key,inputArray);
        if(index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.printf("Element found at index %d upon sorting the array", index);
        }
    }
    
    //This function returns the index of the key in inputArray or returns 1 if the element is not found in the array.
    public static int searchElement(int key, int[] inputArray) {
        int low = 0;
        int high = inputArray.length - 1;
        while (low<=high) {
            int mid = (low + high)/2;
            if(key<inputArray[mid])
                high = mid - 1;
            else if(key>inputArray[mid])
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}