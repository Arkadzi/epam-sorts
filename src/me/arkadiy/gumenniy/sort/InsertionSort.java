package me.arkadiy.gumenniy.sort;

/**
 * Created by Arkadiy on 20.05.2016.
 */
public class InsertionSort implements Sort {

    @Override
    public void sort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
