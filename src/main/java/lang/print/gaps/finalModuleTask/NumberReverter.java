package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String input = String.valueOf(number);
        int enter = number;
        int output = 0;
        int reminder = 0;
        for (int i = 0; i < input.length(); i++) {
            reminder = enter % 10;
            enter = enter/10;
            output = output*10 + reminder;
        }

        System.out.println(output);
    }
}
