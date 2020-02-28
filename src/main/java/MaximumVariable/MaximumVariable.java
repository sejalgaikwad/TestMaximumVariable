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

    public Float maximumFloat(Float firstVariable, Float secondVariable, Float thirdVariable) {
        Float maxValue=firstVariable;
        if (secondVariable.compareTo(maxValue) > 0) {
            maxValue = secondVariable;
        }
        if (thirdVariable.compareTo(maxValue) > 0) {
            maxValue = thirdVariable;
        }
        return maxValue;
    }

    public String maximumString(String firstVariable, String secondVariable, String thirdVariable) {
        String  maxValue=firstVariable;
        if (secondVariable.compareTo(maxValue) > 0) {
            maxValue = secondVariable;
        }
        if (thirdVariable.compareTo(maxValue) > 0) {
            maxValue = thirdVariable;
        }
        return maxValue;
    }
}
