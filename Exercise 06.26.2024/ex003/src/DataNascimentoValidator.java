import java.util.regex.Pattern;

public class DataNascimentoValidator {
    private static final String REGEX = "^\\d{2}/\\d{2}/\\d{4}$";

    public static boolean isValid(String dataNascimento) {
        return Pattern.matches(REGEX, dataNascimento);
    }
}
