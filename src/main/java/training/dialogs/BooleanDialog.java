package training.dialogs;

import java.util.Scanner;

public class BooleanDialog implements Dialog<Boolean> {
    private final String title;
    private final String error;
    private final String yesKey;
    private final String noKey;

    public BooleanDialog(String title, String error, String yesKey, String noKey) {
        this.title = title;
        this.error = error;
        this.yesKey = yesKey;
        this.noKey = noKey;
    }

    @Override
    public Boolean input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        while (true) {
            String data = scanner.nextLine();
            if (isCharacterString(data)) {
                String value = data.trim().toLowerCase();
                if (isValidValue(value)) {
                    return value.equals(yesKey);
                }
            }
            System.out.println(error);
        }
    }

    private boolean isValidValue(String value) {
        return value.equals(yesKey) || value.equals(noKey);
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
