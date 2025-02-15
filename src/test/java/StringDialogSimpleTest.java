import training.dialogs.Dialog;
import training.dialogs.StringDialog;

import java.util.List;

public class StringDialogSimpleTest {
    public static void main(String[] args) {
        String yesKey = "yes";
        String noKey = "no";
        String maybeKey = "maybe";
        String title = "Enter the desired answer choice: (%s, %s, %s)".formatted(yesKey, noKey, maybeKey);
        String error = "Wrong input. Try again.";
        List<String> keys = List.of(yesKey, noKey, maybeKey);
        Dialog<String> stringDialog = new StringDialog(title, error, keys);
        System.out.println("User's answer: " + stringDialog.input());
    }
}
