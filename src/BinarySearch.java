package src;
public class BinarySearch {
    
    public int binarySearch (int[] array, int key) 
    {
        int x = 0;
        int l = 1;
        int r = array.length - 1;

        while (key != array[x] && l <= r) 
        {
            x = (l + r) / 2;
            if (key < array[x]) 
            {
                r = x - 1;
            } else 
            {
                l = x + 1;
            }
        }

        if (key == array[x]) 
        {
            return x;
        } else 
        {
            return -1;
        }
    }
}
