package training.dialogs.impl;

import training.dialogs.Dialog;

import java.util.Scanner;

public abstract class AbstractDialog<T> implements Dialog<T> {
    private final String title;
    private final String errorMessage;
    private final Scanner scanner = new Scanner(System.in);

    public AbstractDialog(String title, String errorMessage) {
        this.title = title;
        this.errorMessage = errorMessage;
    }

    @Override
    public T input() {
        System.out.println(title);
        while (true) {
            String data = scanner.nextLine();
            if (isValidDataType(data)) {
                T result = parseInput(data);
                if (isValidValue(result)) {
                    return result;
                }
            }
            System.out.println(errorMessage);
        }
    }

    protected abstract boolean isValidDataType(String data);

    protected abstract T parseInput(String data);

    protected abstract boolean isValidValue(T value);
}
