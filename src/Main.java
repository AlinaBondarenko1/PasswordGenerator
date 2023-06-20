import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        int len = 15;
        int inLine = 5;
        for (int i = 0; i < inLine; i++) {
            System.out.println(generateRandomPassword(len));
        }
    }


    public static String generateRandomPassword(int len) {
        // (0-9, a-z, A-Z) + ()_+-=/{}[]!@#$%^&*
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789()_+-=/{}[]!@#$%^&*";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        return sb.toString();
    }
}