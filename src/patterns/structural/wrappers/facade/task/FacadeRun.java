package patterns.structural.wrappers.facade.task;

import java.util.Arrays;

/**
    You'll need to simplify {@link FacadeRun} class's logic.
 */
public class FacadeRun {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{2, 4, 6, 1, 14, 2, -7, 66, 0, -555};
        Double[] doubles = new Double[]{31d, 3d, 5d, 55d, 12d, 47d, 0d, -1d, 125d, -15d};

        Facade.sort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
        System.out.println(Facade.binarySearch(ints, 14, 0, ints.length - 1));

        Facade.sort(doubles, 0, doubles.length -1);
        System.out.println(Arrays.toString(doubles));
        System.out.println(Facade.binarySearch(doubles, 47.0, 0, doubles.length - 1));
    }
}
