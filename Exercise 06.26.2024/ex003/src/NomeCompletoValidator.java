import java.util.regex.Pattern;

public class NomeCompletoValidator {
    private static final String REGEX = "^[A-Za-zÀ-ÖØ-öø-ÿ]+([\\s][A-Za-zÀ-ÖØ-öø-ÿ]+)+$";

    public static boolean isValid(String nome) {
        return Pattern.matches(REGEX, nome);
    }
}
