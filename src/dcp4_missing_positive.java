import java.util.ArrayList;

public class dcp4_missing_positive {

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(4);
        arr1.add(-1);
        arr1.add(1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(5);

        int minPos = 1000;

        for (int i : arr2) {
            if (i > 0 && i < minPos) {
                minPos = i;
            }
        }
        System.out.printf("minimum positive int in list is %d \n", minPos);

        while (arr2.contains(minPos)) {
            minPos++;
        }
        System.out.printf("Smallest Missing Positive Integer in list is %d", minPos);
    }
}
