package training.dialogs.impl;

import java.util.function.Function;
import java.util.function.Predicate;

public class IntegerMinMaxDialog extends AbstractDialog<Integer> {
    public IntegerMinMaxDialog(String title, String error, Function<String, Integer> mapper, Predicate<Integer> validator) {
        super(title, error, mapper, validator);
    }
}
