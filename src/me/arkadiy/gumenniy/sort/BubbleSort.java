package me.arkadiy.gumenniy.sort;

/**
 * Created by Arkadiy on 20.05.2016.
 */
public class BubbleSort implements Sort {

    @Override
    public void sort(int[] array) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swap(i, k, array);
                }
            }
        }
    }

    private void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
