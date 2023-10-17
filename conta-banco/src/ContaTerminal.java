import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();
        System.out.println();

        System.out.println("Digite o número da sua conta: ");
        int conta = scanner.nextInt();
        System.out.println();

        System.out.println("Digite o seu nome completo (nome e sobrenome): ");
        scanner.nextLine(); 
        String nomeCompleto = scanner.nextLine();

        System.out.println();
        System.out.println("Insira o seu saldo da conta: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println();
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + conta + ", e seu saldo R$ " + saldo + " já está disponível para saque.");
        System.out.println();

    }
}
