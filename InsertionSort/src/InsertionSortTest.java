import java.util.Random;

public class InsertionSortTest {
    public static void main(String[] args) {
        int[] listToSort = new int[100000];

        Random fill = new Random();
        for(int i = 0; i < listToSort.length; i++) {
            listToSort[i] = fill.nextInt(10000);
        }

        InsertionSort testInsertionSort = new InsertionSort(listToSort);

        testInsertionSort.sortList();
    }
}
