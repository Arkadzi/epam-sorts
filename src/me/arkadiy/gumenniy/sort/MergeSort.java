package me.arkadiy.gumenniy.sort;

/**
 * Created by Arkadiy on 20.05.2016.
 */
public class MergeSort implements Sort {

    private int[] tempArray;

    @Override
    public void sort(int[] array) {
        int length = array.length;
        this.tempArray = new int[length];
        doMergeSort(array, 0, length - 1);
    }

    private void doMergeSort(int[] array, int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(array, lowerIndex, middle);
            doMergeSort(array, middle + 1, higherIndex);
            mergeParts(array, lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int[] array, int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempArray[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
}
