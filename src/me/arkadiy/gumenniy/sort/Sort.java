package me.arkadiy.gumenniy.sort;

/**
 * Abstract class with ability of sorting integer array
 * not interface because of defining a specific role,
 * which should be single role of inheritors
 */
public abstract class Sort {
    /**
     * sorts integer array
     *
     * @param array - array to sort
     */
    public abstract void sort(int[] array);
}
