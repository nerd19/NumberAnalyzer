/**
 * @author Nicole Binette
 * 3/7/2018
 * Assignment 5
 */
import java.util.Arrays;
/**
 * A generic class that initializes an Array as a type class of Numbers or type subclass of Numbers
 * Methods include greatestValue, lowestValue, average, total, and newArray
 */
public class NumberAnalyzer<T extends Number> {
    // Array that holds the numbers of type class Numbers or type subclass of Numbers. 
    private T numbers [];
    /**
     * Constructor.
     * Initializes array of type class Numbers or type subclass of Numbers.
     * @param T a[] a generic array
     */
    public NumberAnalyzer(T a[]) {
        // Initialize array (should be the same length as the array passed as argument)
        numbers = newArray(a.length);
        // 
        for (int index = 0; index < a.length; index++) {
            numbers[index] = a[index];
        }
    }
    /**
     * Method finds the greatest value in the Array
     * @param T a[] a generic array
     * @return T greatest value stored in the Array
     */
    public T greatestValue(T a[]) {
        T greatestValue = a[0];
        //int greatestIndex = 0;
        for (int index = 0; index < a.length; index++) {
            if (a[index].doubleValue() > greatestValue.doubleValue()) {
                greatestValue = a[index];
            }
        }
        return greatestValue;
    }
    /**
     * Method finds the lowest value in the Array
     * @param T a[] a generic array
     * @return T lowest value stored in the Array
     */
    public T lowestValue(T a[]) {
        T lowestValue = a[0];
        //int lowestIndex = 0;
        for (int index = 0; index < a.length; index++) {
            if (a[index].doubleValue() < lowestValue.doubleValue()) {
                lowestValue = a[index];
            }
        }
        return lowestValue;
    }
    /**
     * Method calculates the average of all the elements in the Array
     * @param T a[] a generic array
     * @return double average
     */
    public double average(T a[]) {
        double average = 0;
        double total = 0;
        for (int index = 0; index < a.length; index++) {
            total += (Double) a[index].doubleValue();
        }
        return average = (Double) total/a.length;
    }
    /**
     * Method calculates the total of all elements in the Array
     * @param T a[] a generic array
     * @return double total
     */
    public double total(T a[]) {
        double total = 0;
        for (int index = 0; index < a.length; index++) {
            total += (Double) a[index].doubleValue();
        }
        return total;
    }
    /**
     * Method creates a copy of type class Numbers or subclass of Numbers
     */
    @SafeVarargs
    static <T> T[] newArray(int length, T... array)
    {
        return Arrays.copyOf(array, length);
    }
}