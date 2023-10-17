import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite o número da sua agência: ");
    String agencia = scanner.next();

    System.out.println("Digite o número da sua conta: ");
    int conta = scanner.nextInt();

    System.out.println("Digite o seu nome completo: ");
    String nomeCliente = scanner.next();

    System.out.println("Insira o seu saldo da conta: ");
    scanner.nextLine();
    double saldo = scanner.nextDouble();

    scanner.close();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + conta +", e seu saldo R$ " + saldo + " já está disponível para saque.");



    }
}
