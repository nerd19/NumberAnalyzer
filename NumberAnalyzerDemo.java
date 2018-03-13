/**
 * @author Nicole Binette
 * 3/7/2018
 * Assignment 5
 */
public class NumberAnalyzerDemo {
    public static void main(String args[]) {
        // Primitive arrays
        int a[] = {0,1,2,3,4};
        double d[] = {0.0, 1.0, 2.0, 3.0, 4.0};
        // Wrapper class arrays
        Integer b[] = new Integer[a.length];
        Double c[] = new Double[d.length];
        // convert primitive arrays to Wraper class arrays
        for (int index = 0; index < b.length; index++) {
            b[index] = a[index];
            c[index] = d[index];
        }
        // create an instance of NumberAnalyzer class
        NumberAnalyzer<Double> g = new NumberAnalyzer<>(c);
        NumberAnalyzer<Integer> f = new NumberAnalyzer<>(b);
        // test methods from NumberAnalyzer class
        System.out.println(g.greatestValue(c));
        System.out.println(g.lowestValue(c));
        System.out.println(g.average(c));
        System.out.println(g.total(c));
        System.out.println(f.greatestValue(b));
        System.out.println(f.lowestValue(b));
        System.out.println(f.average(b));
        System.out.println(f.total(b));
    }
}