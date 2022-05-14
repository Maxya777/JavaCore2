import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(intList);
        filterPlus(intList);
    }

    public static void filterPlus(List<Integer> intList) {
        for (int i : intList) {
            if (i >= 0 && i % 2 == 0) {
                intList.contains(i);
                System.out.println(i);
            }
        }
    }
}
