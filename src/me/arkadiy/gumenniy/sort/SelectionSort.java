package me.arkadiy.gumenniy.sort;

/**
 * Created by Arkadiy on 20.05.2016.
 */
public class SelectionSort implements Sort {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;

            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }
}
