//3) Você faz parte de uma equipe de desenvolvimento de software front-end e precisa criar regex de validações do seguinte formulário.
// O formulário é composto pelos seguintes campos:
//Nome completo; Endereço; CPF; Data de nascimento; CEP; Senha mínimo 8 caracteres, máximo 16 (letra, número e caractere especial).
//Faça um relatório apresentado as regex.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nome = scanner.nextLine();
        System.out.println("Nome válido? " + NomeCompletoValidator.isValid(nome));

        System.out.println("Digite seu endereço:");
        String endereco = scanner.nextLine();
        System.out.println("Endereço válido? " + EnderecoValidator.isValid(endereco));

        System.out.println("Digite seu CPF (formato XXX.XXX.XXX-XX):");
        String cpf = scanner.nextLine();
        System.out.println("CPF válido? " + CpfValidator.isValid(cpf));

        System.out.println("Digite sua data de nascimento (formato DD/MM/AAAA):");
        String dataNascimento = scanner.nextLine();
        System.out.println("Data de nascimento válida? " + DataNascimentoValidator.isValid(dataNascimento));

        System.out.println("Digite seu CEP (formato XXXXX-XXX):");
        String cep = scanner.nextLine();
        System.out.println("CEP válido? " + CepValidator.isValid(cep));

        System.out.println("Digite sua senha (mínimo 8 caracteres, máximo 16, com letra, número e caractere especial):");
        String senha = scanner.nextLine();
        System.out.println("Senha válida? " + SenhaValidator.isValid(senha));

        scanner.close();
    }
}
