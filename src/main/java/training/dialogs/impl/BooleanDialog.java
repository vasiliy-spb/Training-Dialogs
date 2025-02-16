package training.dialogs.impl;

import java.util.function.Function;
import java.util.function.Predicate;

public class BooleanDialog extends AbstractDialog<Boolean> {
    public BooleanDialog(String title, String error, Function<String, Boolean> mapper, Predicate<Boolean> validator) {
        super(title, error, mapper, validator);
    }
}
