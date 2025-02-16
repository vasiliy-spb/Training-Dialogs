import training.dialogs.Dialog;
import training.dialogs.impl.StringDialog;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringDialogSimpleTest {
    public static void main(String[] args) {
        String yesKey = "yes";
        String noKey = "no";
        String maybeKey = "maybe";
        String title = "Enter the desired answer choice (%s, %s, %s): ".formatted(yesKey, noKey, maybeKey);
        String error = "Wrong input. Try again.";
        List<String> keys = List.of(yesKey, noKey, maybeKey);
        Function<String, String> mapper = s -> s.trim().toLowerCase();
        Predicate<String> validator = keys::contains;
        Dialog<String> stringDialog = new StringDialog(title, error, mapper, validator);
        System.out.println("User's answer: " + stringDialog.input());
    }
}
