package Example1_Sorter;

import java.util.ArrayList;

public class ArraySorter {
    private SortStrategy strategy;
    private ArrayList<Integer> numbers;

    public ArraySorter(SortStrategy strategy, ArrayList<Integer> numbers) {
        this.strategy = strategy;
        this.numbers = numbers;
    }

    public void setStrategy(SortStrategy strategy){
        this.strategy = strategy;
    }

    public void sortNumbers(){
        strategy.sort(numbers);
    }
    
    public void printNumbers(){
        for(Integer num: numbers){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
