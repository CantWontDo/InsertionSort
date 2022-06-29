
public class InsertionSort {
    int[] listToBeSorted;

    InsertionSort(int[] listToBeSorted) {
        this.listToBeSorted = listToBeSorted;
    }

    public void sortList() {
        for(int i = 0; i < listToBeSorted.length; i++) {
            int sortingIndex = i;
            boolean isSorted = false;
            while(!isSorted) {
                if(sortingIndex > 0) {
                    if (listToBeSorted[sortingIndex] < listToBeSorted[sortingIndex - 1]) {
                        int temp = listToBeSorted[sortingIndex - 1];
                        listToBeSorted[sortingIndex - 1] = listToBeSorted[sortingIndex];
                        listToBeSorted[sortingIndex] = temp;
                    }
                    else if(listToBeSorted[sortingIndex] >= listToBeSorted[sortingIndex - 1]) {
                        isSorted = true;
                    }
                }
                else {
                    isSorted = true;
                }
                sortingIndex--;
            }
        }

        printList();
    }

    public void printList() {
        for(int i = 0; i < listToBeSorted.length; i++) {
            System.out.println(listToBeSorted[i]);
        }
    }
}
