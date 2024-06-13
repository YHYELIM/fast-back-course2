package model2;

public class AverageCulculator <T extends Number> {
    private T[] numbers;

    public AverageCulculator(T[] numbers) {
        this.numbers = numbers;
    }

    public double calculateAverage() {
        double sum = 0.0;
        for (T number : numbers) {

            sum += number.doubleValue();
        }
        return sum/numbers.length;
    }
}
