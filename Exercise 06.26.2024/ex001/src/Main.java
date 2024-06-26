import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário uma expressão regular
        System.out.print("Digite a expressão regular: ");
        String regex = scanner.nextLine();

        // Compila a expressão regular
        Pattern pattern = Pattern.compile(regex);

        // Solicita ao usuário um texto para análise
        System.out.print("Digite o texto a ser analisado: ");
        String text = scanner.nextLine();

        // Cria um matcher para o texto utilizando a expressão regular
        Matcher matcher = pattern.matcher(text);

        // Verifica se há correspondências
        boolean found = false;
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group() + " começando em índice " + matcher.start() + " e terminando em índice " + matcher.end());
            found = true;
        }

        if (!found) {
            System.out.println("Nenhuma correspondência encontrada.");
        }

        scanner.close();
    }
}
