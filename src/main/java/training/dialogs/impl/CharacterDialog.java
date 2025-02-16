package training.dialogs.impl;

import java.util.Set;

public class CharacterDialog extends AbstractDialog<Character> {
    private final Set<Character> keys;

    public CharacterDialog(String title, String errorMessage, Set<Character> keys) {
        super(title, errorMessage);
        this.keys = keys;
    }

    @Override
    protected boolean isValidDataType(String data) {
        return data.trim().length() == 1;
    }

    @Override
    protected Character parseInput(String data) {
        data = data.trim();
        return Character.toLowerCase(data.charAt(0));
    }

    @Override
    protected boolean isValidValue(Character value) {
        return keys.contains(Character.toLowerCase(value));
    }
}
