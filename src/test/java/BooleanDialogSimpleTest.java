import training.dialogs.BooleanDialog;
import training.dialogs.Dialog;

public class BooleanDialogSimpleTest {
    public static void main(String[] args) {
        String yesKey = "yes";
        String noKey = "no";
        String title = "Enter the desired answer choice: (%s, %s)".formatted(yesKey, noKey);
        String error = "Wrong input. Try again.";
        Dialog<Boolean> booleanDialog = new BooleanDialog(title, error, yesKey, noKey);
        System.out.println("User's answer: " + booleanDialog.input());
    }
}
