package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int reminder = number % 10;
            number /= 10;
            result += reminder;
        }
        System.out.println(result);
    }
}
