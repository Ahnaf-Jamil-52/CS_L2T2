package Example1_Sorter;

import java.util.ArrayList;

public class MergeSort implements SortStrategy{
    
    @Override
    public void sort(ArrayList<Integer> arr){
        if (arr == null || arr.size() <= 1) return;
        mergeSortHelper(arr, 0, arr.size() - 1);
    }

    private void mergeSortHelper(ArrayList<Integer> arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSortHelper(arr, left, mid);
            mergeSortHelper(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private void merge(ArrayList<Integer> arr, int left, int mid, int right) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        int i = left;
        int j = mid + 1;

        while (i <= mid && j <= right) {
            if (arr.get(i) <= arr.get(j)) {
                temp.add(arr.get(i++));
            } else {
                temp.add(arr.get(j++));
            }
        }

        while (i <= mid) {
            temp.add(arr.get(i++));
        }

        while (j <= right) {
            temp.add(arr.get(j++));
        }

        // Copy merged values back to original ArrayList
        for (int k = 0; k < temp.size(); k++) {
            arr.set(left + k, temp.get(k));
        }
    }
}
