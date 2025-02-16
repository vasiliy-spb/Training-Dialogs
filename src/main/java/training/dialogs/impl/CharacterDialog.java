package training.dialogs.impl;

import java.util.function.Function;
import java.util.function.Predicate;

public class CharacterDialog extends AbstractDialog<Character> {
    public CharacterDialog(String title, String error, Function<String, Character> mapper, Predicate<Character> validator) {
        super(title, error, mapper, validator);
    }
}
