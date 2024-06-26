import java.util.Scanner;

public class CadeiaAnalisador {

    // a) Cadeias que comecem com 1 e terminem com 0
    public static boolean comecaCom1TerminaCom0(String cadeia) {
        return cadeia.matches("^1.*0$");
    }

    // b) Contém pelo menos 3 números 1 em qualquer posição
    public static boolean contemPeloMenos3Uns(String cadeia) {
        return cadeia.replaceAll("[^1]", "").length() >= 3;
    }

    // c) Cadeia com comprimento máximo igual a 5
    public static boolean comprimentoMaximo5(String cadeia) {
        return cadeia.length() <= 5;
    }

    // d) Cadeia onde toda posição ímpar é 1
    public static boolean posicoesImparesSao1(String cadeia) {
        for (int i = 0; i < cadeia.length(); i++) {
            if (i % 2 == 0 && cadeia.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
}