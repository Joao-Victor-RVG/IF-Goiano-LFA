import java.util.regex.Pattern;

public class CpfValidator {
    private static final String REGEX = "^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})$";

    public static boolean isValid(String cpf) {
        return Pattern.matches(REGEX, cpf);
    }
}
