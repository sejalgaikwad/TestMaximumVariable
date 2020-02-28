package MaximumVariable;

public class MaximumVariable {
    public Integer maximumInteger(Integer firstVariable, Integer secondVariable, Integer thirdVariable) {
        Integer maxValue=firstVariable;
        if (secondVariable.compareTo(maxValue) > 0) {
            maxValue = secondVariable;
        }
        if (thirdVariable.compareTo(maxValue) > 0) {
            maxValue = thirdVariable;
        }
        return maxValue;
    }
}
