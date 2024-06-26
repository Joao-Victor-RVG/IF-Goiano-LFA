//2) Resgate os exercícios da aula anterior e realize a implementação no seu analisador,
// apresente no mínimo 2 exemplos de cadeias validas e invalidas para cada questão.

//exercicios da aula anterior

//a-) Alfabeto: 0,1. Cadeias que comecem com 1 e terminem com 0
//
//b-) Alfabeto: 0,1. Contém pelo menos 3 números 1 em qualquer posição
//
//c-) Alfabeto: 0,1. Cadeia com comprimento máximo igual a 5
//
//d-) Alfabeto: 0,1. Cadeia onde toda posição impar é 1


import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite uma cadeia para verificação:");

    while (true) {
        String cadeia = scanner.nextLine();

        if (cadeia.equalsIgnoreCase("sair")) {
            break;
        }

        System.out.println("Cadeia: " + cadeia);
        System.out.println("a) Começa com 1 e termina com 0: " + CadeiaAnalisador.comecaCom1TerminaCom0(cadeia));
        System.out.println("b) Contém pelo menos 3 números 1: " + CadeiaAnalisador.contemPeloMenos3Uns(cadeia));
        System.out.println("c) Comprimento máximo igual a 5: " + CadeiaAnalisador.comprimentoMaximo5(cadeia));
        System.out.println("d) Toda posição ímpar é 1: " + CadeiaAnalisador.posicoesImparesSao1(cadeia));
        System.out.println("Digite outra cadeia ou 'sair' para finalizar:");
    }

    scanner.close();
}
