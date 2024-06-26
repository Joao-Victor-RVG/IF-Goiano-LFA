import java.util.regex.Pattern;

public class EnderecoValidator {
    private static final String REGEX = "^[A-Za-z0-9À-ÖØ-öø-ÿ,\\.\\s]+$";

    public static boolean isValid(String endereco) {
        return Pattern.matches(REGEX, endereco);
    }
}
