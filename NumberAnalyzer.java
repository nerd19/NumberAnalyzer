public class NumberAnalyzer<T extends Number> {
    private T numbers [];
    public NumberAnalyzer(T a[]) {
        for (int index = 0; index < a.length; index++) {
            numbers[index] = a[index];
        }
    }
    public T greatestValue(T a[]) {
        T greatestValue = a[0];
        for (int index = 0; index < a.length; index++) {
            if (a[index] > greatestValue) {
                greatestValue = a[index];
            }
        }
        return greatestValue;
    }
    public T lowestValue(T a[]) {
        T lowestValue = a[0];
        for (int index = 0; index < a.length; index++) {
            if (a[index] < lowestValue) {
                lowestValue = a[index];
            }
        }
    }
    public T average(T a[]) {
        T average;
        for (int index = 0; index < a.length; index++) {
            average = average + a[index];
        }
        return average/a.length;
    }
    public int count(T a[]) {
        int counter = 0;
        for (int index = 0; index < a.length; index++) {
            counter++;
        }
        return counter;
    }
}