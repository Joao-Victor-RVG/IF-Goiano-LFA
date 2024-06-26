import java.util.regex.Pattern;

public class SenhaValidator {
    private static final String REGEX = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,16}$";

    public static boolean isValid(String senha) {
        return Pattern.matches(REGEX, senha);
    }
}
