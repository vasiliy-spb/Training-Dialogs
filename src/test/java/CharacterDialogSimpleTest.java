import training.dialogs.Dialog;
import training.dialogs.impl.CharacterDialog;

import java.util.function.Function;
import java.util.function.Predicate;

public class CharacterDialogSimpleTest {
    public static void main(String[] args) {
        String keyString = "abcdefghijklmnopqrstuvwxyz";
        String title = "Enter one English letter: ";
        String error = "Wrong input. Try again.";
        Function<String, Character> mapper = new Function<String, Character>() {
            @Override
            public Character apply(String s) {
                s = s.trim().toLowerCase();
                if (s.length() != 1) {
                    throw new IllegalArgumentException();
                }
                return s.charAt(0);
            }
        };
        Predicate<Character> validator = c -> keyString.indexOf(c) >= 0;
        Dialog<Character> characterDialog = new CharacterDialog(title, error, mapper, validator);
        System.out.println("User's answer: " + characterDialog.input());
    }
}
