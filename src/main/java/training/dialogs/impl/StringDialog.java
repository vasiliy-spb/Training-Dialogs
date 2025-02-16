package training.dialogs.impl;

import java.util.function.Function;
import java.util.function.Predicate;

public class StringDialog extends AbstractDialog<String> {
    public StringDialog(String title, String error, Function<String, String> mapper, Predicate<String> validator) {
        super(title, error, mapper, validator);
    }
}
