package training.dialogs;

import java.util.List;
import java.util.Scanner;

public class StringDialog implements Dialog<String> {
    private final String title;
    private final String error;
    private final List<String> keys;

    public StringDialog(String title, String error, List<String> keys) {
        this.title = title;
        this.error = error;
        this.keys = keys;
    }

    @Override
    public String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        while (true) {
            String data = scanner.nextLine();
            if (isCharacterString(data)) {
                String value = data.trim().toLowerCase();
                if (contains(value)) {
                    return value;
                }
            }
            System.out.println(error);
        }
    }

    private boolean contains(String value) {
        return keys.contains(value);
    }

    private boolean isCharacterString(String data) {
        for (char ch : data.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }
}
