import java.util.Arrays;

public class MyHeap {
    public static void pushDown(int[] data, int size, int index) {
        if (index * 2 + 1 >= size) {
            return; //base case
        } else if (index * 2 + 1 == size - 1) { //case where you have one child
            if (data[index * 2 + 1] > data[index]) { //when child is greater than parent
                int temp = data[index];
                data[index] = data[index * 2 + 1];
                data[index * 2 + 1] = temp; //you can do nothing cuz you only have one child
            }
        } else { //case where you have two children
            if (data[index * 2 + 1] > data[index * 2 + 2]) { //if right is less than left
                if (data[index * 2 + 1] > data[index]) { //and if left is greater than parent
                    int temp = data[index];
                    data[index] = data[index * 2 + 1];
                    data[index * 2 + 1] = temp;
                    pushDown(data, size, index * 2 + 1);
                }
            } else { //if left is less than right
                if (data[index * 2 + 2] > data[index]) {  //and if right is greater than parent
                    int temp = data[index];
                    data[index] = data[index * 2 + 2];
                    data[index * 2 + 2] = temp;
                    pushDown(data, size, index * 2 + 2);
                }
            }
        }
    }
    private static void pushUp(int[] data, int index) {
        if (data[index] > data[(index - 1) / 2]) { //if you are larger than parent
            int temp = data[index];
            data[index] = data[(index - 1) / 2];
            data[(index - 1) / 2] = temp;
            pushUp(data, (index - 1) / 2);
        }
    }

    public static void heapify(int[] data) {
        for (int i = 0; i < data.length; i++) {
            pushUp(data, i);
        }
    }

    public static void heapsort(int[] data) {
        heapify(data);
        for (int size = data.length; size > 0; size--) {
            pushDown(data, size, 0);
            int temp = data[0];
            data[0] = data[size - 1];
            data[size - 1] = temp;
        }
    }
}
