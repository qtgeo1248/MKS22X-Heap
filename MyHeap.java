import java.util.Arrays;

public class MyHeap {
    private static void pushDown(int[] data, int size, int index) {
        if (index * 2 + 2 >= size) {
            return; //base case
        } else if (index * 2 + 1 == size - 1) { //case where you have one child
            if (data[index * 2 + 1] > data[index]) { //when child is greater than parent
                int temp = data[index];
                data[index] = data[index * 2 + 1];
                data[index * 2 + 1] = temp; //you can do nothing cuz you only have one child
            }
        } else { //case where you have two children
            if (data[index * 2 + 1] > data[index]) {
                if (data[index * 2 + 2] > data[index * 2 + 1]) {
                    int temp = data[index];
                    data[index] = data[index * 2 + 2];
                    data[index * 2 + 2] = temp;
                    pushDown(data, size, index * 2 + 2);
                } else {
                    int temp = data[index];
                    data[index] = data[index * 2 + 1];
                    data[index * 2 + 1] = temp;
                    pushDown(data, size, index * 2 + 1);
                }
            } else if (data[index * 2 + 2] > data[index]) {

            }
        }
    }
}
