import training.dialogs.impl.BooleanDialog;
import training.dialogs.Dialog;

import java.util.function.Function;
import java.util.function.Predicate;

public class BooleanDialogSimpleTest {
    public static void main(String[] args) {
        String yesKey = "yes";
        String noKey = "no";
        String title = "Enter the desired answer choice (%s, %s): ".formatted(yesKey, noKey);
        String error = "Wrong input. Try again.";
        Function<String, Boolean> mapper = new Function<String, Boolean>() {
            @Override
            public Boolean apply(String s) {
                s = s.trim().toLowerCase();
                if (s.equals(yesKey)) {
                    return true;
                }
                if (s.equals(noKey)) {
                    return false;
                }
                throw new IllegalArgumentException();
            }
        };
        Predicate<Boolean> validator = b -> true;
        Dialog<Boolean> booleanDialog = new BooleanDialog(title, error, mapper, validator);
        System.out.println("User's answer: " + booleanDialog.input());
    }
}
