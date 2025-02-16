import training.dialogs.Dialog;
import training.dialogs.impl.CharacterDialog;

import java.util.HashSet;
import java.util.Set;

public class CharacterDialogSimpleTest {
    public static void main(String[] args) {
        String keyString = "abcdefghijklmnopqrstuvwxyz";
        String title = "Enter one English letter: ";
        String error = "Wrong input. Try again.";
        Set<Character> keySet = createKeySet(keyString);
        Dialog<Character> characterDialog = new CharacterDialog(title, error, keySet);
        System.out.println("User's answer: " + characterDialog.input());
    }

    private static Set<Character> createKeySet(String keyString) {
        Set<Character> keySet = new HashSet<>();
        for (char ch : keyString.toCharArray()) {
            keySet.add(ch);
        }
        return keySet;
    }
}
