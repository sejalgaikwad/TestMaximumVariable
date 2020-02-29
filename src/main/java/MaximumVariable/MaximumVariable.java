package MaximumVariable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumVariable<E extends Comparable> {
    E[] array;

    public MaximumVariable(E... array) {
        this.array = array;
    }

    public static <E extends Comparable> E testMaximum(E... array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public E testMaximum() {
        return testMaximum(array);
    }
}



