package Example1_Sorter;

import java.util.ArrayList;

public class BubbleSort implements SortStrategy{

    @Override
    public void sort(ArrayList<Integer> arr){
        if (arr == null || arr.size() <= 1) return;
    
        int n = arr.size();
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
