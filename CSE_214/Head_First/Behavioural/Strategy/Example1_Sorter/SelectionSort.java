package Example1_Sorter;

import java.util.ArrayList;

public class SelectionSort implements SortStrategy{
    
    @Override 
    public void sort(ArrayList<Integer> arr){
        if (arr == null || arr.size() <= 1) return;
    
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) < arr.get(minIndex)) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element of unsorted section
            if (minIndex != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);
            }
        }
    }
}
