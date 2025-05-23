import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class test {
    @Test
    @DisplayName("bubbleSort")
    public void test() {
        int[] a = {1, 9, 8, 7, 6, 5, 4, 3, 10, 11};
        int[] expected = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        bubbleSort.bubbleSort(a);
        Assertions.assertArrayEquals(expected, a);
    }

    @Test
    @DisplayName("insertSort")
    public void test02() {
        int[] a = {1, 9, 8, 7, 6, 5, 4, 3, 10, 11};
        int[] b = {};
        int[] c= {1};
        int[] d= {3,2,1};
        insertSort.insertSort(b);
        insertSort.insertSort(a);
        insertSort.insertSort(c);
        insertSort.insertSort(d);

        int[] expected_a = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] expected_b = {};
        int[] expected_c = {1};
        int[] expected_d = {1,2,3};
        Assertions.assertArrayEquals(expected_a, a);
        Assertions.assertArrayEquals(expected_b, b);
        Assertions.assertArrayEquals(expected_c, c);
        Assertions.assertArrayEquals(expected_d, d);

        int[] nums_a = {1, 9, 8, 7, 6, 5, 4, 3, 10, 11};
        int[] nums_b = {};
        int[] nums_c = {1};
        int[] nums_d = {3,2,1};
        insertSort.insertSortRecur(nums_a);
        insertSort.insertSortRecur(nums_b);
        insertSort.insertSortRecur(nums_c);
        insertSort.insertSortRecur(nums_d);

        Assertions.assertArrayEquals(expected_a, nums_a);
        Assertions.assertArrayEquals(expected_b, nums_b);
        Assertions.assertArrayEquals(expected_c, nums_c);
        Assertions.assertArrayEquals(expected_d, nums_d);



    }
}
