import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] test1 = {19, 100, 136, 17, 20, 25, 1, 2, 7, 3, 200, 4, 1, 3, 4, 4};
        /*MyHeap.pushDown(test1, 11, 0);
        System.out.println(Arrays.toString(test1));
        MyHeap.pushUp(test1, 10);
        System.out.println(Arrays.toString(test1));*/

        MyHeap.heapify(test1);
        System.out.println(Arrays.toString(test1));

        int[] test2 = {6, 2, 56, 1, 6, 8, 6, 2, 8, 3435456};
        MyHeap.heapsort(test2);
        System.out.println(Arrays.toString(test2));

        int[] test3 = {6, 12, 4, 1, 4, 5};
        MyHeap.heapsort(test3);
        System.out.println(Arrays.toString(test3));

        int[] test4 = {40, 2, 4, 123, 5, 2, 5, 4, 7, -43, 10};
        MyHeap.heapsort(test4);
        System.out.println(Arrays.toString(test4));
    }
}
