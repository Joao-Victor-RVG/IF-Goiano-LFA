import java.util.regex.Pattern;

public class CepValidator {
    private static final String REGEX = "^\\d{5}-\\d{3}$";

    public static boolean isValid(String cep) {
        return Pattern.matches(REGEX, cep);
    }
}
