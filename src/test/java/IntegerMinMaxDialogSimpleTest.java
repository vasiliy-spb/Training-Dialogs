import training.dialogs.Dialog;
import training.dialogs.impl.IntegerMinMaxDialog;

public class IntegerMinMaxDialogSimpleTest {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        String title = "Enter number (%s - %s): ".formatted(min, max);
        String error = "Wrong input. Try again.";
        Dialog<Integer> integerDialog = new IntegerMinMaxDialog(title, error, min, max);
        System.out.println("User's answer: " + integerDialog.input());
    }
}
