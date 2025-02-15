package training.dialogs.impl;

public class BooleanDialog extends AbstractDialog<Boolean> {
    private final String yesKey;
    private final String noKey;

    public BooleanDialog(String title, String error, String yesKey, String noKey) {
        super(title, error);
        this.yesKey = yesKey;
        this.noKey = noKey;
    }

    @Override
    protected boolean isValidDataType(String data) {
        data = data.trim().toLowerCase();
        return yesKey.equalsIgnoreCase(data) || noKey.equalsIgnoreCase(data);
    }

    @Override
    protected Boolean parseInput(String data) {
        return data.trim().toLowerCase().equalsIgnoreCase(yesKey);
    }

    @Override
    protected boolean isValidValue(Boolean value) {
        return true;
    }
}
