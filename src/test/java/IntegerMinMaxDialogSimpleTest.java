import training.dialogs.Dialog;
import training.dialogs.impl.IntegerMinMaxDialog;

import java.util.function.Function;
import java.util.function.Predicate;

public class IntegerMinMaxDialogSimpleTest {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        String title = "Enter number (%s - %s): ".formatted(min, max);
        String error = "Wrong input. Try again.";
        Function<String, Integer> mapper = s -> Integer.parseInt(s.trim().toLowerCase());
        Predicate<Integer> validator = n -> n >= min && n <= max;
        Dialog<Integer> integerDialog = new IntegerMinMaxDialog(title, error, mapper, validator);
        System.out.println("User's answer: " + integerDialog.input());
    }
}
