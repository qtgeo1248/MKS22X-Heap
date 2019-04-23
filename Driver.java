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
    }
}
