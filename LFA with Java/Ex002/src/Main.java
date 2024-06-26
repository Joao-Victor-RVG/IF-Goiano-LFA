import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Pattern p = Pattern.compile(JOptionPane.showInputDialog("DIgite a Regex: ")); // Cria um objeto Pattern com a regex digitada pelo usuário (Pattern é o objeto que vai compilar a regex)
            Matcher m = p.matcher(JOptionPane.showInputDialog("Digite a cadeia para testar")); // Cria um objeto Matcher com a cadeia digitada pelo usuário (Matcher é o objeto que vai fazer a comparação da regex com a cadeia)
            boolean encontrou = false;

            while (m.find()){
                JOptionPane.showMessageDialog(null, "Encontrou o texto " + m.group() + " começando em " + m.start() + " Terminando em " + m.end());
                encontrou = true;
            }
            if(!encontrou){
                JOptionPane.showMessageDialog(null, "Encontrei nada");
            }
        }
    }
}