package training.dialogs.impl;

import java.util.List;

public class StringDialog extends AbstractDialog<String> {
    private final List<String> keys;

    public StringDialog(String title, String error, List<String> keys) {
        super(title, error);
        this.keys = keys;
    }

    @Override
    protected boolean isValidDataType(String data) {
        return true;
    }

    @Override
    protected String parseInput(String data) {
        data = data.trim().toLowerCase();
        for (String key : keys) {
            if (data.equalsIgnoreCase(key)) {
                return String.valueOf(key);
            }
        }
        return data;
    }

    @Override
    protected boolean isValidValue(String value) {
        value = value.trim().toLowerCase();
        for (String key : keys) {
            if (value.equalsIgnoreCase(key)) {
                return true;
            }
        }
        return false;
    }
}
