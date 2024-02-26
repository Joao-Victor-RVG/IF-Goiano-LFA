import javax.swing.*;

public class Principal {
    static int[][] transicao = {{0, 1}, {1, 0}};
    static int estadoInicial = 0;
    static int[] aceitacao = {1};

    public static void main(String[] args) {
        String cadeia = JOptionPane.showInputDialog("Digite a cadeia que sera testada");
        int estadoAtual = estadoInicial;
        int posicao = 0;

        while (posicao < cadeia.length()) {
            char elemento = cadeia.charAt(posicao);
            int elementoInt = Integer.parseInt(elemento + "");
            estadoAtual = transicao[estadoAtual][elementoInt];
            posicao++;

            boolean aceita = false;
            for (int i : aceitacao) {
                if (estadoAtual == i) {
                    aceita = true;
                }
            }

            JOptionPane.showMessageDialog(null, (aceita) ? "Aceita" : "Rejeita");
        }
    }
}
