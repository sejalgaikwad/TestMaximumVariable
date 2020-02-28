package MaximumVariable;

public class MaximumVariable {
    public static <E extends Comparable> E maximumVariable(E firstVariable, E secondVariable, E thirdVariable) {
        E maxValue = firstVariable;
        if (secondVariable.compareTo(maxValue) > 0) {
            maxValue = secondVariable;
        }
        if (thirdVariable.compareTo(maxValue) > 0) {
            maxValue = thirdVariable;
        }
        return maxValue;
    }
}