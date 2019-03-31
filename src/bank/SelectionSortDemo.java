package bank;

import java.util.Arrays;
import bank.ArrayUtil;
/**
 * Modify the selection sort algorithm to sort an array of integers
 * in descending order.
 */
public class SelectionSortDemo
{
    public static void main(String[] args)
    {
        int[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println(Arrays.toString(a));

        SelectionSorter.sort(a);

        System.out.println(Arrays.toString(a));
    }
}