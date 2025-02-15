package training.dialogs;

import java.util.Scanner;

public class IntegerMinMaxDialog implements Dialog<Integer> {
    private final String title;
    private final String error;
    private final int min;
    private final int max;

    public IntegerMinMaxDialog(String title, String error, int min, int max) {
        this.title = title;
        this.error = error;
        this.min = min;
        this.max = max;
    }

    @Override
    public Integer input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        while (true) {
            String data = scanner.nextLine();
            if (isInteger(data)) {
                int value = Integer.parseInt(data);
                if (value >= min && value <= max) {
                    return value;
                }
            }
            System.out.println(error);
        }
    }

    private boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
