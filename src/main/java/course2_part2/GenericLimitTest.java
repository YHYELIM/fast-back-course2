package course2_part2;

import model2.AverageCulculator;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer [] integers = {1,2,3,4,5};
        Double [] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};

        AverageCulculator<Integer> integerAverageCulculator = new AverageCulculator<>(integers);
          double integerAverage =integerAverageCulculator.calculateAverage();
        System.out.println(integerAverage); //3.0

        AverageCulculator<Double> doubleAverageCulculator = new AverageCulculator<>(doubles);
        double doubleAverage = integerAverageCulculator.calculateAverage();
        System.out.println(doubleAverage); //3.0
    }
}
