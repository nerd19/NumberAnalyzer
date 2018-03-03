public class NumberAnalyzerDemo {
    public static void main(String args[]) {
        Integer i[] = {1,2,3,4,5};
        Double d[] = {0.0, 1.2, 4.5, 8.0};
        NumberAnalyzer n = new NumberAnalyzer<>(i);
        NumberAnalyzer m = new NumberAnalyzer<>(d);
        System.out.println(greatestValue(n));
        System.out.println(greatestValue(m));
    }
}