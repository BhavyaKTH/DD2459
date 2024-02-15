package src;

public class Main {
    public static boolean membership (int[] array, int key)
    {
        int arr[] = array;
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        BinarySearch bs = new BinarySearch();

        return (bs.binarySearch(array, key) > -1);
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        MergeSort ob = new MergeSort();
        
        System.out.println("Given array is");
        ob.printArray(arr);
 
        ob.sort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array is");
        ob.printArray(arr);
    }
}
