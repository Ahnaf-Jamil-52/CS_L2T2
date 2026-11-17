package Example1_Sorter;

import java.util.ArrayList;

public class InsertionSort implements SortStrategy{
    @Override
    public void sort(ArrayList<Integer> arr){
        if (arr == null || arr.size() <= 1) return;
    
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;
            
            // Move elements of arr[0..i-1] that are greater than key to one position ahead
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, key);
        }
    }
}
