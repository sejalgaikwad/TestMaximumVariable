package MaximumVariable;

public class MaximumVariable<E extends Comparable> {
    E firstVariable;
    E secondVariable;
    E thirdVariable;

    public MaximumVariable(E firstVariable, E secondVariable, E thirdVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.thirdVariable = thirdVariable;
    }



    public static <E extends Comparable> E testMaximum(E firstVariable, E secondVariable, E thirdVariable) {

        E maxValue = firstVariable;

        if (secondVariable.compareTo(maxValue) > 0) {
            maxValue = secondVariable;
        }
        if (thirdVariable.compareTo(maxValue) > 0) {
            maxValue = thirdVariable;
        }
        return maxValue;

    }
    public E testMaximum() {
        return testMaximum(firstVariable, secondVariable, thirdVariable);
    }
}


