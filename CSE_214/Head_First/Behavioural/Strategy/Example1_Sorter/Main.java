package Example1_Sorter;

import java.util.ArrayList;
import java.util.Scanner;

// javac -d out *.java

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            Integer num = sc.nextInt();
            arr.add(num);
        }
        sc.close();

        //First test
        ArraySorter arraySorter = new ArraySorter(new BubbleSort(), arr);
        arraySorter.sortNumbers();
        arraySorter.printNumbers();

        //Second strategy
        arraySorter.setStrategy(new InsertionSort());
        arraySorter.sortNumbers();
        arraySorter.printNumbers();

        //Third strategy
        arraySorter.setStrategy(new MergeSort());
        arraySorter.sortNumbers();
        arraySorter.printNumbers();

    }
}
