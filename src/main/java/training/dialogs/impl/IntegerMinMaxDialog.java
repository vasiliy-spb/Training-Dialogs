package training.dialogs.impl;

public class IntegerMinMaxDialog extends AbstractDialog<Integer> {
    private final int min;
    private final int max;

    public IntegerMinMaxDialog(String title, String error, int min, int max) {
        super(title, error);
        this.min = min;
        this.max = max;
    }

    @Override
    protected boolean isValidDataType(String data) {
        try {
            Integer.parseInt(data.trim());
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    @Override
    protected Integer parseInput(String data) {
        return Integer.parseInt(data.trim());
    }

    @Override
    protected boolean isValidValue(Integer value) {
        return value >= min && value <= max;
    }
}
